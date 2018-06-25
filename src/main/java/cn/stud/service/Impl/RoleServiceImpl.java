package cn.stud.service.Impl;

import cn.stud.dao.RoleMapper;
import cn.stud.entity.Role;
import cn.stud.service.RoleService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

public class RoleServiceImpl implements RoleService {
   @Resource
   private  RoleMapper roleMapper;
    @Override
    public Role getRoleById(Integer id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Role> findRole(Map<String, Object> map) {
        return roleMapper.findRole(map);
    }

    @Override
    public long getTotalRole(Map<String, Object> map) {
        return roleMapper.getTotalRole(map);
    }

    @Override
    public int deleteRole(Integer id) {
        return roleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int addRole(Role role) {
        return roleMapper.addRole(role);
    }

    @Override
    public int update(Role role) {
        return roleMapper.update(role);
    }
}
