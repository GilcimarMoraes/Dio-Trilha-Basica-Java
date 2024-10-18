package Desafio_Dio.API_rest_na_nuvem.domain.Repository;

import Desafio_Dio.API_rest_na_nuvem.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Long> {
}
