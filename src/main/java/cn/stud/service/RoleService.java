package cn.stud.service;



import cn.stud.entity.Role;

import java.util.List;
import java.util.Map;

public interface RoleService {
    Role getRoleById(Integer id);
    List<Role> findRole(Map<String,Object> map);
    long getTotalRole(Map<String,Object> map);
    int deleteRole(Integer id);
    int addRole(Role role);
    int update (Role role);
}
