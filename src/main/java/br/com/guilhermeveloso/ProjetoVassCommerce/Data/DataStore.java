package br.com.guilhermeveloso.ProjetoVassCommerce.Data;

import br.com.guilhermeveloso.ProjetoVassCommerce.Modelos.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DataStore {

    public static final List<Categoria> categorias = new ArrayList<>();
    public static final List<Produto> produtos = new ArrayList<>();
    public static final List<Cliente> clientes = new ArrayList<>();
    public static final List<Cartao> cartoes = new ArrayList<>();
    public static final List<TipoCartao> tiposCartao = new ArrayList<>();
    public static final List<Endereco> enderecos = new ArrayList<>();
    public static final List<Estado> estados = new ArrayList<>();
    public static final List<Cidade> cidades = new ArrayList<>();
    public static final List<Pedido> pedidos = new ArrayList<>();

    static {

        categorias.add(
                new Categoria(
                        1,
                        "informatica.png",
                        "Informática",
                        "Produtos de informática"
                )
        );

        categorias.add(
                new Categoria(
                        2,
                        "eletronicos.png",
                        "Eletrônicos",
                        "Produtos eletrônicos"
                )
        );

        categorias.add(
                new Categoria(
                        3,
                        "moveis.png",
                        "Móveis",
                        "Móveis para casa"
                )
        );

        produtos.add(
                new Produto(
                        1,
                        "Notebook",
                        "Notebook para uso profissional",
                        new BigDecimal("3500.00"),
                        "2026-01-01",
                        "2026-01-01",
                        "2026-01-01",
                        new BigDecimal("3500.00"),
                        1
                )
        );

        produtos.add(
                new Produto(
                        2,
                        "Mouse Gamer",
                        "Mouse gamer com sensor óptico",
                        new BigDecimal("150.00"),
                        "2026-01-05",
                        "2026-01-05",
                        "2026-01-05",
                        new BigDecimal("150.00"),
                        1
                )
        );

        produtos.add(
                new Produto(
                        3,
                        "Smartphone",
                        "Smartphone com tela de alta resolução",
                        new BigDecimal("2200.00"),
                        "2026-01-10",
                        "2026-01-10",
                        "2026-01-10",
                        new BigDecimal("2200.00"),
                        2
                )
        );

        produtos.add(
                new Produto(
                        4,
                        "Televisão",
                        "Smart TV 50 polegadas",
                        new BigDecimal("2800.00"),
                        "2026-01-15",
                        "2026-01-15",
                        "2026-01-15",
                        new BigDecimal("2800.00"),
                        2
                )
        );

        produtos.add(
                new Produto(
                        5,
                        "Sofá",
                        "Sofá de três lugares",
                        new BigDecimal("1800.00"),
                        "2026-02-01",
                        "2026-02-01",
                        "2026-02-01",
                        new BigDecimal("1800.00"),
                        3
                )
        );

        clientes.add(
                new Cliente(
                        1,
                        "João da Silva",
                        "joao@email.com",
                        "joao.png",
                        "1995-05-10",
                        "111.111.111-11"
                )
        );

        clientes.add(
                new Cliente(
                        2,
                        "Maria Oliveira",
                        "maria@email.com",
                        "maria.png",
                        "1998-08-20",
                        "222.222.222-22"
                )
        );

        tiposCartao.add(
                new TipoCartao(
                        1,
                        "Crédito"
                )
        );

        tiposCartao.add(
                new TipoCartao(
                        2,
                        "Débito"
                )
        );

        cartoes.add(
                new Cartao(
                        1,
                        "2026-01-01",
                        false,
                        1,
                        1,
                        "Crédito"
                )
        );

        cartoes.add(
                new Cartao(
                        2,
                        "2026-01-02",
                        false,
                        1,
                        2,
                        "Débito"
                )
        );

        cartoes.add(
                new Cartao(
                        3,
                        "2026-01-03",
                        true,
                        2,
                        1,
                        "Crédito"
                )
        );

        estados.add(
                new Estado(
                        1,
                        "SP",
                        "São Paulo"
                )
        );

        estados.add(
                new Estado(
                        2,
                        "RJ",
                        "Rio de Janeiro"
                )
        );

        estados.add(
                new Estado(
                        3,
                        "MG",
                        "Minas Gerais"
                )
        );

        cidades.add(
                new Cidade(
                        1,
                        "São Paulo",
                        1
                )
        );

        cidades.add(
                new Cidade(
                        2,
                        "Campinas",
                        1
                )
        );

        cidades.add(
                new Cidade(
                        3,
                        "Santos",
                        1
                )
        );

        cidades.add(
                new Cidade(
                        4,
                        "Rio de Janeiro",
                        2
                )
        );

        cidades.add(
                new Cidade(
                        5,
                        "Niterói",
                        2
                )
        );

        cidades.add(
                new Cidade(
                        6,
                        "Belo Horizonte",
                        3
                )
        );

        enderecos.add(
                new Endereco(
                        1,
                        "Rua das Flores",
                        "100",
                        "01000-000",
                        "Apto 10",
                        "(11) 99999-9999",
                        "Centro",
                        1,
                        1,
                        "São Paulo",
                        1,
                        "São Paulo",
                        "SP"
                )
        );

        enderecos.add(
                new Endereco(
                        2,
                        "Avenida Brasil",
                        "500",
                        "20000-000",
                        "Casa",
                        "(21) 98888-8888",
                        "Centro",
                        2,
                        4,
                        "Rio de Janeiro",
                        2,
                        "Rio de Janeiro",
                        "RJ"
                )
        );

        pedidos.add(
                new Pedido(
                        1,
                        "2026-03-01",
                        new BigDecimal("3650.00"),
                        1,
                        1,
                        "AGUARDANDO_PAGAMENTO"
                )
        );

        pedidos.add(
                new Pedido(
                        2,
                        "2026-03-05",
                        new BigDecimal("2200.00"),
                        1,
                        3,
                        "ENTREGUE"
                )
        );

        pedidos.add(
                new Pedido(
                        3,
                        "2026-03-10",
                        new BigDecimal("2800.00"),
                        2,
                        2,
                        "SEPARANDO_ESTOQUE"
                )
        );
    }
}