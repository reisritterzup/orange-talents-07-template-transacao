package com.orange.transacao.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Embeddable
public class Cartao {

    @NotBlank
    @NotNull
    @Column(name = "id_cartao")
    private String id;

    @NotBlank
    @NotNull
    @Email
    private String email;

    public Cartao() {
    }

    public Cartao(String id, String email) {
        this.id = id;
        this.email = email;
    }
}
