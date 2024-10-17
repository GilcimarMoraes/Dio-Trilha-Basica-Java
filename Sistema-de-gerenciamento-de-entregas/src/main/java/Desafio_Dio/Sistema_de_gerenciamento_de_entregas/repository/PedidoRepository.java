package Desafio_Dio.Sistema_de_gerenciamento_de_entregas.repository;

import Desafio_Dio.Sistema_de_gerenciamento_de_entregas.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByClienteId(Long clienteId);
}
