package Desafio_Dio.Sistema_de_gerenciamento_de_entregas.repository;

import Desafio_Dio.Sistema_de_gerenciamento_de_entregas.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
