package com.study.mull.message.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class Message {

    private final com.study.mull.message.repository.Message messageRepo;

    // 메세지 조회
    public com.study.mull.message.dto.Message readMessage (int messageId){

        Optional<com.study.mull.message.entity.Message> messageEntity = messageRepo.findById(messageId);

        return null;
    }

    // 메세지 작성
    public String writeMessage (){
        return null;
    }

    // 메세지 삭제하기
    public String deleteMessage(@PathVariable int messageId){
        return null;
    }


}
