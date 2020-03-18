package com.platzi.ereservation.negocio.repository;

import com.platzi.ereservation.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, String> {

}
