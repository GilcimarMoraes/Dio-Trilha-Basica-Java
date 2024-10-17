package Desafio_Dio.Sistema_de_gerenciamento_de_entregas.service;

import Desafio_Dio.Sistema_de_gerenciamento_de_entregas.model.Pedido;
import Desafio_Dio.Sistema_de_gerenciamento_de_entregas.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }

    public Pedido criarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public Pedido atualizarPedido(Long id, Pedido pedidoAtualizado) {
        Pedido pedido = pedidoRepository.findById(id).orElseThrow();
        pedido.setStatus(pedidoAtualizado.getStatus());
        return pedidoRepository.save(pedido);
    }

    public void deletarPedido(Long id) {
        pedidoRepository.deleteById(id);
    }

}
