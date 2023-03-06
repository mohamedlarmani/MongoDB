package co.develhope.mongoDb.service;

import co.develhope.mongoDb.entities.User;
import co.develhope.mongoDb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(String userId) {
        userRepository.deleteById(userId);
    }

    public Optional<User> getUserById(String userId){
        return userRepository.findById(userId);
    }
}
