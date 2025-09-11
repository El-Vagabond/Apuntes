
package com.ivan.oposapp.oposapp.convocatoria;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class ConvocatoriaController {

    private final ConvocatoriaRepo repo;

    @GetMapping({ "/", "/convocatorias" })
    public String listar(@RequestParam(required = false) String categoria, Model model) {
        var datos = (categoria == null || categoria.isBlank())
                ? repo.findAll().stream()
                        .sorted((a, b) -> b.getFechaPublicacion().compareTo(a.getFechaPublicacion()))
                        .toList()
                : repo.findByCategoriaIgnoreCaseOrderByFechaPublicacionDesc(categoria);

        model.addAttribute("convocatorias", datos);
        model.addAttribute("categoria", categoria == null ? "" : categoria);
        return "convocatorias"; // nombre de la plantilla
    }
}
