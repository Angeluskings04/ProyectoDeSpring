package mx.fciencias.unam.demo.entity;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

public enum Medida{
    KILOGRAMO("K","Kilogramo"),
    GRAMO("G", "Gramo"),
    LITRO("L","Litro"),
    MILILITRO("M", "Mililitro"),
    CUCHARADA("C","Cuchrada");

    public final String clave;
    public final String etiqueta;

    private Medida(String clave, String etiqueta) {
        this.clave = clave;
        this.etiqueta = etiqueta;
    }

    public String __String() {
        return this.clave;
    }
}