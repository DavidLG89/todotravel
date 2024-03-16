package com.todotravel.turismo.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HotelDTORes {
    private Long serviceCode;
    private String name;
    private String briefDescription;
    private Date serviceDate;
    private double serviceCost;
    private String roomType;
    private int stars;
}
