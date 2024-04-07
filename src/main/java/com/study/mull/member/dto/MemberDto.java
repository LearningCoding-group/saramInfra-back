package com.study.mull.member.dto;


import com.study.mull.member.entity.Member;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MemberDto {

    private Long member_id;
    private String email;
    private Long location;
    private Long warning_count;
    private LocalDateTime deleted_at;
    private LocalDateTime created_at;
    private Boolean deleted_yn;
    private Boolean banned;

}
