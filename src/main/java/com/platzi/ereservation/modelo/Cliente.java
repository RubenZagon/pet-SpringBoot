package com.platzi.ereservation.modelo;

import lombok.Data;

/**
 * Clase que representa la tabla Cliente
 */

@Data
public class Cliente {
    private String nombreCli;
    private String apellidoCli;

    public Cliente(){

    }

}