package kg.it.service;

import kg.it.entity.UserRole;
import kg.it.model.UserRoleModel;

import java.util.List;

public interface UserRoleService {
    List<UserRole> getAll();
    UserRole create(UserRole userRole);
    UserRole create(UserRoleModel userRoleModel);

}
