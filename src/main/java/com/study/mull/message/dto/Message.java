package com.study.mull.message.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Message {

    private int messageId;

    private String message;

    private int messageStatus;

    private long memberId;

    private LocalDateTime deletedAt;

    private LocalDateTime createdAt;

    private Boolean deletedYn;
}
