package net.safronys.restfulapp.repository;

import net.safronys.restfulapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
