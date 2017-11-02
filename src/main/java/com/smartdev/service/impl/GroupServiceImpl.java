package com.smartdev.service.impl;

import com.smartdev.entity.CustomGroup;
import com.smartdev.repository.GroupRepository;
import com.smartdev.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.acl.Group;

/**
 * Created by KAI on 11/2/17.
 */

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupRepository groupRepository;

    @Override
    public CustomGroup getGroupByName(String group) {
        return groupRepository.findByGroupName(group);
    }
}
