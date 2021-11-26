package com.atendimentoapi.petapi.service;

import com.atendimentoapi.petapi.model.Attendance;
import com.atendimentoapi.petapi.repository.AttendanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AttendanceService {

    @Autowired
    private AttendanceRepository attendanceRepository;

    public List<Attendance> attendanceListAll() {
        return attendanceRepository.findAll();
    }

    public Attendance createAttendance(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }

    public Optional<Attendance> findAttendanceById(Long id) {
        return attendanceRepository.findById(id);
    }

    public void removeAttendanceById(Attendance attendance) {
        attendanceRepository.delete(attendance);
    }
}
