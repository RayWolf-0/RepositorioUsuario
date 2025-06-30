package cl.duoc.UsuarioMicroServicio.Assembler;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import cl.duoc.UsuarioMicroServicio.controller.UsuarioController;
import cl.duoc.UsuarioMicroServicio.entity.Usuario;

@Component
public class usuarioassembler implements RepresentationModelAssembler<Usuario, EntityModel<Usuario>>{
    @Override
    public EntityModel<Usuario> toModel(Usuario sua){
        return EntityModel.of(
            sua,
            linkTo(methodOn(UsuarioController.class).obtenerPorId(sua.getIdUsuario())).withRel("Lista-el-Usuario-buscado"),
            linkTo(methodOn(UsuarioController.class).obtenerTodos()).withRel("Todos-los-Usuarioes"),
            linkTo(methodOn(UsuarioController.class).eliminarUsuario(sua.getIdUsuario())).withRel("Elimina-un-Usuario"),
            linkTo(methodOn(UsuarioController.class).actualizarUsuario(sua.getIdUsuario(), sua)).withRel("Actualizar-unn-Usuario")
        );
    }
}
