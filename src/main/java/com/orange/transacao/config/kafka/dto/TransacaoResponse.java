package com.orange.transacao.config.kafka.dto;
import org.springframework.data.domain.Page;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacaoResponse {

    private String id;
    private String email;
    private String id_cartao;
    private LocalDateTime efetivada_em;
    private String cidade;
    private String endereco;
    private String nome;
    private BigDecimal valor;

    public TransacaoResponse() {
    }

    public TransacaoResponse(String id, String email, String id_cartao, LocalDateTime efetivada_em, String cidade, String endereco, String nome, BigDecimal valor) {
        this.id = id;
        this.email = email;
        this.id_cartao = id_cartao;
        this.efetivada_em = efetivada_em;
        this.cidade = cidade;
        this.endereco = endereco;
        this.nome = nome;
        this.valor = valor;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getId_cartao() {
        return id_cartao;
    }

    public LocalDateTime getEfetivada_em() {
        return efetivada_em;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
