package com.orange.transacao.config.kafka;

import com.orange.transacao.repository.TransacaoRepository;
import com.orange.transacao.config.kafka.dto.EventoDeTransacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerDeTransacao {

    @Autowired
    private TransacaoRepository transacaoRepository;

    @KafkaListener(topics = "transacoes")
    public void ouvir(EventoDeTransacao eventoDeTransacao) {
        transacaoRepository.save(eventoDeTransacao.toModel());
        System.out.println(eventoDeTransacao.getId());
    }

}