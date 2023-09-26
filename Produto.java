public class Produto {
   private String nome;
   private Double valor;
   private Double peso;


    public Produto (String nome, Double valor, Double peso){
        this.nome = nome;
        this.valor = valor;
        this.peso = peso; Object i;
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
    this.nome = nome;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String toString(){
        return "Nome: " + nome + "Peso: " + peso + "Valo: " + valor;
    }
}
