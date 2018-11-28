/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import interfaces.TratamentoDeDados;

public class Jogo implements TratamentoDeDados {

    private final static int QTD_CAMPOS = 12;
    public final static String ARQUIVOJOGOS = "jogos.csv";

    private String nomeJogo;
    private String platJogo;
    private String genJogo;
    private String valorJogo;

    public Jogo() {

    }

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

        setNomeJogo(split[0]);
        setPlataformaJogo(split[1]);
        setGeneroJogo(split[2]);
        setValorJogo(split[3]);

    }

    @Override
    public String desmaterializar() {
        StringBuilder sbj = new StringBuilder();

        sbj.append(nomeJogo);
        sbj.append(DIVISOR);

        sbj.append(platJogo);
        sbj.append(DIVISOR);

        sbj.append(genJogo);
        sbj.append(DIVISOR);

        sbj.append(valorJogo);
        sbj.append(DIVISOR);
        return toString();
    }
    
    public String toString() {
        return "Nome " + this.nomeJogo + "\n"
                + "Plataforma " + this.platJogo + "\n"
                + "Gênero " + this.genJogo + "\n"
                + "Preço " + this.valorJogo;

    }

}
