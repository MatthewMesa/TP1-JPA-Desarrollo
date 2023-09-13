package com.UTN.TPJPA.Entidades;

import com.UTN.TPJPA.Enumeraciones.EstadoPedido;
import com.UTN.TPJPA.Enumeraciones.TipoEnvio;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pedido {
    private EstadoPedido estado;
    private Date fecha;
    private TipoEnvio tipoEnvio;
    private double total;
}
