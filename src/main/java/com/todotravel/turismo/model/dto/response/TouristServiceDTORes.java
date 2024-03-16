package com.todotravel.turismo.model.dto.response;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TouristServiceDTORes {
    private Long serviceCode;
    private String name;
    private String briefDescription;
    private Date serviceDate;
    private Double serviceCost;
}
