import java.util.ArrayList;

public class Funcao {
    private ArrayList<Produto> produtos;

    public Funcao() {
        produtos = new ArrayList<>();
    }

    public Produto buscarProduto(String nome) {
        for(int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            if (produto != null) {
                if (produto.getNome().equals(nome)) {
                    return produto;
                }
            }
        }
        return null;
    }

    private boolean adicionarProdutoVetor(Produto novo) {
        return produtos.add(novo);
    }

    public boolean cadastrarProduto (String nome, Double valor, Double peso) {
        Produto produto = buscarProduto(nome);
        if (produto == null) {
            Produto novo = new Produto(nome, valor, peso);
            return produtos.add(produto);
        }
        return false;
    }

    public String listarProdutos () {
        String auxiliar = "";
        for(Produto produto:produtos){
            auxiliar = auxiliar + produto.getNome() + "\n";
        }
        return auxiliar;
    }

    public String mostrarDadosProduto () {
        String str="";

        for(Produto p:produtos){
            str += p.toString() + "\n";
        }
        return str;
    }
}
