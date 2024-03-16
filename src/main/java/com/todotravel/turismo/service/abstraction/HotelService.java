package com.todotravel.turismo.service.abstraction;

import com.todotravel.turismo.model.Hotel;
import com.todotravel.turismo.model.dto.request.HotelDTOReq;
import com.todotravel.turismo.model.dto.response.HotelDTORes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface HotelService {

    HotelDTORes getById(Long id);
    Page<HotelDTORes> getAll(Pageable pageable);
    HotelDTORes create(HotelDTOReq hotelDTOReq);
    HotelDTORes update(HotelDTOReq hotelDTOReq);
    void deleteById(Long id);
}
