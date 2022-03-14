package com.example.demo.Users;

import java.util.List;





public interface UsersService {
	UsersEntity saveUser(UsersEntity user);
	List<UsersEntity> getAllUser();
	UsersEntity getUserById(long id);
	UsersEntity updateUser(UsersEntity user, long id);
	void deleteUser(long id);

	
	
}
