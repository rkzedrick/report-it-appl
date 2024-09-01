package com.rcts.ria.service.user.impl;

import com.rcts.ria.domain.user.principal.User;
import com.rcts.ria.exception.domain.EmailExistsException;
import com.rcts.ria.exception.domain.UserNotFoundException;
import com.rcts.ria.exception.domain.UsernameExistsException;
import jakarta.mail.MessagingException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface UserService {
    User register(User user) throws UsernameNotFoundException, UsernameExistsException, EmailExistsException, MessagingException, PersonExistsException, UserNotFoundException;

    User forgotPassword(User user) throws UsernameNotFoundException, MessagingException;

    List<User> getUsers();

    User findUserByUsername(String username);

    User verifyOtpForgotPassword(User newUser) throws PersonExistsException, OtpExistsException;

    boolean verifyOtp(String username, String otp);

}
