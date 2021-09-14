package com.orange.transacao.controller;

import com.orange.transacao.config.kafka.dto.EventoDeTransacao;
import com.orange.transacao.config.kafka.dto.TransacaoResponse;
import com.orange.transacao.model.Transacao;
import com.orange.transacao.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/transacao")
public class TransacaoController {

    @Autowired
    private TransacaoRepository transacaoRepository;

    @GetMapping("/{idCartao}")
    public ResponseEntity<?> buscarUltimasDezTransacoesPorCartao(@PathVariable String idCartao,
                                                                 @PageableDefault(sort = "efetivadaEm", direction = Sort.Direction.DESC, size = 10) Pageable pageable){

        try{
            List<TransacaoResponse> transacoes = transacaoRepository.buscarDezUltimasTransacoes(idCartao,pageable).getContent();
            return ResponseEntity.ok(transacoes);
        }catch (Exception ex){
            return ResponseEntity.notFound().build();
        }

    }
}
