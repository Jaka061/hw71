package kg.it.controller;

import kg.it.entity.User;
import kg.it.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public User create(@RequestBody User user){
        return userService.create(user);
    }

    @GetMapping
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/id/{id}")
    public User getById(@PathVariable Long id) {
        return userService.getById(id);
    }
}
