package com.study.mull.member.dto;


import com.study.mull.member.entity.Member;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class MemberDto {

    private String email;
    private long location;
    private long warning_count;
    private LocalDateTime deleted_at;
    private LocalDateTime created_at;
    private Boolean deleted_yn;


}
