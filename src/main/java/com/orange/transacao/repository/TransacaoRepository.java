package com.orange.transacao.repository;

import com.orange.transacao.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransacaoRepository extends JpaRepository<Transacao,String> {
}
