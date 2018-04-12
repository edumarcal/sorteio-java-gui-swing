/**
 * Agradeco a Deus pelo dom do conhecimento
 *
 * @author Eduardo Marcal
 *
 * Criado em: 09/01/15
 */
package dados;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Sortudo {

    ArrayList<Cliente> clientesArrayList = new ArrayList<>();
    
    protected Path arquivo = Paths.get("src/dados/dados.txt");
    
    DefaultTableModel modelo = new DefaultTableModel();    
    
    public void adicionar(Cliente cliente) {
        clientesArrayList.add(cliente);
        gravarTxt(arquivo);
    }

    public String leituraDeDados() {
        String texto = new String();
       /* BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo));*/
        
        for (int i = 0; i < clientesArrayList.size(); i++) {
            texto += clientesArrayList.get(i).nome + "." + clientesArrayList.get(i).produtoAdquirido+"\n";
        }
        //System.out.println(texto);
        return texto;
    }

    public void gravarTxt(Path path) {
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            bufferedWriter.write(leituraDeDados());
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String[] atualizarTabela(){
    String texto = leituraDeDados();
        String[] split = null;
        for (int i = 0; i < texto.length(); i++) {
            split = texto.split("\\.");
            //modelo.addRow(split);
        }
        System.out.println(Arrays.toString(split));
        return split;
    }
    
    public String ganhador(){
        Random random = new Random();
        int numGerado = random.nextInt(clientesArrayList.size());
        String vencedor = clientesArrayList.get(numGerado).nome;
        System.out.println(vencedor);
        return vencedor;
    }
}
