package persistencia;

import classes.Acessorios;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;


public class AcessoriosDAO {
    
    private final String arquivoAcessorios = "acessorios.csv";
    
    public ArrayList<Acessorios> recuperar() throws Exception {
        try {
            ArrayList<Acessorios> listaDeClientes = new ArrayList<Acessorios>();
            FileReader fr = new FileReader(arquivoAcessorios);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Acessorios cliente = new Acessorios();
                cliente.materializar(linha);
                listaDeClientes.add(cliente);
            }
            br.close();
            return listaDeClientes;
        } catch (FileNotFoundException notfound) {
            return new ArrayList<Acessorios>();
        } catch (Exception erro) {
            throw erro;
        }
    }
    
    public void salvar(Acessorios acessorios) throws Exception {
       
         ArrayList<Acessorios> listaDeClientes = this.recuperar();
         //cria o arquivo
         FileWriter fw = new FileWriter(arquivoAcessorios);
         //Criar o buffer do arquivo
         BufferedWriter bw =new BufferedWriter(fw);
         for(int pos=0;pos<listaDeClientes.size();pos++){
            Acessorios aux = listaDeClientes.get(pos);
            if(!(aux.getCodAcess().equals(acessorios.getCodAcess()))){
               bw.write(aux.desmaterializar()+"\n");
            }
         }
         bw.write(acessorios.desmaterializar()+"\n");
         bw.close();
    }
    
     public void excluir(String codAcess) throws Exception {
      try{
         ArrayList<Acessorios> listaDeClientes = this.recuperar();
         //cria o arquivo
         FileWriter fw = new FileWriter(arquivoAcessorios);
         //Criar o buffer do arquivo
         BufferedWriter bw =new BufferedWriter(fw);
         for(int pos=0;pos<listaDeClientes.size();pos++){
            Acessorios aux = listaDeClientes.get(pos);
            if(!(aux.getCodAcess().equals(codAcess))){
               bw.write(aux.desmaterializar()+"\n");
            }
         }
         bw.close();
      }catch(Exception erro){
         throw erro;
      }
    } 
}
