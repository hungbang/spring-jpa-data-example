package com.smartdev.repository;

import com.smartdev.entity.CustomGroup;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by KAI on 11/2/17.
 */
public interface GroupRepository extends JpaRepository<CustomGroup, Integer> {

    CustomGroup findByGroupName(String group);
}
