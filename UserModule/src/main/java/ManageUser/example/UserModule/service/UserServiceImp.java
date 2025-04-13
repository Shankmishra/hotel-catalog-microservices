package ManageUser.example.UserModule.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ManageUser.example.UserModule.dao.DaoImp;
import ManageUser.example.UserModule.entities.User;
@Service
public class UserServiceImp implements UserService{
   @Autowired
   private DaoImp dao;

@Override
public List<User> getUsers() {	
	return dao.findAll();
}

@Override
public User getUser(String mailid) {
	
	return dao.getById(mailid);
}

@Override
public User addUser(User usr) {
	return dao.save(usr);
}

@Override
public User updateUser(String mailid) {
	return dao.getById(mailid);
}

@Override
public User deleteUser(String mailid) {
	User usr = dao.getById(mailid);
	dao.delete(usr);
	return null;
}
	
}
