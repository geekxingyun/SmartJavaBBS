package com.xingyun.smartjavabbs.model.entity;

import lombok.Data;

/**
 * @author qing-feng.zhao
 * @description 会员用户表 t_member_user
 * @date 2019/12/29 10:59
 */
@Data
public class MemberUser {
    /**
     * 主键ID
     */
    private String userId;
    /**
     * 用户登录账号
     */
    private String userAccount;
    /**
     * 用户登录密码
     */
    private String userPassword;
    /**
     * 用户昵称名称
     */
    private String userNikeName;
    /**
     * 用户真实姓名
     */
    private String userRealName;
    /**
     * 用户邮箱
     */
    private String userPhone;
    /**
     * 用户邮箱
     */
    private String userEmail;
    /**
     * 用户QQ
     */
    private String userQQ;
    /**
     * 用户姓名
     */
    private String userSex;
    /**
     * 用户年龄
     */
    private String userAge;
    /**
     * 用户签名
     */
    private String userSignMessage;
    /**
     * 用户GitHub
     */
    private String userGitHub;
    /**
     * 用户博客
     */
    private String userBlog;
    /**
     * 用户微信
     */
    private String userWebChat;
    /**
     * 用户支付宝账号
     */
    private String userAliPay;
    /**
     * 用户邮寄地址外键Id
     */
    private String userAddressId;
}
