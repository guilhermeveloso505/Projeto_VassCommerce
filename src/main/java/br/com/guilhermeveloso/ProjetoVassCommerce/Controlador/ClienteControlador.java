package br.com.guilhermeveloso.ProjetoVassCommerce.Controlador;

import br.com.guilhermeveloso.ProjetoVassCommerce.Data.DataStore;
import br.com.guilhermeveloso.ProjetoVassCommerce.Modelos.Cartao;
import br.com.guilhermeveloso.ProjetoVassCommerce.Modelos.Cliente;
import br.com.guilhermeveloso.ProjetoVassCommerce.Modelos.Endereco;
import br.com.guilhermeveloso.ProjetoVassCommerce.Modelos.Pedido;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteControlador {

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscar(
            @PathVariable Integer id
    ) {

        return DataStore.clientes
                .stream()
                .filter(cliente -> cliente.getId().equals(id))
                .findFirst()
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/{idcliente}/formas-de-pagamento")
    public ResponseEntity<List<Cartao>> formasDePagamento(
            @PathVariable Integer idcliente
    ) {

        boolean clienteExiste = DataStore.clientes
                .stream()
                .anyMatch(cliente -> cliente.getId().equals(idcliente));

        if (!clienteExiste) {
            return ResponseEntity.notFound().build();
        }

        List<Cartao> resultado = DataStore.cartoes
                .stream()
                .filter(cartao ->
                        cartao.getIdCliente().equals(idcliente)
                )
                .toList();

        return ResponseEntity.ok(resultado);
    }

    @GetMapping("/{idcliente}/endereco")
    public ResponseEntity<List<Endereco>> endereco(
            @PathVariable Integer idcliente
    ) {

        boolean clienteExiste = DataStore.clientes
                .stream()
                .anyMatch(cliente -> cliente.getId().equals(idcliente));

        if (!clienteExiste) {
            return ResponseEntity.notFound().build();
        }

        List<Endereco> resultado = DataStore.enderecos
                .stream()
                .filter(endereco ->
                        endereco.getIdCliente().equals(idcliente)
                )
                .toList();

        return ResponseEntity.ok(resultado);
    }

    @GetMapping("/{idcliente}/pedido")
    public ResponseEntity<List<Pedido>> pedidos(
            @PathVariable Integer idcliente
    ) {

        boolean clienteExiste = DataStore.clientes
                .stream()
                .anyMatch(cliente -> cliente.getId().equals(idcliente));

        if (!clienteExiste) {
            return ResponseEntity.notFound().build();
        }

        List<Pedido> resultado = DataStore.pedidos
                .stream()
                .filter(pedido ->
                        pedido.getIdCliente().equals(idcliente)
                )
                .toList();

        return ResponseEntity.ok(resultado);
    }
}