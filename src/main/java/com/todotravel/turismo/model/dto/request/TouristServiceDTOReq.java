package com.todotravel.turismo.model.dto.request;

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
public class TouristServiceDTOReq {
    private Long serviceCode;
    @NotNull(message = "No debe estar vacio")
    private String name;
    private String briefDescription;
    @NotNull(message = "No debe estar vacio")
    private Date serviceDate;
    @DecimalMin(value = "0.0", message = "El valor mínimo ingresado debe ser 0.0")
    @NotNull(message = "No debe estar vacio")
    private Double serviceCost;
}
