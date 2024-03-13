package com.study.mull.message.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Message extends JpaRepository<com.study.mull.message.entity.Message, Integer> {

}
