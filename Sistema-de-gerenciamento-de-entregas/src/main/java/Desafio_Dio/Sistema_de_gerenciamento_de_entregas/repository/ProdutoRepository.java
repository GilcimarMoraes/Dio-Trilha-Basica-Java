package Desafio_Dio.Sistema_de_gerenciamento_de_entregas.repository;

import Desafio_Dio.Sistema_de_gerenciamento_de_entregas.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
