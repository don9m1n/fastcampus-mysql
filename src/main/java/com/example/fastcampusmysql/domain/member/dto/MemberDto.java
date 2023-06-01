package com.example.fastcampusmysql.domain.member.dto;

import lombok.Builder;

import java.time.LocalDateTime;

public record MemberDto(
        Long id,
        String email,
        String nickname,
        LocalDateTime birthDay) {
}
