
package classes;

import interfaces.TratamentoDeDados;

public class Cliente implements TratamentoDeDados {
    
    private final static int QTD_CAMPOS = 10;
    public final static String ARQUIVO = "clientes.csv";

    private String nome;
    private String dataNasc;
    private String cpf;
    
    private String endereco;
    private String bairro;
    private String cidade;
    private String uf;
    
    private String telefone1;
    private String telefone2;
    private String email;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dataNasc
     */
    public String getDataNasc() {
        return dataNasc;
    }

    /**
     * @param dataNasc the dataNasc to set
     */
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the uf
     */
    public String getUf() {
        return uf;
    }

    /**
     * @param uf the uf to set
     */
    public void setUf(String uf) {
        this.uf = uf;
    }

    /**
     * @return the telefone1
     */
    public String getTelefone1() {
        return telefone1;
    }

    /**
     * @param telefone1 the telefone1 to set
     */
    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    /**
     * @return the telefone2
     */
    public String getTelefone2() {
        return telefone2;
    }

    /**
     * @param telefone2 the telefone2 to set
     */
    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void materializar(String dados) throws Exception {
        String[] split = dados.split(DIVISOR);
        if (split.length != QTD_CAMPOS) {
            throw new RuntimeException("Quantidade de campos é inválida");
        }
        
        setNome(split[0]);
        setDataNasc(split[1]);
        setCpf(split[2]);
        
        setEndereco(split[3]);
        setBairro(split[4]);
        setCidade(split[5]);
        setUf(split[6]);
        
        setTelefone1(split[7]);
        setTelefone2(split[8]);
        setEmail(split[9]);
    }

    @Override
    public String desmaterializar() {
        StringBuilder sb = new StringBuilder();

        sb.append(nome);
        sb.append(DIVISOR);

        sb.append(dataNasc);
        sb.append(DIVISOR);

        sb.append(cpf);
        sb.append(DIVISOR);

        sb.append(endereco);
        sb.append(DIVISOR);

        sb.append(bairro);
        sb.append(DIVISOR);

        sb.append(cidade);
        sb.append(DIVISOR);

        sb.append(uf);
        sb.append(DIVISOR);

        sb.append(telefone1);
        sb.append(DIVISOR);

        sb.append(telefone2);
        sb.append(DIVISOR);

        sb.append(email);
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", dataNasc=" + dataNasc + ", cpf=" + cpf + ", endereco=" + endereco + ", bairro=" + bairro + ", cidade=" + cidade + ", uf=" + uf + ", telefone1=" + telefone1 + ", telefone2=" + telefone2 + ", email=" + email + '}';
    }

}
