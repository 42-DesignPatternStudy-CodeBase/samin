package abstractFactoryPattern.question;

//DataBase 가 변경될 때 적용될 수 있는 코드 작성하기

public class UserInfo {

	  private String userId;
	  private String passwd;
	  private String userName;
	  
	  public String getUserId() { return userId; }
	  
	  public void setUserId(String userId) { this.userId = userId; }
	  
	  public String getPasswd() { return passwd; }
	  
	  public void setPasswd(String passwd) { this.passwd = passwd; }
	  
	  public String getUserName() { return userName; }
	  
	  public void setUserName(String userName) { this.userName = userName; }
	  
}
