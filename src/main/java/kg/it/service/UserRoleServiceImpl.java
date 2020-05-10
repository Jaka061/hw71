package kg.it.service;

import kg.it.entity.User;
import kg.it.entity.UserRole;

import kg.it.model.UserRoleModel;
import kg.it.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    private UserRoleRepository userRoleRepository;
    @Autowired
    private UserService userService;
    @Override
    public List<UserRole> getAll() {
        return userRoleRepository.findAll();
    }

    @Override
    public UserRole create(UserRole userRole) {
        return userRoleRepository.save(userRole);
    }

    @Override
    public UserRole create(UserRoleModel userRoleModel) {
        User user = userService.getById(userRoleModel.getUserId());
        if(user == null){ return  null; }
        UserRole userRole = new UserRole();
        userRole.setRoleName(userRole.getRoleName());
        userRole.setUser(userRole.getUser());
        return userRoleRepository.save(userRole);
    }
}
