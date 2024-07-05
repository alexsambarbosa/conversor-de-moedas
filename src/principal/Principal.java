package principal;

import service.GetApi;

import java.util.Scanner;

public class Principal {

    private Scanner read = new Scanner(System.in);
    private GetApi api = new GetApi();

    private final String URL_01 = "https://v6.exchangerate-api.com/v6/";
    private final String API_KEY = "91ad3d6941585f1eeccdccb8";
    private final String URL_02 = "/latest/USD";


    public void showMenu() {
        var option = -1;
        while (option != 0) {
            var menu = """
                    ***********************************************************
                    Seja bem-vindo(a) ao Conversor de Moedas
                    
                    1) Dólar =>> Real Brasileiro
                    2) Real Brasileiro =>> Dólar
                    3) Euro =>> Real Braileiro
                    4) Real Brasileiro =>> Euro
                    5) Libra Esterlina =>> Real Brasileiro
                    6) Real Braisileiro =>> Libra Esterlina
                   
                    0 - Sair
                    
                    Escolha uma opção válida:
                    ***********************************************************
                    """;

            System.out.println(menu);
            option = read.nextInt();
            read.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Test");
                    break;
            }
        }
    }


}
