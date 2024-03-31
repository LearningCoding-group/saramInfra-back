package com.study.mull.message.service;

import com.study.mull.message.dto.WriteMessageRequestDto;
import com.study.mull.message.entity.Message;
import com.study.mull.message.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MessageService {

    private final MessageRepository messageRepository;

    // 메세지 작성
    public void writeMessage (WriteMessageRequestDto dto){
        Message.MessageBuilder messageBuilder = dto.toMessageBuilder();
        Message newMessage = messageBuilder.build();

        messageRepository.save(newMessage);
    }

    // 메세지 조회
    public String readMessage (long messageId){

        Optional<Message> messageEntity = messageRepository.findById(messageId);

        return null;
    }

    // 메세지 삭제하기
    public String deleteMessage(@PathVariable int messageId){
        messageRepository.deleteById(messageId);
        return null;
    }


}
