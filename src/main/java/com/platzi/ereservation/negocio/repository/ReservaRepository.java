package com.platzi.ereservation.negocio.repository;

import com.platzi.ereservation.modelo.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, String> {
}
