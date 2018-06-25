package cn.stud.dao;

import cn.stud.entity.Role;

import java.util.List;
import java.util.Map;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer roleId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer roleId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);


    List<Role> findRole(Map<String,Object> map);
    long getTotalRole(Map<String,Object> map);
    int deleteRole(String id);
    int addRole(Role role);
    int update (Role role);
}