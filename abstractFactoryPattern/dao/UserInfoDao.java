package abstractFactoryPattern.dao;

import abstractFactoryPattern.UserInfo;

public interface UserInfoDao {
	UserInfo user = new UserInfo("sky123", "123!", "James");

	public void insertUserInfo(UserInfo userInfo);
	
	public void updateUserInfo(UserInfo userInfo);
	
	public void deleteUserInfo(UserInfo userInfo);
}
