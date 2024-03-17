package com.study.mull.message.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class Message {

    // 메세지 조회
    @GetMapping("/message/{message-id}")
    public String readMessage (@PathVariable int messageId){
        return null;
    }

    // 메세지 작성
    @PostMapping("/message")
    public String writeMessage (){
        return null;
    }

    // 메세지 삭제하기
    @DeleteMapping("/message/{message-id}")
    public String deleteMessage(@PathVariable int messageId){
        return null;
    }

}
