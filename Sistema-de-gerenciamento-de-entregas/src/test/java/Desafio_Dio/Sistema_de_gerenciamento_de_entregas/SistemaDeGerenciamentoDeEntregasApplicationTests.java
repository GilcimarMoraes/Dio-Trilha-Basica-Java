package Desafio_Dio.Sistema_de_gerenciamento_de_entregas;

import Desafio_Dio.Sistema_de_gerenciamento_de_entregas.model.Pedido;
import Desafio_Dio.Sistema_de_gerenciamento_de_entregas.service.PedidoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest

public class SistemaDeGerenciamentoDeEntregasApplicationTests {
	@Autowired
	private PedidoService pedidoService;

	@Test
	public void testcriarPedido() {
		Pedido pedido = new Pedido();
		pedido.setStatus("Novo");
		Pedido novoPedido = pedidoService.criarPedido(pedido);
		assertThat(novoPedido).isNotNull();
		assertThat(novoPedido.getId()).isNotNull();
	}
}