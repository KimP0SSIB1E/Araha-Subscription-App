package com.semicolon.africa.arahasubcriptionapp.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class ApiResponse {

    private boolean isSuccessful;
    private Object data;
}
