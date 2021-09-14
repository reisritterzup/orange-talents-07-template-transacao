package com.orange.transacao.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Transacao {

    @Id
    @NotBlank
    @NotNull
    private String id;

    @Positive
    @NotNull
    private BigDecimal valor;

    @NotNull
    private LocalDateTime efetivadaEm;

    @Embedded
    private Cartao cartao;

    @Embedded
    private Estabelecimento estabelecimento;

    public Transacao() {
    }

    public Transacao(String id, BigDecimal valor, LocalDateTime efetivadaEm, Cartao cartao, Estabelecimento estabelecimento) {
        this.id = id;
        this.valor = valor;
        this.efetivadaEm = efetivadaEm;
        this.cartao = cartao;
        this.estabelecimento = estabelecimento;
    }
}
