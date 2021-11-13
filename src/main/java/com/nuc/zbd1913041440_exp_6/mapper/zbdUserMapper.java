package com.nuc.zbd1913041440_exp_6.mapper;

import com.nuc.zbd1913041440_exp_6.entity.zbdUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 朱博达
 */
@Mapper
public interface zbdUserMapper {

    /**
     * 登录
     * @param userName 用户名
     * @param password 密码
     * @return 登录成功返回1 否则返回0
     */
    public zbdUser login(String userName, String password);

    /**
     * 注册
     * @param userName 用户名
     * @param password 密码
     * @param status 用户类型
     * @return 注册成功返回1 否则返回0
     *
     */
    public Integer register(String userName,String password,Integer status);

    /**
     * 获取所有用户信息
     * @return
     */
    public List<zbdUser> findAllUsers();

    /**
     * 添加用户
     * @param zbdUser 用户对象
     * @return
     */
    public boolean addUser(zbdUser zbdUser);

    /**
     * 根据Id删除用户信息
     * @param id
     * @return
     */
    public Integer delUser(Integer id);

    /**
     * 修改用户信息
     * @param zbdUser 用户对象
     * @return
     */
    public Integer setUser(zbdUser zbdUser);

    /**
     * 查找用户信息
     * @param text 字段
     * @return
     */
    public List<zbdUser> findUser(String text);
}
