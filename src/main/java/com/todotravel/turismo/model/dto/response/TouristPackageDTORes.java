package com.todotravel.turismo.model.dto.response;

import com.todotravel.turismo.model.TouristService;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
public class TouristPackageDTORes {
    private Long packageCode;
    private List<TouristServiceDTORes> includedServices;
    private Double packageCost;
}
