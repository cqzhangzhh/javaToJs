package com.bfscq.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bfscq.mapper.UserMapper;
import com.bfscq.pojo.User;
import com.bfscq.service.UserService;
import com.bfscq.utils.Md5Util;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper usermapper;

	@Override
	public User findByUserName(String username) {
		User u = usermapper.findByUserName(username);
		return u;
	}

	@Override
	public void register(User user) {
		// 注册操作
		// 加密
		String mdsPassword  = Md5Util.getMD5String(user.getPasswordHash());
		// 注册
		usermapper.add(user,mdsPassword);
		

	}

    @Override
    public User findByUserEmail(String useremail) {

        User u = usermapper.findByUserEmail(useremail);
        return u;

    }

}
