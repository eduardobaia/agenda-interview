package com.git.baia.interview.calendar.interviewcalendar.dto;

import com.git.baia.interview.calendar.interviewcalendar.enums.UserType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "Create User")
public class CreateUserDto {
    @Schema(description = "User's Name", required = true, example = "Marie Clark")
    @NotEmpty
    @Size(min = 3, max = 60)
    private String name;

    @Schema(description = "User's Type", required = true)
    private UserType userType;

}
