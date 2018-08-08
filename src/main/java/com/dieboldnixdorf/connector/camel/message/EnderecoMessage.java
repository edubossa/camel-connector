package com.dieboldnixdorf.connector.camel.message;

import com.dieboldnixdorf.connector.camel.model.Endereco;

public class EnderecoMessage {

    public void onMessage(Endereco endereco) {
        System.out.println(endereco);
    }

}
