package com.project.mybnb.article.dto;

import lombok.Data;

@Data
public class ArticlePatchDto {
    private String title;
    private String content;
    private String category;
    private String location;
    private int price;

}
