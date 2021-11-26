package com.atendimentoapi.petapi.enums;

import lombok.Getter;

public enum AttendanceStatus {
    EM_ATENDIMENTO("EM_ATENDIMENTO"),
    EM_ESPERA ("EM_ESPERA"),
    FINALIZADO ("FINALIZADO");

    @Getter
    private String description;

    AttendanceStatus(String description) {
        this.description = description;
    }
}
