package com.atendimentoapi.petapi.repository;

import com.atendimentoapi.petapi.model.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<Long, Attendance> {
    
}
