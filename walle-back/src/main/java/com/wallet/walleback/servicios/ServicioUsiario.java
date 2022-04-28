package com.wallet.walleback.servicios;
// implementar esta interface para que el controlador se comunique al servicio y tener mas modularidad (
// La modularidad es, en programación modular y más específicamente en programación orientada a objetos,
// la propiedad que permite subdividir una aplicación en partes más pequeñas) y se cumple el 5to principio SOLID "inyeccion de dependencias
// "no depender de implementaciones sino de abstracciones o interfaces"
import com.wallet.walleback.modelos.Usuario;

public interface ServicioUsiario {
    Usuario guardarUsuario(Usuario usuario);


    Usuario obtenerUsuario(Long idUsuario);

    Usuario modificarUsuario(Long id , Usuario usuario);

    boolean eliminarUsuario(Long id);
}
