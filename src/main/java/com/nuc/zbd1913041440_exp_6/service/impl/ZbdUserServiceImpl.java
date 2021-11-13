package com.nuc.zbd1913041440_exp_6.service.impl;

import com.nuc.zbd1913041440_exp_6.entity.zbdUser;
import com.nuc.zbd1913041440_exp_6.mapper.zbdUserMapper;
import com.nuc.zbd1913041440_exp_6.service.zbdUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZbdUserServiceImpl implements zbdUserService {

    @Autowired
    zbdUserMapper userMapper;

    @Override
    public zbdUser login(String userName, String password) {
        return userMapper.login(userName,password);
    }

    @Override
    public Integer register(String userName, String password, Integer status) {
        return userMapper.register(userName,password,status);
    }

    @Override
    public List<zbdUser> findAllUsers() {
        return userMapper.findAllUsers();
    }

    @Override
    public boolean addUser(zbdUser zbdUser) {
        return userMapper.addUser(zbdUser);
    }

    @Override
    public Integer delUser(Integer id) {
        return userMapper.delUser(id);
    }

    @Override
    public Integer setUser(zbdUser zbdUser) {
        return userMapper.setUser(zbdUser);
    }

    @Override
    public List<zbdUser> findUser(String text) {
        return userMapper.findUser(text);
    }


}
