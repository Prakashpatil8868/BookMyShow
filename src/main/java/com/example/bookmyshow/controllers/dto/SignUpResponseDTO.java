package com.example.bookmyshow.controllers.dto;

import com.example.bookmyshow.controllers.enums.ResponseStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// if user is registered, give back userId as a confirmation
public class SignUpResponseDTO {
    private Long userId;
    private ResponseStatus status;
}
