package project.organizer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.organizer.data.User;

public interface UserRepository extends JpaRepository<User, Long> {
     User findUserByEmail(String Email);
}
