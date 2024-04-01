package com.study.mull.content.service;

import com.study.mull.content.dto.ContentCreateRequestDto;
import com.study.mull.content.entity.Content;
import com.study.mull.content.repository.ContentRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@Slf4j
public class ContentService {
    @Autowired
    private ContentRepository contentRepository;

    @Transactional
    public void createContent(ContentCreateRequestDto dto) throws IOException {
        Content.ContentBuilder contentBuilder = dto.toContentBuilder();
        Content newContent = contentBuilder.build();

        contentRepository.save(newContent);
    }


    public List<Content> findAllContent() throws IOException {
        List<Content> content = contentRepository.findAll();

        // TODO : RESPONSE DTO를 만들어서 넣어줘야 할까?
        // MyBatis에서는 그냥 entity객체로 넘겼었는데
        // JPA 도 그대로 넘겨도 될까?
        return content;
    }

    public Content findContentById(long contentId) throws IOException{
        Content findContent = contentRepository.findById(contentId).orElseThrow();
        return findContent;
    }

    @Transactional
    public void deleteContent(long contentId){
        contentRepository.deleteById(contentId);
    }

    @Transactional
    public Content modifyContent(){
        return null;
    }
}
