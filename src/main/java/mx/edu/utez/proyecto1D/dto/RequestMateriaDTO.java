package mx.edu.utez.proyecto1D.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestMateriaDTO {

    @NotNull(message = "El id del profesor es obligatorio")
    private Long idProfesor;

    @NotNull(message = "El id de la carrera es Obligatorio")
    private Long idCarrera;

    @NotBlank(message = "El nombre es Obligatorio")
    @Size(max = 100, message = "El nombre no puede ser mayor a 100 caracteres")
    private String nombre;

    @NotNull(message = "El cuatrimestre es obligatorio")
    private Short cuatrimestre;

    @NotNull(message = "El número de unidades es obligatorio")
    private Short numUnidades;
}