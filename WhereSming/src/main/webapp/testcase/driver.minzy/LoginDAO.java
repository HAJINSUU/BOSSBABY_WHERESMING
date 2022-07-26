package com.wheresming.member;



public class LoginDAO {

	public Login selectMember(Login vo) {
		Login loginMember = null;
		
		try {
			loginMember = sqlSession.selectOne("name space 정의",vo);
			// select - commit/rollback 생략
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		
		
		return loginMember;
	}
	
}
