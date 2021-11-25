package com.atendimentoapi.petapi.service;

import com.atendimentoapi.petapi.model.Attendance;
import com.atendimentoapi.petapi.repository.AttendanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;

    public List<Attendance> attendanceListAll () {
        return attendanceRepository.findAll();
    }
}
