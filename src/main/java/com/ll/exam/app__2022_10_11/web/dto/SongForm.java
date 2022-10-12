package com.ll.exam.app__2022_10_11.web.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class SongForm {
    @NotEmpty
    private String subject;
    @NotEmpty
    private String content;
}
