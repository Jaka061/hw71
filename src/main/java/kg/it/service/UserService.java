package kg.it.service;

import kg.it.entity.User;

import java.util.List;

public interface UserService {
    User create(User user);
    User getById(Long id);
    List<User> getAll();
}
