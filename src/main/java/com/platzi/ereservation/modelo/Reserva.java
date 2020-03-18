package com.platzi.ereservation.modelo;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.Date;

/**
 * Tabla reserva
 */

@Data
@Entity
@Table(name = "reserva")
public class Reserva {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String idRes;
    @Temporal(TemporalType.DATE)
    private Date fechaIngresoRes;
    private Date fechaSalidaRes;
    private int cantidadPersonasRes;
    private String descripcionRes;

    @ManyToOne
    @JoinColumn(name = "idCli")
    private Cliente cliente;
}
