package com.free.clawler.user.api.v1.service;

import com.free.clawler.user.api.v1.IUserApi;
import com.free.dao.user.model.BaseUser;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserApi {
//	@Autowired
//	private BaseUserMapper baseUserMapper;
	@Override
	public boolean addUser(BaseUser baseUser) {
//		int flag=baseUserMapper.insertSelective(baseUser);
//		return  flag>0;
		System.out.printf("test");
		return  true;
	}

	@Override
	public boolean delUser(BaseUser baseUser) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BaseUser getUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateUser(BaseUser baseUser) {
		// TODO Auto-generated method stub
		return false;
	}
}
