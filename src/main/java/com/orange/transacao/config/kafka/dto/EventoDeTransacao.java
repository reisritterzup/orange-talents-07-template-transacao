package com.orange.transacao.config.kafka.dto;

import com.orange.transacao.model.Transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class EventoDeTransacao {

    private String id;
    private BigDecimal valor;
    private EstabelecimentoKafkaDto estabelecimento;
    private CartaoKafkaDto cartao;
    private LocalDateTime efetivadaEm;

    public EventoDeTransacao() {
    }

    public EventoDeTransacao(String id, BigDecimal valor, EstabelecimentoKafkaDto estabelecimento, CartaoKafkaDto cartao, LocalDateTime efetivadaEm) {
        this.id = id;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public EstabelecimentoKafkaDto getEstabelecimento() {
        return estabelecimento;
    }

    public CartaoKafkaDto getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public Transacao toModel(){
        return new Transacao(id,valor,efetivadaEm, cartao.toModel(), estabelecimento.toModel());
    }
}
