package ManageUser.example.UserModule.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ManageUser.example.UserModule.entities.User;
import ManageUser.example.UserModule.service.UserService;

@RestController
public class UserController {
@Autowired
private UserService user_service;
@GetMapping("/User")
public List<User> getusers() {
	return user_service.getUsers();
	
}

@GetMapping("/User/{usr}")
public User getuser(@PathVariable String mailid) {
	return user_service.getUser(mailid);
}

@PostMapping("/User")
public User addUser(@RequestBody User usr) {
	return user_service.addUser(usr);
}
@PutMapping("/User/{usr}")
public User updateUser(@PathVariable String usr) {
	return user_service.updateUser(usr);
}
@DeleteMapping("/User/{usr}")
public User deleteUser(@PathVariable String mailid){
	return user_service.deleteUser(mailid);
}
	
}
 