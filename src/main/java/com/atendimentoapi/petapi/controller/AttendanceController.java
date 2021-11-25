package com.atendimentoapi.petapi.controller;

import com.atendimentoapi.petapi.model.Attendance;
import com.atendimentoapi.petapi.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pets")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)

    public List<Attendance> listAllPets () {
        return attendanceService.attendanceListAll();
    }
}
