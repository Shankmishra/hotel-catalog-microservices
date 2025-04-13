package ManageUser.example.UserModule.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	private String user_name;
	private String user_password;
	@Id
	private String mail_id;
	private String phone_number;
	
	
	public User() {
		super();
	}
	
	public User(String user_name, String user_password, String mail_id, String phone_number) {
		super();
		this.user_name = user_name;
		this.user_password = user_password;
		this.mail_id = mail_id;
		this.phone_number = phone_number;
	}
	
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getMail_id() {
		return mail_id;
	}
	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}
	
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
}
