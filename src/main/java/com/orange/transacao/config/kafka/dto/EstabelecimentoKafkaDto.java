package com.orange.transacao.config.kafka.dto;

import com.orange.transacao.model.Estabelecimento;

public class EstabelecimentoKafkaDto {

    private String nome;
    private String cidade;
    private String endereco;

    public EstabelecimentoKafkaDto() {
    }

    public EstabelecimentoKafkaDto(String nome, String cidade, String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public Estabelecimento toModel(){
        return new Estabelecimento(nome,cidade,endereco);
    }
}
