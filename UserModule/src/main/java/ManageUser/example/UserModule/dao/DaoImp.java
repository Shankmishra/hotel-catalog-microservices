package ManageUser.example.UserModule.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ManageUser.example.UserModule.entities.User;

public interface DaoImp extends JpaRepository<User, String>{

}
  