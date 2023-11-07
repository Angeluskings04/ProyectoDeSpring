package mx.fciencias.unam.demo.entity;

import lombok.Data;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Usuario{

    private String nombre;

    private String aPaterno;

    private String aMaterno;

    private String correo;

}