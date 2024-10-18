package com.bfscq.service;

import com.bfscq.pojo.User;

public interface UserService {
	// 根据用户名查询用户
	User findByUserName(String username);

    // 根据邮箱查询用户
    User findByUserEmail(String useremail);
    
	// 注册
	void register(User user);

//	// 更新
//	void update(Users user);
//
//	// 更新头像
//	void updateAvatar(String avatarUrl);
//
//	// 更新密码
//	void updatePwd(String newPwd);
}
