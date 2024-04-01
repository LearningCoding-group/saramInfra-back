package com.study.mull.message.dto;

import com.study.mull.message.entity.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WriteMessageRequestDto {
    private long messageId;
    private String message;
    private int messageStatus;
    private long memberId;
    private LocalDateTime deletedAt;
    private LocalDateTime createdAt;
    private Boolean deletedYn;

    public Message.MessageBuilder toMessageBuilder(){
        Message.MessageBuilder messageBuilder = Message.builder();

        messageBuilder = messageBuilder
                .messageId(this.messageId)
                .message(this.message)
                .messageStatus(this.messageStatus)
                //.member.setMember_id(memberId) // 매개변수로 memberID가 들어 옴.
                .deletedAt(this.deletedAt)
                .createdAt(this.createdAt)
                .deletedYn(this.deletedYn);
        return messageBuilder;
    }
}
