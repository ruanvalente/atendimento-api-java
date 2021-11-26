package com.atendimentoapi.petapi.model;

import com.atendimentoapi.petapi.enums.AttendanceStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "attendance")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String client;

    @Column(nullable = false)
    private String pet;

    @Column()
    private AttendanceStatus status = AttendanceStatus.EM_ATENDIMENTO;

    @Column(nullable = false)
    private String observations;
}
