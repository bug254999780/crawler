package com.free.clawler.user.api.v1.service;

import com.free.clawler.user.api.v1.IUserApi;
import com.free.user.mapper.BaseUserMapper;
import com.free.user.model.BaseUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserApi {
	@Autowired
	private BaseUserMapper baseUserMapper;
	@Override
	public boolean addUser(BaseUser baseUser) {
		baseUserMapper.insert(baseUser);
		return true;
	}

	@Override
	public boolean delUser(BaseUser baseUser) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BaseUser getUser() {

		return null;
	}

	@Override
	public boolean updateUser(BaseUser baseUser) {
		// TODO Auto-generated method stub
		return false;
	}
}
