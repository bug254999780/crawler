package com.free.clawler.user.api.v1;

import com.free.user.model.BaseUser;

public interface IUserApi {
	BaseUser getUser();
	boolean addUser(BaseUser baseUser);
	boolean updateUser(BaseUser baseUser);
	boolean delUser(BaseUser baseUser);
}
