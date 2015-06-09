package net.ismartkorea.restful.dao;

import net.ismartkorea.restful.model.UserInfoVo;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserInfoDaoImpl extends SqlSessionDaoSupport implements UserInfoDao {
	
    public void create(UserInfoVo userInfo) {
    	this.getSqlSession().insert("userinfodao.saveUserInfo", userInfo);
    }
    public UserInfoVo get(String name) {
    	return (UserInfoVo)getSqlSession().selectOne("userinfodao.getUserInfo", name);
    }
    public void delete(String id) {
    	getSqlSession().delete("userinfodao.deleteUserInfo", id);
    }
    public void update(String id, UserInfoVo userInfo) {
    	getSqlSession().update("userinfodao.updateUserInfo", userInfo);
    }

}
