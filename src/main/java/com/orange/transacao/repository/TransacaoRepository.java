package com.orange.transacao.repository;

import com.orange.transacao.config.kafka.dto.TransacaoResponse;
import com.orange.transacao.model.Transacao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TransacaoRepository extends JpaRepository<Transacao,String> {

    @Query(nativeQuery = false,value =
            "select new com.orange.transacao.config.kafka.dto.TransacaoResponse" +
                    "(t.id,t.cartao.email,t.cartao.id,t.efetivadaEm,t.estabelecimento.cidade,t.estabelecimento.endereco" +
                    ",t.estabelecimento.nome,t.valor) from Transacao t where cartao.id=?1 order by efetivadaEm DESC")
    Page<TransacaoResponse> buscarDezUltimasTransacoes(String idCartao, Pageable pageable);
}
