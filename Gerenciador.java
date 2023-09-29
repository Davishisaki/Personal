import java.util.ArrayList;

public class Gerenciador {
    private ArrayList<Lista> sistema;

    public Gerenciador() {
        sistema = new ArrayList<>();
    }

    public Lista buscarLista(String nome){
        for(int i = 0; i < sistema.size(); i++) {
            Lista lista = sistema.get(i);
            if (lista != null) {
                if (lista.getNome().equals(nome)) {
                    return lista;
                }
            }
        }
        return null;
    }
    public String criarLista(ArrayList<Produto> list, String nome) {
        Lista lista = buscarLista(nome);
        if (lista == null) {
            Lista nova = new Lista(null, nome);
            return "Criada";
        }
        return "Erro!";
    }

    public String listarListas() {
        String auxiliar = "";
        for(Lista lista:sistema){
            auxiliar = auxiliar + lista.toList() + "\n";
        }
        return auxiliar;
    }
}
