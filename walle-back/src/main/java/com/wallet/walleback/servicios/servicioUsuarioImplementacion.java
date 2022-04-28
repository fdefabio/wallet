package com.wallet.walleback.servicios;

import com.wallet.walleback.modelos.Usuario;
import com.wallet.walleback.repositorios.RepositorioUsuario;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class servicioUsuarioImplementacion implements ServicioUsiario {

    private final RepositorioUsuario repositorioUsuario;

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return repositorioUsuario.save(usuario);
    }

    @Override
    public Usuario obtenerUsuario(Long idUsuario) {
        return repositorioUsuario.findById(idUsuario).orElseThrow(() -> {throw new RuntimeException();});
    }

    @Override
    public Usuario modificarUsuario(Long id, Usuario usuarioModificar) {
        Usuario usuarioBuscado = repositorioUsuario.findById(id).get();
        usuarioBuscado.setDireccion(usuarioModificar.getDireccion());
        return  repositorioUsuario.save(usuarioBuscado);
    }

    @Override
    public boolean eliminarUsuario(Long id) {
        try
        {
            repositorioUsuario.deleteById(id);
            return true;

        }catch(Exception e){
            return false;
        }
    }
}
