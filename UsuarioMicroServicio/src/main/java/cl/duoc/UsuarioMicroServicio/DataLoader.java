package cl.duoc.UsuarioMicroServicio;

import java.util.Locale;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import cl.duoc.UsuarioMicroServicio.entity.Usuario;
import cl.duoc.UsuarioMicroServicio.service.UsuarioService;
import net.datafaker.Faker;

@Component
public class DataLoader implements CommandLineRunner{

    private final Faker faker = new Faker(new Locale("es", "cl"));
    private final Random random = new Random();

    @Autowired
    private UsuarioService usuarioservice;

    @Override
    public void run(String... args) throws Exception{
       for(int i=0; i < 10; i++){
        Usuario usuarionuevo = new Usuario();
        usuarionuevo.setIdUsuario(random.nextInt(10));
        usuarionuevo.setDireccion(faker.address().fullAddress());
        usuarionuevo.setNombre(faker.name().fullName());
        usuarionuevo.setTelefono(faker.number().digits(9));
        usuarionuevo.setEmail(faker.internet().emailAddress());

        usuarioservice.guardarUsuario(usuarionuevo);
        System.out.println("Usuario registrado: "+usuarionuevo.getIdUsuario());
       } 

    }

}
