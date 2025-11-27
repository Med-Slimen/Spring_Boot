package com.slimen.users.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.slimen.users.entities.User;
public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
