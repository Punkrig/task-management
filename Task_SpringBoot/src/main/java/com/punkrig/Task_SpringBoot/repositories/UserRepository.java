package com.punkrig.Task_SpringBoot.repositories;

import com.punkrig.Task_SpringBoot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findFirstByEmail(String username).orElseThrow(()->new UsernameNotFoundException("User not found"));
}
