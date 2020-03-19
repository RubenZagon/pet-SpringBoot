package com.platzi.ereservation.vista.resources;

import com.platzi.ereservation.modelo.Cliente;
import com.platzi.ereservation.negocio.services.ClienteService;
import com.platzi.ereservation.vista.resources.virtualObject.ClienteVO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cliente")
public class ClienteResource {

    private final ClienteService clienteService;

    public ClienteResource(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public ResponseEntity<Cliente> createCliente(@RequestBody ClienteVO clienteVO) {
        Cliente cliente = new Cliente();
        cliente.setNombreCli(clienteVO.getNombreCli());
        cliente.setApellidoCli(clienteVO.getApellinoCli());
        cliente.setDireccionCli(clienteVO.getDireccionCli());
        cliente.setTelefonoCli(clienteVO.getTelefonoCli());
        cliente.setEmailCli(clienteVO.getEmailCli());
        return new ResponseEntity<>(this.clienteService.create(cliente), HttpStatus.CREATED);
    }

    @PutMapping("/{identificacion}")
    public ResponseEntity<Cliente> updateCliente(@PathVariable("identificacion") String identificacion, Cliente clienteVO) {
        Cliente cliente = this.clienteService.findByIdentificacion(identificacion);
        if (cliente == null) {
            return new ResponseEntity<Cliente>(HttpStatus.NOT_FOUND);
        } else {
            cliente.setNombreCli(clienteVO.getNombreCli());
            cliente.setApellidoCli(clienteVO.getApellinoCli());
            cliente.setDireccionCli(clienteVO.getDireccionCli());
            cliente.setTelefonoCli(clienteVO.getTelefonoCli());
            cliente.setEmailCli(clienteVO.getEmailCli());
            return new ResponseEntity<>(this.clienteService.create(cliente), HttpStatus.OK);
        }
    }
}
