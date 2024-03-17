package com.study.mull.content.entity;

import com.study.mull.member.entity.Member;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class Content{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "content_id")
    private Long contentId;

    @ManyToOne
    @JoinColumn(name="member_id")
    private Member member;

    private String contentCategory;
    private String contentTitle;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime deleteAt;
    private boolean deletedYn;

    @Builder
    public Content(long contentId, Member member, String contentCategory, String contentTitle, String content, LocalDateTime createdAt, LocalDateTime deleteAt, boolean deletedYn) {
        this.contentId = contentId;
        this.member = member;
        this.contentCategory = contentCategory;
        this.contentTitle = contentTitle;
        this.content = content;
        this.createdAt = createdAt;
        this.deleteAt = deleteAt;
        this.deletedYn = deletedYn;
    }
}
