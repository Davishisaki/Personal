import java.util.ArrayList;

public class Lista {
    ArrayList<Produto> list;
    private String nome;

    public Lista(ArrayList<Produto> list, String nome) {
        this.list = list;
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Produto buscarProduto(String nome) {
        for(int i = 0; i < list.size(); i++) {
            Produto produto = list.get(i);
            if (produto != null) {
                if (produto.getNome().equals(nome)) {
                    return produto;
                }
            }
        }
        return null;
    }

    public String cadastrarProduto (String nome, Double valor, Double peso) {
        Produto produto = buscarProduto(nome);
        if (produto == null) {
            Produto novo = new Produto(nome, valor, peso);
            return "Cadastrado";
        }
        return "Erro!";
    }

    public String listarProdutos () {
        String auxiliar = "";
        for(Produto produto:list){
            auxiliar = auxiliar + produto.toString() + "\n";
        }
        return auxiliar;
    }

    public String mostrarDadosProduto () {
        String str="";

        for(Produto p:list){
            str += p.toString() + "\n";
        }
        return str;
    }

    public String removerProduto (String nome, double valor, double peso) {
        Produto produto = buscarProduto(nome);
        if (produto != null) {
            list.remove(produto);
            return "Removido";
        }
        return "Informações inválidas";
    }

    public String toList() {
        return "Nome: " + nome;
    }
}
