package net.ismartkorea.restful.dao;

import net.ismartkorea.restful.model.UserInfoVo;

public interface UserInfoDao {
	
    public void create(UserInfoVo userInfo);
    public UserInfoVo get(String name);
    public void delete(String id);
    public void update(String id, UserInfoVo userInfo);

}
