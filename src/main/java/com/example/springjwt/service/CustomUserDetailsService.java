package com.example.springjwt.service;

import com.example.springjwt.dto.CustomUserDetails;
import com.example.springjwt.entity.User;
import com.example.springjwt.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User userData = userRepository.findByUsername(username);

        if(userData != null) {
            //UserDetails에 담아 AuthenticationManager가 검증함.
            return new CustomUserDetails(userData);
        }
        return null;
    }
}
