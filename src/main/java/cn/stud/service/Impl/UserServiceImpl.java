package cn.stud.service.Impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;


import cn.stud.dao.UserDao;
import cn.stud.entity.User;
import cn.stud.service.UserService;
import org.springframework.stereotype.Service;
import util.AntiXssUtil;


@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User login(User user) {
        return userDao.login(user);
    }

    @Override
    public List<User> findUser(Map<String, Object> map) {
        return userDao.findUsers(map);
    }

    @Override
    public int updateUser(User user) {
        //防止有人胡乱修改导致其他人无法正常登陆
        if ("admin".equals(user.getUserName())) {
            return 0;
        }
        user.setUserName(AntiXssUtil.replaceHtmlCode(user.getUserName()));
        return userDao.updateUser(user);
    }

    @Override
    public Long getTotalUser(Map<String, Object> map) {
        return userDao.getTotalUser(map);
    }

    @Override
    public int addUser(User user) {
        if (user.getUserName() == null || user.getPassword() == null || getTotalUser(null) > 90) {
            return 0;
        }
        user.setUserName(AntiXssUtil.replaceHtmlCode(user.getUserName()));
        return userDao.addUser(user);
    }

    @Override
    public int deleteUser(Integer id) {
        //防止有人胡乱修改导致其他人无法正常登陆
        if (2 == id) {
            return 0;
        }
        return userDao.deleteUser(id);
    }

}
