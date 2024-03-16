package com.todotravel.turismo.service.implementation;

import com.todotravel.turismo.model.TouristPackage;
import com.todotravel.turismo.model.dto.request.TouristPackageDTOReq;
import com.todotravel.turismo.model.dto.response.TouristPackageDTORes;
import com.todotravel.turismo.repository.TouristPackageRepository;
import com.todotravel.turismo.service.abstraction.TouristPackageService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TouristPackageServiceImp implements TouristPackageService {

    private final TouristPackageRepository touristPackageRepository;
    private final ModelMapper modelMapper;

    @Override
    public TouristPackageDTORes getById(Long id) throws EntityNotFoundException {
        TouristPackage touristPackage = touristPackageRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("El servicio de hotel con id: " + id + " no existe en base de datos"));
        return modelMapper.map(touristPackage, TouristPackageDTORes.class);
    }

    @Override
    public Page<TouristPackageDTORes> getAll(Pageable pageable) {
        List<TouristPackageDTORes> touristPackageDTOResList = touristPackageRepository.findAll(pageable)
                                                                        .stream()
                                                                        .map((touristPackage) -> modelMapper.map(touristPackage, TouristPackageDTORes.class))
                                                                        .toList();
        return new PageImpl<>(touristPackageDTOResList, pageable, touristPackageDTOResList.size());
    }

    @Override
    public TouristPackageDTORes create(TouristPackageDTOReq touristPackageDTOReq) {
        TouristPackage touristPackage = touristPackageRepository.save(modelMapper.map(touristPackageDTOReq, TouristPackage.class));
        return modelMapper.map(touristPackage, TouristPackageDTORes.class);
    }

    @Override
    public TouristPackageDTORes update(TouristPackageDTOReq touristPackageDTOReq) {
        TouristPackage touristPackage = touristPackageRepository.save(modelMapper.map(touristPackageDTOReq, TouristPackage.class));
        return modelMapper.map(touristPackage, TouristPackageDTORes.class);
    }

    @Override
    public void deleteById(Long id) {
        touristPackageRepository.deleteById(id);
    }
}
