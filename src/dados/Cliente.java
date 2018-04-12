/**
 * Agradeco a Deus pelo dom do conhecimento
 *
 * @author Eduardo Marcal
 *
 * Criado em: 09/01/15
 */
package dados;

public class Cliente {

    protected String nome;
    protected String produtoAdquirido;

    public Cliente(String nome, String produto) {
        this.nome = nome;
        this.produtoAdquirido = produto;
    }

    public String getNome() {
        return nome;
    }

    public String getProdutoAdquirido() {
        return produtoAdquirido;
    }
}
