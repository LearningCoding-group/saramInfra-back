package com.study.mull.message.entity;

import com.study.mull.member.entity.Member;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "MESSAGE")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_id")
    private long messageId;

    @Column(name = "message")
    private String message;

    @Column(name = "message_status")
    private int messageStatus;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "deleted_yn")
    private Boolean deletedYn;

    @Builder
    public Message(long messageId,
                   String message,
                   int messageStatus,
                   Member member,
                   LocalDateTime deletedAt,
                   LocalDateTime createdAt,
                   Boolean deletedYn
                   )
    {
        this.messageId = messageId;
        this.message = message;
        this.messageStatus = messageStatus;
        this.member = member;
        this.deletedAt = deletedAt;
        this.createdAt = createdAt;
        this.deletedYn = deletedYn;
    }
}
