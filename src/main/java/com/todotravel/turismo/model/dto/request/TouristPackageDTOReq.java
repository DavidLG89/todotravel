package com.todotravel.turismo.model.dto.request;

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
public class TouristPackageDTOReq {
    private Long packageCode;
    private List<TouristServiceDTOReq> includedServices;
    private Double packageCost;
}
