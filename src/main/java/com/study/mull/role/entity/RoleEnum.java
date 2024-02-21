package com.study.mull.role.entity;

import lombok.Getter;

@Getter
public enum RoleEnum {

    USER("ROLE_USER"),
    ADMIN("ROLE_ADMIN");

    private String roleName;

    RoleEnum(String roleName) {
        this.roleName = roleName;
    }

}
