package com.study.mull.member.entity;

import com.study.mull.role.entity.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private long member_id;

    @Column(name = "email")
    private String email;

    @Column(name = "location")
    private long location;

    @Column(name = "warning_count")
    private long warning_count;

    @Column(name = "deleted_at")
    private LocalDateTime deleted_at;

    @Column(name = "created_at")
    private LocalDateTime created_at;

    @Column(name = "deleted_yn")
    private Boolean deleted_yn;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role_id;

    @Column(name = "banned")
    private Boolean banned;
}
