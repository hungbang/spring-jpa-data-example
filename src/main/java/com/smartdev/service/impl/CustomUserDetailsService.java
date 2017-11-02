package com.smartdev.service.impl;

import com.smartdev.entity.CustomUser;
import com.smartdev.model.CurrentUser;
import com.smartdev.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by KAI on 11/2/17.
 */
@Component
public class CustomUserDetailsService implements UserDetailsService {


    @Autowired
    public UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        CustomUser customUser = userRepository.findByUserName(s);
        if(customUser == null)
            throw new UsernameNotFoundException("Username does not exists");
        return new CurrentUser(customUser);
    }

    @Transactional(rollbackFor = Exception.class)
    public void saveCustomUser(CustomUser customUser) {
        userRepository.save(customUser);
    }
}
