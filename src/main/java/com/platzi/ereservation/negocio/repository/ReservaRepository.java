package com.platzi.ereservation.negocio.repository;

import com.platzi.ereservation.modelo.Cliente;
import com.platzi.ereservation.modelo.Reserva;
import com.sun.tools.javac.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface ReservaRepository extends JpaRepository<Reserva, String> {

    @Query("select  r from Reserva r where r.fechaIngresoRes =:fechaInicio and r.fechaSalidaRes =:fechaSalida")
    public List<Reserva> find(@Param("fechaInicio") Date fechaInicio, @Param("fechaSalida") Date fechaSalida);
}
