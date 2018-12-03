package classes;

import interfaces.TratamentoDeDados;

public class Acessorios implements TratamentoDeDados {

  

    private String codAcess;
    private String nomeAcessorio;
    private String ValorAcess;
    private String quantAcess;

    private final static int QTD_CAMPOS = 4;
    private static String ARQUIVOACESSORIOS = "acessorios.csv";

    /**
     * @return the codAcess
     */
    public String getCodAcess() {
        return codAcess;
    }

    /**
     * @param codAcess the codAcess to set
     */
    public void setCodAcess(String codAcess) {
        this.codAcess = codAcess;
    }

    /**
     * @return the nomeAcessorio
     */
    public String getNomeAcessorio() {
        return nomeAcessorio;
    }

    /**
     * @param nomeAcessorio the nomeAcessorio to set
     */
    public void setNomeAcessorio(String nomeAcessorio) {
        this.nomeAcessorio = nomeAcessorio;
    }

    /**
     * @return the ValorAcess
     */
    public String getValorAcess() {
        return ValorAcess;
    }

    /**
     * @param ValorAcess the ValorAcess to set
     */
    public void setValorAcess(String ValorAcess) {
        this.ValorAcess = ValorAcess;
    }

    /**
     * @return the quantidade
     */
    public String getQuantAcess() {
        return quantAcess;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantAcess(String quantAcess) {
        this.quantAcess = quantAcess;
    }

    @Override
    public void materializar(String dados) throws Exception {
        String[] split = dados.split(DIVISOR);
        if (split.length != QTD_CAMPOS) {
            throw new RuntimeException("Quantidade de campos é inválida");
        }

        setCodAcess(split[0]);
        setNomeAcessorio(split[1]);
        setValorAcess(split[2]);
        setQuantAcess(split[3]);

    }

    @Override
    public String desmaterializar() {

        StringBuilder acs = new StringBuilder();

        acs.append(codAcess);
        acs.append(DIVISOR);

        acs.append(nomeAcessorio);
        acs.append(DIVISOR);

        acs.append(ValorAcess);
        acs.append(DIVISOR);

        acs.append(quantAcess);

        return acs.toString();

    }

    public String toString() {
        return this.codAcess + ";" + this.nomeAcessorio + ";" + this.ValorAcess + ";" + this.quantAcess;

    }
}
