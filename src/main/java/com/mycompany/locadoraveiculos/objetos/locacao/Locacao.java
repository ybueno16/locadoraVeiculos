package com.mycompany.locadoraveiculos.objetos.locacao;

import java.time.LocalDate;

public class Locacao {
    public int id;
    public int id_carro;
    public int id_seguradora;
    public int id_cliente;
    public LocalDate dataLocacao;
    public LocalDate dataDevolucao;
    public LocalDate dataDevolvida;
    public float valor;
    public float valorDesconto;
    public float valorTotal;

}
