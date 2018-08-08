package com.dieboldnixdorf.connector.camel.service;

import com.dieboldnixdorf.connector.camel.model.Endereco;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    public Endereco findAddress(String cep) {
        System.out.println(cep);
        Endereco endereco = new Endereco();
        endereco.setNumeroCep(cep);
        endereco.setNomeBairro("Sao Paulo");
        endereco.setDescricaoLogradouro("Av Francisco Morato - 1098");
        return endereco;
    }

}
