package seth.practice.dtojavaguides.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import seth.practice.dtojavaguides.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
