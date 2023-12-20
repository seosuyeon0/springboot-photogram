package com.cos.photogramstart.domain.user;

import com.cos.photogramstart.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    User findByUsername(String username);

}
