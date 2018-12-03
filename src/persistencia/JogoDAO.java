package persistencia;

import classes.Jogo;
import interfacesgraficas.CadJogo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author auto-bs
 */
public class JogoDAO {

    private final String arquivoJogos = "jogos.csv";

    public ArrayList<Jogo> recuperar() throws Exception {
        try {
            ArrayList<Jogo> listaDeJogos = new ArrayList<Jogo>();
            FileReader fr = new FileReader(arquivoJogos);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Jogo jogo = new Jogo();
                jogo.materializar(linha);
                listaDeJogos.add(jogo);
            }
            br.close();
            return listaDeJogos;
        } catch (FileNotFoundException notfound) {
            return new ArrayList<Jogo>();
        } catch (Exception erro) {
            throw erro;
        }
    }

    public void salvar(Jogo jogo) throws Exception {

        ArrayList<Jogo> listaDeJogos = this.recuperar();
        //cria o arquivo
        FileWriter fw = new FileWriter(arquivoJogos);
        //Criar o buffer do arquivo
        BufferedWriter bw = new BufferedWriter(fw);
        for (int pos = 0; pos < listaDeJogos.size(); pos++) {
            Jogo aux = listaDeJogos.get(pos);
            if (!(aux.getCodJogo().equals(jogo.getCodJogo()))) {
                bw.write(aux.desmaterializar() + "\n");
            }
        }
        bw.write(jogo.desmaterializar() + "\n");
        bw.close();
    }

    public void excluir(String codJogo) throws Exception {
        try {
            ArrayList<Jogo> listaDeJogos = this.recuperar();
            //cria o arquivo
            FileWriter fw = new FileWriter(arquivoJogos);
            //Criar o buffer do arquivo
            BufferedWriter bw = new BufferedWriter(fw);
            for (int pos = 0; pos < listaDeJogos.size(); pos++) {
                Jogo aux = listaDeJogos.get(pos);
                if (!(aux.getCodJogo().equals(codJogo))) {
                    bw.write(aux.desmaterializar() + "\n");
                }
            }
            bw.close();
        } catch (Exception erro) {
            throw erro;
        }
    }

}
