package jp.co.nss.hrm.backend.api.service.impl;

import com.github.pagehelper.PageHelper;
import jp.co.nss.hrm.backend.api.dao.ReagentBranchDao;
import jp.co.nss.hrm.backend.api.service.ReagentBranchService;
import jp.co.nss.hrm.backend.mapper.ReagentBranchMapper;
import jp.co.nss.hrm.backend.model.ReagentAdmin;
import jp.co.nss.hrm.backend.model.ReagentAdminExample;
import jp.co.nss.hrm.backend.model.ReagentBranch;
import jp.co.nss.hrm.backend.model.ReagentBranchExample;
import jp.co.nss.hrm.backend.security.util.JwtTokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

@Service
public class ReagentBranchServiceImpl implements ReagentBranchService {

    @Autowired
    private ReagentBranchMapper branchMapper;
    @Autowired
    private ReagentBranchDao branchDao;


    /**
     * 根据科室名称获取列表
     *
     * @param branchName
     */
    @Override
    public List<ReagentBranch> getAllByBranchName(String branchName) {
        return branchDao.getAllByBranchName(branchName);
    }

    /**
     * 获取所有科室列表
     */
    @Override
    public List<ReagentBranch> list() {

        return branchMapper.selectByExample(new ReagentBranchExample());
    }

    /**
     * 添加科室
     *
     * @param branch
     */
    @Override
    public int create(ReagentBranch branch) {

        branch.setCreateTime(new Date());
        return branchMapper.insert(branch);
    }

    /**
     * 修改科室信息
     *
     * @param id
     * @param branch
     */
    @Override
    public int update(Long id, ReagentBranch branch) {
        branch.setId(id);
        return branchMapper.updateByPrimaryKeySelective(branch);
    }

    /**
     * 删除指定用户
     */

    @Override
    public int delete(Long id) {
        int count = branchMapper.deleteByPrimaryKey(id);
        return count;
    }
    /**
     * 分页获取科室列表
     *
     * @param keyword
     * @param pageSize
     * @param pageNum
     */
    @Override
    public List<ReagentBranch> list(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        ReagentBranchExample example = new ReagentBranchExample();
        ReagentBranchExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andBranchCodeLike("%" + keyword + "%");
            example.or(example.createCriteria().andBranchNameLike("%" + keyword + "%"));
        }
        return branchMapper.selectByExample(example);
    }


    @Override
    public ReagentBranch getItem(Long id) {
        return branchMapper.selectByPrimaryKey(id);
    }
}
