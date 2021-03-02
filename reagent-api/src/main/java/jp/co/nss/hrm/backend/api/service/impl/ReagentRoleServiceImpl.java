package jp.co.nss.hrm.backend.api.service.impl;

import com.github.pagehelper.PageHelper;
import jp.co.nss.hrm.backend.api.dao.ReagentRoleDao;
import jp.co.nss.hrm.backend.api.service.ReagentRoleService;
import jp.co.nss.hrm.backend.mapper.ReagentRoleMapper;
import jp.co.nss.hrm.backend.mapper.ReagentRoleMenuRelationMapper;
import jp.co.nss.hrm.backend.mapper.ReagentRoleResourceRelationMapper;
import jp.co.nss.hrm.backend.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * 后台角色管理Service实现类
 * Created by macro on 2018/9/30.
 */
@Service
public class ReagentRoleServiceImpl implements ReagentRoleService {
    @Autowired
    private ReagentRoleMapper roleMapper;
    @Autowired
    private ReagentRoleMenuRelationMapper roleMenuRelationMapper;
    @Autowired
    private ReagentRoleResourceRelationMapper roleResourceRelationMapper;
    @Autowired
    private ReagentRoleDao roleDao;
    @Override
    public int create(ReagentRole role) {
        role.setCreateTime(new Date());
        role.setAdminCount(0);
        role.setSort(0);
        return roleMapper.insert(role);
    }

    @Override
    public int update(Long id, ReagentRole role) {
        role.setId(id);
        return roleMapper.updateByPrimaryKeySelective(role);
    }

    @Override
    public int delete(List<Long> ids) {
        ReagentRoleExample example = new ReagentRoleExample();
        example.createCriteria().andIdIn(ids);
        int count = roleMapper.deleteByExample(example);
        return count;
    }

    @Override
    public List<ReagentRole> list() {
        return roleMapper.selectByExample(new ReagentRoleExample());
    }

    @Override
    public List<ReagentRole> list(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        ReagentRoleExample example = new ReagentRoleExample();
        if (!StringUtils.isEmpty(keyword)) {
            example.createCriteria().andNameLike("%" + keyword + "%");
        }
        return roleMapper.selectByExample(example);
    }

    @Override
    public List<ReagentMenu> getMenuList(Long adminId) {
        return roleDao.getMenuList(adminId);
    }

    @Override
    public List<ReagentMenu> listMenu(Long roleId) {
        return roleDao.getMenuListByRoleId(roleId);
    }

    @Override
    public List<ReagentResource> listResource(Long roleId) {
        return roleDao.getResourceListByRoleId(roleId);
    }

    @Override
    public int allocMenu(Long roleId, List<Long> menuIds) {
        //先删除原有关系
        ReagentRoleMenuRelationExample example=new ReagentRoleMenuRelationExample();
        example.createCriteria().andRoleIdEqualTo(roleId);
        roleMenuRelationMapper.deleteByExample(example);
        //批量插入新关系
        for (Long menuId : menuIds) {
            ReagentRoleMenuRelation relation = new ReagentRoleMenuRelation();
            relation.setRoleId(roleId);
            relation.setMenuId(menuId);
            roleMenuRelationMapper.insert(relation);
        }
        return menuIds.size();
    }

    @Override
    public int allocResource(Long roleId, List<Long> resourceIds) {
        //先删除原有关系
        ReagentRoleResourceRelationExample example=new ReagentRoleResourceRelationExample();
        example.createCriteria().andRoleIdEqualTo(roleId);
        roleResourceRelationMapper.deleteByExample(example);
        //批量插入新关系
        for (Long resourceId : resourceIds) {
            ReagentRoleResourceRelation relation = new ReagentRoleResourceRelation();
            relation.setRoleId(roleId);
            relation.setResourceId(resourceId);
            roleResourceRelationMapper.insert(relation);
        }
        return resourceIds.size();
    }
}
