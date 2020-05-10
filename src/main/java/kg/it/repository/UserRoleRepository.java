package kg.it.repository;

import kg.it.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole ,Long > {
}
