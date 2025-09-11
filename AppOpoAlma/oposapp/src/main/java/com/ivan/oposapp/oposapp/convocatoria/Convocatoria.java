package com.ivan.oposapp.oposapp.convocatoria;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Convocatoria {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(optional = false)
  private Fuente fuente;            // relación N:1 → muchas convocatorias pertenecen a 1 fuente

  private String titulo;

  @Column(length = 4000)
  private String cuerpo;            // resumen/descripcion

  private String url;               // enlace a las bases

  private String ambito;            // opcional (p.ej. "Autonómico")
  private String categoria;         // p.ej. "Ordenanza", "Subalterno"

  private LocalDate fechaPublicacion;
  private LocalDate fechaLimite;

  @Column(unique = true)
  private String hash;              // anti-duplicados (lo usaremos con scraping)
}
