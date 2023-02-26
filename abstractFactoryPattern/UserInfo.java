package abstractFactoryPattern;

public class UserInfo {
	  private String userId;
	  private String passwd;
	  private String userName;

	public UserInfo() {
		  this.userId = "default";
		  this.passwd = "default";
		  this.userName = "default";
	}
	  
	public UserInfo(String userId, String pw, String name) {
		this.userId = userId;
		this.passwd = pw;
		this.userName = name;
	}
	  
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
