package com.ofektom.springsecclass.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostRequestDto {
    @NotEmpty
    private String content;
    private String postTitle;
}
