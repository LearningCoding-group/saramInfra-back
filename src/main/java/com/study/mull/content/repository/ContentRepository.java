package com.study.mull.content.repository;

import com.study.mull.content.entity.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<Content,Long> {
}
