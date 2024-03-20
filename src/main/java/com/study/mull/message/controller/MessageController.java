package com.study.mull.message.controller;

import com.study.mull.message.dto.WriteMessageRequestDto;
import com.study.mull.message.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class MessageController {

    private final MessageService messageService;

    // 메세지 작성
    @PostMapping("/message")
    public String writeMessage (WriteMessageRequestDto dto){
        messageService.writeMessage(dto);

        return null;
    }

    // 메세지 조회
    @GetMapping("/message/{message-id}")
    public String readMessage (@PathVariable long messageId){
        return null;
    }

    // 메세지 삭제하기
    @DeleteMapping("/message/{message-id}")
    public String deleteMessage(@PathVariable int messageId){
        return null;
    }

}
