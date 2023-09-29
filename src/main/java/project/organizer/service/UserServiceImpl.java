package project.organizer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.organizer.data.User;
import project.organizer.exception.UserNotFoundException;
import project.organizer.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;



    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User getById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
    }

    @Override
    public User getByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }
    @Override
    public User saveOrUpdate(User user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }
}
