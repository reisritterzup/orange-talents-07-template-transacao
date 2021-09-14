package com.orange.transacao.model;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Embeddable
public class Estabelecimento {

    @NotNull
    @NotBlank
    private String nome;

    @NotNull
    @NotBlank
    private String cidade;

    @NotNull
    @NotBlank
    private String endereco;

    public Estabelecimento() {
    }

    public Estabelecimento(String nome, String cidade, String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }
}
