package com.ll.exam.app__2022_10_11.web.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class ProductForm {
    @NotEmpty
    private String subject;
    @NotNull
    private int price;
    @NotNull
    private long songId;
}