/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.TratamentoDeDados;

public class Jogo implements TratamentoDeDados {

    private final static int QTD_CAMPOS = 6;
    public final static String ARQUIVOJOGOS = "jogos.csv";

    private String codJogo;
    private String nomeJogo;
    private String platJogo;
    private String genJogo;
    private String valorJogo;
    private String quantidade;

    

    /**
     * @return the nomeJogo
     */
    public String getNomeJogo() {
        return nomeJogo;
    }

    /**
     * @param nomeJogo the nomeJogo to set
     */
    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    /**
     * @return the plataformaJogo
     */
    public String getPlataformaJogo() {
        return platJogo;
    }

    /**
     * @param plataformaJogo the plataformaJogo to set
     */
    public void setPlataformaJogo(String plataformaJogo) {
        this.platJogo = plataformaJogo;
    }

    /**
     * @return the generoJogo
     */
    public String getGeneroJogo() {
        return genJogo;
    }

    /**
     * @param generoJogo the generoJogo to set
     */
    public void setGeneroJogo(String generoJogo) {
        this.genJogo = generoJogo;
    }

    /**
     * @return the valorJogo
     */
    public String getValorJogo() {
        return valorJogo;
    }

    /**
     * @param valorJogo the valorJogo to set
     */
    public void setValorJogo(String valorJogo) {
        this.valorJogo = valorJogo;
    }

    @Override
    public void materializar(String dados) throws Exception {
        String[] split = dados.split(DIVISOR);
        if (split.length != QTD_CAMPOS) {
            throw new RuntimeException("Quantidade de campos é inválida");
        }

        setCodJogo(split[0]);
        setNomeJogo(split[1]);
        setValorJogo(split[2]);
        setPlataformaJogo(split[3]);
        setGeneroJogo(split[4]);
        setQuantidade(split[5]);
        

    }

    @Override
    public String desmaterializar() {
        StringBuilder sbj = new StringBuilder();

        sbj.append(codJogo);
        sbj.append(DIVISOR);
        
        sbj.append(nomeJogo);
        sbj.append(DIVISOR);

        sbj.append(platJogo);
        sbj.append(DIVISOR);

        sbj.append(genJogo);
        sbj.append(DIVISOR);

        sbj.append(valorJogo);
        sbj.append(DIVISOR);
        
        sbj.append(quantidade);
        
        return sbj.toString();
        
    }
    
    public String toString() {
        return this.codJogo + ";" + this.nomeJogo +";" + this.valorJogo + ";" +this.quantidade +";"+ this.platJogo + ";" + this.genJogo ;

    }

    /**
     * @return the quantidade
     */
    public String getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the codJogo
     */
    public String getCodJogo() {
        return codJogo;
    }

    /**
     * @param codJogo the codJogo to set
     */
    public void setCodJogo(String codJogo) {
        this.codJogo = codJogo;
    }

}
