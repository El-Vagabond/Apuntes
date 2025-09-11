package com.ivan.oposapp.oposapp.common;

import com.ivan.oposapp.oposapp.convocatoria.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class DataLoader {

  @Bean
  CommandLineRunner seed(FuenteRepo fuenteRepo, ConvocatoriaRepo convRepo) {
    return args -> {
      if (convRepo.count() > 0) return; // ya hay datos, no duplicar

      var bopa = fuenteRepo.save(Fuente.builder()
              .nombre("BOPA")
              .url("https://sede.asturias.es/bopa")
              .tipo("BOPA")
              .activo(true)
              .build());

      convRepo.save(Convocatoria.builder()
              .fuente(bopa)
              .titulo("Convocatoria Ordenanza 10 plazas")
              .cuerpo("Bases abreviadas…")
              .url("https://ejemplo.asturias.es/convocatoria-ordenanza")
              .categoria("Ordenanza")
              .fechaPublicacion(LocalDate.now().minusDays(3))
              .fechaLimite(LocalDate.now().plusDays(20))
              .hash("demo-1")
              .build());

      convRepo.save(Convocatoria.builder()
              .fuente(bopa)
              .titulo("Bolsa de empleo subalterno")
              .cuerpo("Requisitos y plazos…")
              .url("https://ejemplo.asturias.es/bolsa-subalterno")
              .categoria("Subalterno")
              .fechaPublicacion(LocalDate.now().minusDays(10))
              .fechaLimite(LocalDate.now().plusDays(5))
              .hash("demo-2")
              .build());
    };
  }
}
