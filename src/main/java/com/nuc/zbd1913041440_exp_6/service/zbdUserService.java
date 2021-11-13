package com.nuc.zbd1913041440_exp_6.service;

import com.nuc.zbd1913041440_exp_6.entity.zbdUser;

import java.util.List;

/**
 * @author 朱博达
 */
public interface zbdUserService {
    /**
     * 登录
     * @param userName 用户名
     * @param password 密码
     * @return
     */
    public zbdUser login(String userName, String password);

    /**
     * 注册
     * @param userName 用户名
     * @param password 密码
     * @param status 状态
     * @return
     */
    public Integer register(String userName,String password,Integer status);

    /**
     * 查找所有User对象
     * @return user对象列表
     */
    public List<zbdUser> findAllUsers();

    public boolean addUser(zbdUser zbdUser);

    public Integer delUser(Integer id);

    public Integer setUser(zbdUser zbdUser);

    public List<zbdUser> findUser(String text);
}
