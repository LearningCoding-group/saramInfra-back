package com.study.mull.message.entity;

import com.study.mull.member.entity.Member;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_id")
    private int message_id;

    @Column(name = "message")
    private String message;

    @Column(name = "message_status")
    private int message_status;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member_id;

    @Column(name = "deleted_at")
    private LocalDateTime deleted_at;

    @Column(name = "created_at")
    private LocalDateTime created_at;

    @Column(name = "deleted_yn")
    private Boolean deleted_yn;
}
