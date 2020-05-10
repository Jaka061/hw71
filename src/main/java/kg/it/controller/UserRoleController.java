package kg.it.controller;

import kg.it.entity.UserRole;
import kg.it.model.UserRoleModel;
import kg.it.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user-role")
public class UserRoleController {
    @Autowired
    private UserRoleService userRoleService;

    @GetMapping
    public List<UserRole> getAll(){
        return userRoleService.getAll();
    }

    @PostMapping
    public UserRole create(@RequestBody UserRole userRole){
        return userRoleService.create(userRole);
    }

    @PostMapping
    public UserRole create2(@RequestBody UserRoleModel userRoleModel){
        return userRoleService.create(userRoleModel);
    }
}
