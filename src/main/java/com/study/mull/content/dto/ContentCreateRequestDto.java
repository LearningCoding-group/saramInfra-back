package com.study.mull.content.dto;

import com.study.mull.content.entity.Content;
import com.study.mull.member.entity.Member;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContentCreateRequestDto {
    private long contentId;
    private long memberId;
    private String contentCategory;
    private String contentTitle;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime deleteAt;
    private boolean deletedYn;

    public Content.ContentBuilder toContentBuilder(){
        Content.ContentBuilder contentBuilder = Content.builder();

        contentBuilder = contentBuilder
            .contentId(this.contentId)
            //.member.setMember_id(memberId) // 해당 id는 매개변수로 memberId가 들어 올 예쩡;
            .contentCategory(this.contentCategory)
            .contentTitle(this.contentTitle)
            .content(this.content)
            .createdAt(this.createdAt)
            .deleteAt(this.deleteAt)
            .deletedYn(this.deletedYn);
        return  contentBuilder;
    }


}
