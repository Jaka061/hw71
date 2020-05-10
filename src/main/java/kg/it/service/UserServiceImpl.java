package kg.it.service;

import kg.it.entity.User;
import kg.it.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl<PasswordEncoder> implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }
    @Override
    public User getById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
