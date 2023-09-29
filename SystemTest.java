import java.util.ArrayList;

public class SystemTest {
    public static void main(String[] args) {
        
        Gerenciador teste = new Gerenciador();

        boolean retorno = teste.cadastrarProduto("arroz", 12.0, 3.0);
        System.out.println(retorno);

        retorno = teste.cadastrarProduto("arroz", 12.0, 3.0);
        System.out.println(retorno);

        retorno = teste.cadastrarProduto("molho", 7.0,0.120);
        System.out.println(retorno);
    }

}
