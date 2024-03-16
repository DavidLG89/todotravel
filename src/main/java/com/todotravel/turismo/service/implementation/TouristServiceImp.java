package com.todotravel.turismo.service.implementation;

import com.todotravel.turismo.model.TouristService;
import com.todotravel.turismo.model.dto.request.TouristServiceDTOReq;
import com.todotravel.turismo.model.dto.response.TouristServiceDTORes;
import com.todotravel.turismo.repository.TouristServiceRepository;
import com.todotravel.turismo.service.abstraction.TouristServiceInt;
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
public class TouristServiceImp implements TouristServiceInt {

    private final TouristServiceRepository touristServiceRepository;
    private final ModelMapper modelMapper;
    @Override
    public TouristServiceDTORes getById(Long id) throws EntityNotFoundException {
        TouristService touristService = touristServiceRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("El servicio de hotel con id: " + id + " no existe en base de datos"));
        return modelMapper.map(touristService, TouristServiceDTORes.class);
    }

    @Override
    public Page<TouristServiceDTORes> getAll(Pageable pageable) {
        List<TouristServiceDTORes> touristServices = touristServiceRepository.findAll(pageable)
                                                                        .stream()
                                                                        .map( touristService ->modelMapper.map(touristService, TouristServiceDTORes.class))
                                                                        .toList();
        return new PageImpl<>(touristServices, pageable, touristServices.size());
    }

    @Override
    public TouristServiceDTORes create(TouristServiceDTOReq touristServiceDTOReq) {
        return touristServiceRepository.save(TouristServiceDTOReq);
    }

    @Override
    public TouristServiceDTORes update(TouristServiceDTOReq touristServiceDTOReq) {
        return touristServiceRepository.save(touristServiceDTOReq);
    }

    @Override
    public void deleteById(Long id) {
        touristServiceRepository.deleteById(id);
    }
}
