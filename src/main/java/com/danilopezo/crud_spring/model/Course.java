package com.danilopezo.crud_spring.model;

import jakarta.persistence.*;
import lombok.Data;

@Data  //gera getters e setters
@Entity //especificamos essa classe como uma entidade que vai fazer o mapeamento com banco de dados
public class Course {
    @Id //chave primária
    @GeneratedValue(strategy = GenerationType.AUTO) //valor seja gerado automáticamente
    private Long id;

    @Column(length = 200, nullable = false) //nullable nao aceita valores nulos
    private String name;

    @Column(length = 12, nullable = false)
    private String category;
}
