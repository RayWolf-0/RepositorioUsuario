package cl.duoc.UsuarioMicroServicio.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "USUARIO")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Entidad que representa un usuario")
public class Usuario {

    @Id
    @Column(name = "ID_USUARIO")
    @Schema(description = "id del usuario")
    private int idUsuario;

    @Column(name = "NOMBRE")
    @Schema(description = "nombre del usuario")
    private String nombre;

    @Column(name = "EMAIL")
    @Schema(description = "email del usuario")
    private String email;

    @Column(name = "TELEFONO")
    @Schema(description = "telefono del usuario")
    private String telefono;

    @Column(name = "DIRECCION")
    @Schema(description = "direccion del usuario")
    private String direccion;
    
}
