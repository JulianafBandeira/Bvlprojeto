package com.example.Bvelprojeto.model;
import java.util.UUID;
import lombok.Data;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data

@Entity
@Table(name = "tb_produto")
public class ProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private Double preco;
    private int quantidade;
    private String nome;
}

