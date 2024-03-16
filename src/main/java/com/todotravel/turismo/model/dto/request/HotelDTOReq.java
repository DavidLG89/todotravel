package com.todotravel.turismo.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HotelDTOReq extends TouristServiceDTOReq {
    private String roomType;
    private int stars;
}
