package com.smartdev.repository;

import com.smartdev.entity.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by KAI on 11/2/17.
 */
public interface UserRepository extends JpaRepository<CustomUser, Integer> {

    CustomUser findByUserNameOrPhoneNumber(String username, String phoneNumber);


    CustomUser findByUserName(String username);

}
