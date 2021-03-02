package jp.co.nss.hrm.backend.api.service.impl;

import com.github.pagehelper.PageHelper;
import jp.co.nss.hrm.backend.api.service.ReagentSupplierService;
import jp.co.nss.hrm.backend.mapper.ReagentSupplierMapper;
import jp.co.nss.hrm.backend.model.ReagentSupplier;
import jp.co.nss.hrm.backend.model.ReagentSupplierExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;


@Service
public class ReagentSupplierServiceImpl implements ReagentSupplierService {

    @Autowired
    private ReagentSupplierMapper supplierMapper;

    /**
     * 获取所有供应商列表
     */
    @Override
    public List<ReagentSupplier> list() {

        return supplierMapper.selectByExample(new ReagentSupplierExample());
    }

    /**
     * 添加供应商
     *
     * @param supplier
     */
    @Override
    public int create(ReagentSupplier supplier) {

        supplier.setCreateTime(new Date());
        return supplierMapper.insert(supplier);
    }

    /**
     * 修改供应商信息
     *
     * @param id
     * @param supplier
     */
    @Override
    public int update(Long id, ReagentSupplier supplier) {
        supplier.setId(id);
        return supplierMapper.updateByPrimaryKeySelective(supplier);
    }

    /**
     * 删除指定用户
     */

    @Override
    public int delete(Long id) {
        int count = supplierMapper.deleteByPrimaryKey(id);
        return count;
    }

    /**
     * 分页获取供应商列表
     *
     * @param keyword
     * @param pageSize
     * @param pageNum
     */
    @Override
    public List<ReagentSupplier> list(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        ReagentSupplierExample example = new ReagentSupplierExample();
        ReagentSupplierExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andSupplierCodeLike("%" + keyword + "%");
            example.or(example.createCriteria().andSupplierNameLike("%" + keyword + "%"));
        }
        return supplierMapper.selectByExample(example);
    }


    @Override
    public ReagentSupplier getItem(Long id) {
        return supplierMapper.selectByPrimaryKey(id);
    }
}
