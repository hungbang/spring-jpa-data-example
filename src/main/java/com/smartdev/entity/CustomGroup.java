package com.smartdev.entity;


import javax.persistence.*;
import java.util.*;

/**
 * Created by KAI on 11/2/17.
 */

@Entity
@Table(name = "custom_group")
public class CustomGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String groupName;

    @OneToMany(mappedBy = "customGroup")
    private List<CustomUser> customUsers = new ArrayList<>();

    public List<CustomUser> getUserList() {
        return customUsers;
    }

    public void setCustomUsers(List<CustomUser> customUsers) {
        this.customUsers = customUsers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
