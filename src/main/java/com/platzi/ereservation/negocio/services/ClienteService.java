package com.platzi.ereservation.negocio.services;

import com.platzi.ereservation.modelo.Cliente;
import com.platzi.ereservation.negocio.repository.ClienteRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Transactional
    public Cliente create(Cliente cliente){
        return this.clienteRepository.save(cliente);
    }

    @Transactional
    public Cliente update(Cliente cliente){
        return this.clienteRepository.save(cliente);
    }

    @Transactional
    public void delete (Cliente cliente) {
        this.clienteRepository.delete(cliente);
    }

    @Transactional
    public Cliente findByIdentificacion(String identificacionCli){
        return this.clienteRepository.findByIdentificacion(identificacionCli);
    }
}
