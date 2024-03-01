package com.todotravel.turismo.service.abstraction;

import com.todotravel.turismo.model.dto.request.AuthDTOReq;
import com.todotravel.turismo.model.dto.response.AuthDTORes;

public interface LoginService {
    AuthDTORes authenticate(AuthDTOReq request);
}
