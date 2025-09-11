package com.ivan.oposapp.oposapp.convocatoria;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Fuente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre; // p.ej. "BOPA"
    private String url; // índice o página a scrapear (más adelante)
    private String tipo; // "BOPA", "AYTO", etc.
    private boolean activo = true;
}
