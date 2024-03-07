package com.todotravel.turismo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventTicketRepository extends JpaRepository<com.todotravel.turismo.model.EventTicket, Long> {
}
