package com.orange.transacao.config.kafka.dto;

import com.orange.transacao.model.Cartao;

public class CartaoKafkaDto {

    private String id;
    private String email;

    public CartaoKafkaDto() {
    }

    public CartaoKafkaDto(String id, String email) {
        this.id = id;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public Cartao toModel(){
        return new Cartao(id,email);
    }
}
