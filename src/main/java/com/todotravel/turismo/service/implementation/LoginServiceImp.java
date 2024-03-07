package com.todotravel.turismo.service.implementation;

import com.todotravel.turismo.model.dto.request.AuthDTOReq;
import com.todotravel.turismo.model.dto.response.AuthDTORes;
import com.todotravel.turismo.repository.EmployeeRepository;
import com.todotravel.turismo.service.abstraction.LoginService;
import com.todotravel.turismo.util.JWTUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImp implements LoginService {

    @Autowired
    private JWTUtils jwtUtils;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private EmployeeRepository employeeRepository;

    /**
     * Autentica al usuario y devuelve un token
     * @param request dto de autenticacion
     * @return dto de respuesta de autenticacion
     */
    @Override
    public AuthDTORes authenticate(AuthDTOReq request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );
        var user = employeeRepository.findByEmail(request.getEmail()).orElseThrow();
        var token = jwtUtils.generateToken(user);
        return AuthDTORes.builder()
                .token(token)
                .build();
    }
}
