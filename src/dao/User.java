package dao;

public class User {
	//�����û����ǳ�
	private String userName;
	//�����û�������
	private String userPassWord;
	//���췽����ʼ���û�
	public User(String userName,String userPassWord)
	{
		this.userName = userName;
		this.userPassWord = userPassWord;
	}
	//User���Getters��Setters����
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassWord() {
		return userPassWord;
	}
	public void setUserPassWord(String userPassWord) {
		this.userPassWord = userPassWord;
	}
	
}
