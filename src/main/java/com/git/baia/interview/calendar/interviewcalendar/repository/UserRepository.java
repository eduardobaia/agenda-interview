package com.git.baia.interview.calendar.interviewcalendar.repository;

import com.git.baia.interview.calendar.interviewcalendar.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}
