package com.ivan.oposapp.oposapp.convocatoria;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ConvocatoriaRepo extends JpaRepository<Convocatoria, Long> {

    // Consulta derivada: Spring Data construye el SQL a partir del nombre
    List<Convocatoria> findByCategoriaIgnoreCaseOrderByFechaPublicacionDesc(String categoria);
}
