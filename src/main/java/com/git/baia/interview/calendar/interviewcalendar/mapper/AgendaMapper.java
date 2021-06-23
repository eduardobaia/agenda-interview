package com.git.baia.interview.calendar.interviewcalendar.mapper;
import com.git.baia.interview.calendar.interviewcalendar.dto.AgendaDto;
import com.git.baia.interview.calendar.interviewcalendar.model.Agenda;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(uses = {DateMapper.class})
public interface AgendaMapper {

    @Mapping(source = "user.id", target = "userId")
    AgendaDto modelToDto(Agenda agenda);

    @Mapping(source = "userId", target = "user.id")
    Agenda dtoToModel(AgendaDto agendaDto);

}
