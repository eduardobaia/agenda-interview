package com.git.baia.interview.calendar.interviewcalendar.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "Search for  Interview's Availability")
public class SearchInterviewsAvailabilityDto extends  PageableDto{

    @Schema(description = "Candidate's Identification", example = "1", required = true)
    @NotNull
    private Long candidateId;

    @Schema(description = "Interviewer's Identifications", example = "[1,2,3]", required = true)
    @NotEmpty
    private List<Long> interviewerIds;

    @Schema(description = "Start from", required = true, format = "date-time", example = "2021-03-25T09:00:00Z" )
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ssZ", shape=JsonFormat.Shape.STRING)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @NotNull
    private OffsetDateTime startingFrom;

    @Schema(description = "Ending at", required = true, format = "date-time", example = "2021-03-25T14:00:00Z")
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ssZ", shape=JsonFormat.Shape.STRING)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @NotNull
    private OffsetDateTime endingAt;

}
