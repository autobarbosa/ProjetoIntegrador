package persistencia;

import classes.Cliente;
import interfacesgraficas.CadCliente;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class ClienteDAO {

    private final String nomeDoArquivo = "clientes.csv";
    
    public ArrayList<Cliente> recuperar() throws Exception {
        try {
            ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Cliente cliente = new Cliente();
                cliente.materializar(linha);
                listaDeClientes.add(cliente);
            }
            br.close();
            return listaDeClientes;
        } catch (FileNotFoundException notfound) {
            return new ArrayList<Cliente>();
        } catch (Exception erro) {
            throw erro;
        }
    }

    public void salvar(Cliente cliente) throws Exception {
       
         ArrayList<Cliente> listaDeClientes = this.recuperar();
         //cria o arquivo
         FileWriter fw = new FileWriter(nomeDoArquivo);
         //Criar o buffer do arquivo
         BufferedWriter bw =new BufferedWriter(fw);
         for(int pos=0;pos<listaDeClientes.size();pos++){
            Cliente aux = listaDeClientes.get(pos);
            if(!(aux.getCpf().equals(cliente.getCpf()))){
               bw.write(aux.desmaterializar()+"\n");
            }
         }
         bw.write(cliente.desmaterializar()+"\n");
         bw.close();
    }

    public void excluir(String cpf) throws Exception {
      try{
         ArrayList<Cliente> listaDeClientes = this.recuperar();
         //cria o arquivo
         FileWriter fw = new FileWriter(nomeDoArquivo);
         //Criar o buffer do arquivo
         BufferedWriter bw =new BufferedWriter(fw);
         for(int pos=0;pos<listaDeClientes.size();pos++){
            Cliente aux = listaDeClientes.get(pos);
            if(!(aux.getCpf().equals(cpf))){
               bw.write(aux.desmaterializar()+"\n");
            }
         }
         bw.close();
      }catch(Exception erro){
         throw erro;
      }
    } 
}
