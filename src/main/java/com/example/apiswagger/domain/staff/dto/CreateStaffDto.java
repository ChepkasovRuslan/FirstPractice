package com.example.apiswagger.domain.staff.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CreateStaffDto {
    @NotBlank(message = "Name can't be empty")
    private String name;

    @NotNull(message = "Avatar can't be empty")
    private byte[] optAvatar;
}