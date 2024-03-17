package com.study.mull.content.entity;

import com.study.mull.member.entity.Member;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Content {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "content_id")
    private long contentId;

    @ManyToOne
    @JoinColumn(name="member_id")
    private Member memberId;

    private String contentCategory;

    private String contentTitle;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime deleteAt;
    private boolean deletedYn;
}
