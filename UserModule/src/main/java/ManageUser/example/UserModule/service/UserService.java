package ManageUser.example.UserModule.service;

import java.util.List;

import ManageUser.example.UserModule.entities.User;

public interface UserService {
	public List<User> getUsers();
	public User getUser(String mailid);
	public User addUser(User usr);
	public User updateUser(String mailid);
	public User deleteUser(String mailid);
}
