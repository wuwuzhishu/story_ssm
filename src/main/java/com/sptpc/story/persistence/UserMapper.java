package com.sptpc.story.persistence;

import org.springframework.stereotype.Repository;

import com.sptpc.story.domain.User;
@Repository
public interface UserMapper {
	int insertUser(User user);

	User queryUserByNameAndPwd(User user);
//	User queryUser(String username,String password);
}
