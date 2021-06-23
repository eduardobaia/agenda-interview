package com.git.baia.interview.calendar.interviewcalendar.repository;

import com.git.baia.interview.calendar.interviewcalendar.model.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {
}
