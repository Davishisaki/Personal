import java.util.ArrayList;
import java.util.Scanner;

public class App {
    
    private static Scanner e;
    private static Gerenciador geren;
    private static Lista lista;

    private static String menu(){
        String str = "";
        str+="1 - Cadastrar Produto\n";
        str+="2 - Buscar Produtos\n";
        str+="3 - Criar listas\n";
        str+="4 - Ver listas disponíveis\n";
        str+="5 - Excluir produtos\n";
        str+="6 - Ver detalhes sobre os produtos selecionados\n";
        
        str+="0 - Sair\n";

        return str;
    }

    private static void cadastrarProduto(){
        String nome;
        Double valor, peso;
        Produto produto;

        System.out.println("###Cadastro de Produto###");
        System.out.println("Digite o nome:");
        nome = e.nextLine();
        System.out.println("Digite o valor:");
        valor = e.nextDouble();
        System.out.println("Digite o peso:");
        peso = e.nextDouble();
        
        String ret = lista.cadastrarProduto(nome, valor, peso);

        if(ret != null){
            System.out.println("Pessoa cadastrada!");
        }else{
            System.out.println("Problema ao cadastrar!");
        }
    }

    private static void listarProdutos(){
        System.out.println("Produtos");
        System.out.println(lista.listarProdutos());
    }

    private static void listarListas(){
        System.out.println("Listas");
    }
}
