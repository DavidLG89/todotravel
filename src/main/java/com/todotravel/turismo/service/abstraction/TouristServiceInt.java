package com.todotravel.turismo.service.abstraction;

import com.todotravel.turismo.model.TouristService;
import com.todotravel.turismo.model.dto.request.TouristServiceDTOReq;
import com.todotravel.turismo.model.dto.response.TouristServiceDTORes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TouristServiceInt {
    TouristServiceDTORes getById(Long id);
    Page<TouristServiceDTORes> getAll(Pageable pageable);
    TouristServiceDTORes create(TouristServiceDTOReq touristServiceDTOReq);
    TouristServiceDTORes update(TouristServiceDTOReq touristServiceDTOReq);
    void deleteById(Long id);
}
