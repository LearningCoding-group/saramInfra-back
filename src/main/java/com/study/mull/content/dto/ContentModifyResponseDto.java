package com.study.mull.content.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContentModifyResponseDto {
    private long contentId;
    private long memberId;
    private String contentCategory;
    private String contentTitle;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime deleteAt;
    private boolean deletedYn;
}
