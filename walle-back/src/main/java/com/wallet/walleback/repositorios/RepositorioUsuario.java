package com.wallet.walleback.repositorios;

import com.wallet.walleback.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioUsuario extends JpaRepository<Usuario , Long>{
}
