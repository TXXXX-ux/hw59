package kg.attractor.lesson55lab.dao;

import kg.attractor.lesson55lab.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserDao extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
