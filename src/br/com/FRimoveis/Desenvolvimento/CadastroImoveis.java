/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.FRimoveis.Desenvolvimento;

/**
 *
 * @author rodrigolima
 */
public class CadastroImoveis {

    private String idimovel = "";
    private String statusImovel;
    private String enderecoImovel = "";
    private String bairroImovel = "";
    private String cepImovel = "";
    private String numeroImovel = "";
    private String matriculaImovel = "";
    private String imagensUrl = "";
    private double aluguelCasa;
    private String pesquisar = "";
    
    
    public String getIdimovel() {
        return idimovel;
    }

    public void setIdimovel(String idimovel) {
        this.idimovel = idimovel;
    }

    public String getStatusImovel() {
        return statusImovel;
    }

    public void setStatusImovel(String statusImovel) {
        this.statusImovel = statusImovel;
    }

    public String getEnderecoImovel() {
        return enderecoImovel;
    }

    public void setEnderecoImovel(String enderecoImovel) {
        this.enderecoImovel = enderecoImovel;
    }

    public String getBairroImovel() {
        return bairroImovel;
    }

    public void setBairroImovel(String bairroImovel) {
        this.bairroImovel = bairroImovel;
    }

    public String getCepImovel() {
        return cepImovel;
    }

    public void setCepImovel(String cepImovel) {
        this.cepImovel = cepImovel;
    }

    public String getNumeroImovel() {
        return numeroImovel;
    }

    public void setNumeroImovel(String numeroImovel) {
        this.numeroImovel = numeroImovel;
    }

    public String getMatriculaImovel() {
        return matriculaImovel;
    }

    public void setMatriculaImovel(String matriculaImovel) {
        this.matriculaImovel = matriculaImovel;
    }

    public double getAluguelCasa() {
        return aluguelCasa;
    }

    public void setAluguelCasa(double aluguelCasa) {
        this.aluguelCasa = aluguelCasa;
    }

    public String getImagensUrl() {
        return imagensUrl;
    }

    public void setImagensUrl(String imagensUrl) {
        this.imagensUrl = imagensUrl;
    }

    public String getPesquisar() {
        return pesquisar;
    }

    public void setPesquisar(String pesquisar) {
        this.pesquisar = pesquisar;
    }

}
