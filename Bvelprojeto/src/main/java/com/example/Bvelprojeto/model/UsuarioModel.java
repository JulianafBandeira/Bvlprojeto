package com.example.Bvelprojeto.model;
import java.util.UUID;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@Entity
@Table(name = "tb_usuario")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String login;
    private String senha;
}
