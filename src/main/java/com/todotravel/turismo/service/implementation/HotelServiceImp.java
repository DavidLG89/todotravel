package com.todotravel.turismo.service.implementation;

import com.todotravel.turismo.model.Hotel;
import com.todotravel.turismo.model.dto.request.HotelDTOReq;
import com.todotravel.turismo.model.dto.response.HotelDTORes;
import com.todotravel.turismo.repository.HotelRepository;
import com.todotravel.turismo.service.abstraction.HotelService;
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
public class HotelServiceImp implements HotelService {
    private final HotelRepository hotelRepository;
    private final ModelMapper modelMapper;
    @Override
    public HotelDTORes getById(Long id) throws EntityNotFoundException {
        Hotel hotel = hotelRepository.findById(id)
                                     .orElseThrow(() -> new EntityNotFoundException("El servicio de hotel con id: " + id + " no existe en base de datos"));
        return modelMapper.map(hotel, HotelDTORes.class);
    }

    @Override
    public Page<HotelDTORes> getAll(Pageable pageable) {
        List<HotelDTORes> hotels = hotelRepository.findAll(pageable)
                                .stream()
                                .map(hotel -> modelMapper.map(hotel, HotelDTORes.class))
                                .toList();
        return new PageImpl<>(hotels, pageable, hotels.size());
    }

    @Override
    public HotelDTORes create(HotelDTOReq hotelDTOReq) {
        Hotel hotel = hotelRepository.save(modelMapper.map(hotelDTOReq, Hotel.class));
        return modelMapper.map(hotel, HotelDTORes.class);
    }

    @Override
    public HotelDTORes update(HotelDTOReq hotelDTOReq) {
        if(!hotelRepository.existsById(hotelDTOReq.getServiceCode())) {
            throw new EntityNotFoundException("EL hotel con id " + hotelDTOReq.getServiceCode() + " no existe en base de datos");
        }
        Hotel hotel = hotelRepository.save(modelMapper.map(hotelDTOReq, Hotel.class));
        return modelMapper.map(hotel, HotelDTORes.class);
    }

    @Override
    public void deleteById(Long id) {
        Hotel hotel = hotelRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("EL hotel con id " + id + " no existe en base de datos"));
        hotelRepository.delete(hotel);
    }
}
