package com.smartdev.model;

import com.smartdev.entity.CustomUser;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

/**
 * Created by KAI on 11/2/17.
 */
public class CurrentUser extends User {

    private CustomUser customUser;

    public CurrentUser(CustomUser customUser) {
        super(customUser.getUserName(), customUser.getPassword(), AuthorityUtils.createAuthorityList(customUser.getCustomGroup().getGroupName()));

    }

    public Integer getId(){
        return customUser.getId();
    }

}
