package com.todotravel.turismo.service.abstraction;

import com.todotravel.turismo.model.dto.request.TouristPackageDTOReq;
import com.todotravel.turismo.model.dto.response.TouristPackageDTORes;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TouristPackageService {
    TouristPackageDTORes getById(Long id);
    Page<TouristPackageDTORes> getAll(Pageable pageable);
    TouristPackageDTORes create(TouristPackageDTOReq touristPackageDTOReq);
    TouristPackageDTORes update(TouristPackageDTOReq touristPackageDTOReq);
    void deleteById(Long id);
}
