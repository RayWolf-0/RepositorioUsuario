package cl.duoc.UsuarioMicroServicio.service;

import cl.duoc.UsuarioMicroServicio.entity.Usuario;
import java.util.List;

public interface UsuarioService {

    List<Usuario> obtenerUsuarios();
    Usuario obtenerPorId(int id);
    Usuario guardarUsuario(Usuario usuario);
    void eliminarUsuario(int id);

}
