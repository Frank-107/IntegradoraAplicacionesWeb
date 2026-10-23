package mx.edu.utez.proyecto1D.dto;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestEstudianteDTO {

    @NotBlank(message = "el nombre es requerido")
    @Size(max = 50, message = "el nombre no puede ser mayor a 50 caracteres")
    private String nombre;

    @NotBlank
    @Size(max = 10, message = "la matricula no puede ser mayor a 10 caracteres")
    private String matricula;

    @Size(max = 50, message = "el apellido paterno no puede ser mayor a 50 caracteres")
    @NotBlank
    private String apellidoPaterno;

    @Size(max = 50, message = "el apellido materno no puede ser mayor a 50 caracteres")
    private String apellidoMaterno;



}
