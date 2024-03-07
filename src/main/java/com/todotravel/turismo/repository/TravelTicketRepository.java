package com.todotravel.turismo.repository;

import com.todotravel.turismo.model.TravelTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelTicketRepository extends JpaRepository<TravelTicket, Long> {
}
