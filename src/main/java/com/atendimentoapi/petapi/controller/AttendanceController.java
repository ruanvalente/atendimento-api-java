package com.atendimentoapi.petapi.controller;

import com.atendimentoapi.petapi.model.Attendance;
import com.atendimentoapi.petapi.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/pets")
public class AttendanceController {
    public final String ERROR_MESSAGE = "ATENDIMENTO NÃO ENCONTRADO";
    @Autowired
    private AttendanceService attendanceService;

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<Attendance> listAllPets() {
        return attendanceService.attendanceListAll();
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Attendance createdAttendance(@RequestBody Attendance attendance) {
        return attendanceService.createAttendance(attendance);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Attendance> findAttendanceById(@PathVariable(value = "id") Long id) {
        Optional<Attendance> attendance = attendanceService.findAttendanceById(id);

        return attendance.
                map(attendanceResponse -> ResponseEntity.ok().body(attendanceResponse))
                .orElse(ResponseEntity.notFound().build());
    }
}
