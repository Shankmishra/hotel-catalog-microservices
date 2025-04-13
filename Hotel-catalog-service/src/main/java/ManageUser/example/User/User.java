package ManageUser.example.User;

public class User {
private String user_name;
private String Password;
private String Mid;
private String PhoneNumer;
public String getUser_name() {
	return user_name;
}
public User() {
	
}

public User(String user_name, String password, String mid, String phoneNumer) {
	super();
	this.user_name = user_name;
	Password = password;
	Mid = mid;
	PhoneNumer = phoneNumer;
}

public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getMid() {
	return Mid;
}
public void setMid(String mid) {
	Mid = mid;
}
public String getPhoneNumer() {
	return PhoneNumer;
}
public void setPhoneNumer(String phoneNumer) {
	PhoneNumer = phoneNumer;
}

}
