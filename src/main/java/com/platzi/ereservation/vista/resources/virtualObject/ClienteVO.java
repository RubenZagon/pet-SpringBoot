package com.platzi.ereservation.vista.resources.virtualObject;

import com.platzi.ereservation.modelo.Reserva;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

/**
 * Clase que representa la tabla Cliente
 */

@Data
public class ClienteVO {
    private String nombreCli;
    private String apellidoCli;
    private String identificacionCli;
    private String direccionCli;
    private String telefonoCli;
    private String emailCli;


}
