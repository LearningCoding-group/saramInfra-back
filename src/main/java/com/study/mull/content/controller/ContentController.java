package com.study.mull.content.controller;

import com.study.mull.content.dto.ContentCreateRequestDto;
import com.study.mull.content.dto.ContentModifyRequestDto;
import com.study.mull.content.dto.ContentModifyResponseDto;
import com.study.mull.content.entity.Content;
import com.study.mull.content.service.ContentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@Controller
@Slf4j
public class ContentController {
    @Autowired
    private ContentService contentService;

    @GetMapping("/contentList")
    public List<Content> findAllContent() throws IOException{

        // TODO: 리턴타입을 확인해서 넣어주자!
        contentService.findAllContent();

        return null;
    }


    @GetMapping("/content/{contentId}")
    public String findContentByID(@PathVariable long contentId) throws IOException{
        contentService.findContentById(contentId);

        return "";
    }

    @PostMapping("/create")
    public void createContent(ContentCreateRequestDto dto) throws IOException {
        contentService.createContent(dto);

        // TODO : 화면 나오면 리턴 페이지 넣기
    }

    @DeleteMapping("/delete/{contentId}")
    public String deleteContent(@PathVariable long contentId){

        contentService.deleteContent(contentId);

        return "";
    }

    @PostMapping("/modifyContent")
    public ResponseEntity<ContentModifyResponseDto> modifyContent(@RequestBody ContentModifyRequestDto requestDto){

        // TODO MODIFY RESPONSE DTO 비어있음 이거 마무리 정리해야함 SERVICE작성 해야함
        return null;
    }



}
