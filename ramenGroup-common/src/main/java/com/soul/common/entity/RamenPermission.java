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
public class RamenPermission implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String url;

    @Column(columnDefinition="enum('menu','button')")
    private String type; //资源类型 菜单/按钮

    private Integer parentId;//父id

    @JsonIgnore
    @ManyToMany(mappedBy = "permissions")
    private Set<RamenRole> roles = new HashSet<>();

    public RamenPermission() {
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Set<RamenRole> getRoles() {
        return roles;
    }

    public void setRoles(Set<RamenRole> roles) {
        this.roles = roles;
    }
}
