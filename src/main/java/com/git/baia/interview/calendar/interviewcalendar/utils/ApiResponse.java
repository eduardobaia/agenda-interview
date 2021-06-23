package com.git.baia.interview.calendar.interviewcalendar.utils;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "API Response for Interview Calendar ")
public class ApiResponse {
    @Schema(description = "Response Status Code", example = "1")
    private Integer statusCode;

    @Schema(description = "Response Message", example = "Some message.")
    private String message;

    public ApiResponse(Integer statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }

}
