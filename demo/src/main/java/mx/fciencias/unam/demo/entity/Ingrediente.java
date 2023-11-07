package mx.fciencias.unam.demo.entity;

import lombok.Data;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Ingredinte{

    private String name;

    private double price;

    private int cantidad;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaCompra;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaCaducidad;
}
