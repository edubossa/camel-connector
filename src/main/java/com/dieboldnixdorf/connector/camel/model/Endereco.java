package com.dieboldnixdorf.connector.camel.model;


import java.io.Serializable;

public class Endereco implements Serializable {

    private String identificador;
    private String numeroCep;
    private String numeroCid;
    private String siglaSistema;
    private String codigoRetorno;
    private String siglaUnidadeFederacao;
    private String nomeMunicipio;
    private String nomeBairro;
    private String descricaoLogradouro;
    private String descricaoComplemento1;
    private String descricaoComplemento2;
    private String identificadorCorreios;
    private String descricaoAbreviadaMunicipio;
    private String descricaoAbreviadaBairro;
    private String descricaoAbreviadaLogradouro;

    public Endereco() {
    }

    public Endereco(String numeroCep) {
        this.numeroCep = numeroCep;
        this.identificador = "LGR004";
        this.numeroCid = "0000";
        this.siglaSistema = "DCD";
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNumeroCep() {
        return numeroCep;
    }

    public void setNumeroCep(String numeroCep) {
        this.numeroCep = numeroCep;
    }

    public String getSiglaUnidadeFederacao() {
        return siglaUnidadeFederacao;
    }

    public void setSiglaUnidadeFederacao(String siglaUnidadeFederacao) {
        this.siglaUnidadeFederacao = siglaUnidadeFederacao;
    }

    public String getNomeMunicipio() {
        return nomeMunicipio;
    }

    public void setNomeMunicipio(String nomeMunicipio) {
        this.nomeMunicipio = nomeMunicipio;
    }

    public String getNomeBairro() {
        return nomeBairro;
    }

    public void setNomeBairro(String nomeBairro) {
        this.nomeBairro = nomeBairro;
    }

    public String getDescricaoLogradouro() {
        return descricaoLogradouro;
    }

    public void setDescricaoLogradouro(String descricaoLogradouro) {
        this.descricaoLogradouro = descricaoLogradouro;
    }

    public String getDescricaoComplemento1() {
        return descricaoComplemento1;
    }

    public void setDescricaoComplemento1(String descricaoComplemento1) {
        this.descricaoComplemento1 = descricaoComplemento1;
    }

    public String getDescricaoComplemento2() {
        return descricaoComplemento2;
    }

    public void setDescricaoComplemento2(String descricaoComplemento2) {
        this.descricaoComplemento2 = descricaoComplemento2;
    }

    public String getIdentificadorCorreios() {
        return identificadorCorreios;
    }

    public void setIdentificadorCorreios(String identificadorCorreios) {
        this.identificadorCorreios = identificadorCorreios;
    }

    public String getDescricaoAbreviadaMunicipio() {
        return descricaoAbreviadaMunicipio;
    }

    public void setDescricaoAbreviadaMunicipio(String descricaoAbreviadaMunicipio) {
        this.descricaoAbreviadaMunicipio = descricaoAbreviadaMunicipio;
    }

    public String getDescricaoAbreviadaBairro() {
        return descricaoAbreviadaBairro;
    }

    public void setDescricaoAbreviadaBairro(String descricaoAbreviadaBairro) {
        this.descricaoAbreviadaBairro = descricaoAbreviadaBairro;
    }

    public String getDescricaoAbreviadaLogradouro() {
        return descricaoAbreviadaLogradouro;
    }

    public void setDescricaoAbreviadaLogradouro(String descricaoAbreviadaLogradouro) {
        this.descricaoAbreviadaLogradouro = descricaoAbreviadaLogradouro;
    }

    public String getNumeroCid() {
        return numeroCid;
    }

    public void setNumeroCid(String numeroCid) {
        this.numeroCid = numeroCid;
    }

    public String getSiglaSistema() {
        return siglaSistema;
    }

    public void setSiglaSistema(String siglaSistema) {
        this.siglaSistema = siglaSistema;
    }

    public String getCodigoRetorno() {
        return codigoRetorno;
    }

    public void setCodigoRetorno(String codigoRetorno) {
        this.codigoRetorno = codigoRetorno;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "identificador='" + identificador + '\'' +
                ", numeroCep='" + numeroCep + '\'' +
                ", numeroCid='" + numeroCid + '\'' +
                ", siglaSistema='" + siglaSistema + '\'' +
                ", codigoRetorno='" + codigoRetorno + '\'' +
                ", siglaUnidadeFederacao='" + siglaUnidadeFederacao + '\'' +
                ", nomeMunicipio='" + nomeMunicipio + '\'' +
                ", nomeBairro='" + nomeBairro + '\'' +
                ", descricaoLogradouro='" + descricaoLogradouro + '\'' +
                ", descricaoComplemento1='" + descricaoComplemento1 + '\'' +
                ", descricaoComplemento2='" + descricaoComplemento2 + '\'' +
                ", identificadorCorreios='" + identificadorCorreios + '\'' +
                ", descricaoAbreviadaMunicipio='" + descricaoAbreviadaMunicipio + '\'' +
                ", descricaoAbreviadaBairro='" + descricaoAbreviadaBairro + '\'' +
                ", descricaoAbreviadaLogradouro='" + descricaoAbreviadaLogradouro + '\'' +
                '}';
    }

}

