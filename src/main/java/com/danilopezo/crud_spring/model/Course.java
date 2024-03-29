package com.danilopezo.crud_spring.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Data  //gera getters e setters e contrutor
@Entity //especificamos essa classe como uma entidade que vai fazer o mapeamento com banco de dados
public class Course {
    @Id //chave primária
    @GeneratedValue(strategy = GenerationType.AUTO) //valor seja gerado automáticamente
    @JsonProperty("_id")
    private Long id;

    @Column(length = 200, nullable = false) //nullable nao aceita valores nulos
    private String name;

    @Column(length = 12, nullable = false)
    private String category;
}
