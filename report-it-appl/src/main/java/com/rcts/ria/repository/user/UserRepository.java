package com.rcts.ria.repository.user;

import com.rcts.ria.domain.user.principal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByUsername(String username);
    boolean existsByUserId(String userId);

    boolean existsUserByUsername(String username);
}
