package com.board.mij.mapper;


import org.springframework.stereotype.Repository;

import com.board.mij.domain.UserVO;


@Repository("com.board.mij.mapper.UserMapper")
public interface UserMapper {

	// User Register 회원가입 하기
	int userRegister(UserVO user) throws Exception;

	// User 로그인 전, 비밀번호 암호화 해제를 위한 Salt 가져오기
	String userGetSalt(String username) throws Exception;
	
	// User Login 회원 로그인 하기
	String userLogin(UserVO user) throws Exception;

	// User Join 중복 확인
	UserVO userDuplicateCheck(String username) throws Exception;

}
