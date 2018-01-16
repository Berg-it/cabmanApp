package tn.bergit.cabman.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.bergit.cabman.bo.User;

/**
 * 
 * @author ABG
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
