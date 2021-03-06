package com.example.megaflats.models.dto;

import com.example.megaflats.models.entities.House;
import com.example.megaflats.models.entities.Users;
import com.example.megaflats.models.enums.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ReserveHistoryDto {
    private Long id;

    private House house_id;

    private Users users_id;

    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDate start_date;

    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDate end_date;

    private Status status;

    private int total_price;

    private LocalDate add_date;

    private LocalDate edit_date;
}
