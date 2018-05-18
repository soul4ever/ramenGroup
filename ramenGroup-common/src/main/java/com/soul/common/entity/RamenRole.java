package com.soul.common.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator on 2018/5/18.
 */
@Entity
public class RamenRole implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(unique = true, nullable = false)
    private String name;

    //角色描述
    private String description;

    //角色与用户的关联关系
    @JsonIgnore
    @ManyToMany(mappedBy = "roles")
    private Set<RamenUser> users = new HashSet<>();

    //角色与权限的关联关系
    @JsonIgnore
    @JoinTable(name = "RamenRolePermission",
            joinColumns = {@JoinColumn(name = "role_id",referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "permissionId",referencedColumnName = "id")})
    @ManyToMany(fetch= FetchType.EAGER)//(cascade = CascadeType.ALL)
    private Set<RamenPermission> permissions = new HashSet<>();

    public RamenRole() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<RamenUser> getUsers() {
        return users;
    }

    public void setUsers(Set<RamenUser> users) {
        this.users = users;
    }

    public Set<RamenPermission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<RamenPermission> permissions) {
        this.permissions = permissions;
    }
}
