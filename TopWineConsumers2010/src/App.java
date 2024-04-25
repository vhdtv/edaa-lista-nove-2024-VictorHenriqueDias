import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;

public class App {
    static ArrayList<Drinks> listaDeDrinks = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        lerArquivo();
        ordenarPorWineServings();
    }

    public static void lerArquivo() {
        String ArquivoCSV = "C:\\Users\\vhdtv\\Desktop\\Faculdade\\Programação\\edaa-lista-nove-2024-VictorHenriqueDias\\TopWineConsumers2010\\src\\drinks.csv";
        try {
            Scanner scanner = new Scanner(new File(ArquivoCSV));
            if (scanner.hasNextLine())
                scanner.nextLine();

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String delimitador = ",";
                String[] coluna = linha.split(delimitador);
                String country = coluna[0];
                Integer beerServings = Integer.parseInt(coluna[1]);
                Integer spiritServings = Integer.parseInt(coluna[2]);
                Integer wineServings = Integer.parseInt(coluna[3]);
                Double totalLitresOfPureAlcohol = Double.parseDouble(coluna[4]);

                listaDeDrinks.add(new Drinks(country, beerServings, spiritServings, wineServings, totalLitresOfPureAlcohol));

            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found:" + ArquivoCSV);
        }
    }

    public static void ordenarPorWineServings() {
        Collections.sort(listaDeDrinks);
        System.out.println("Paises ordenados em ordem crescente por consumo de vinho:");
        for (Drinks drink : listaDeDrinks) {
            System.out.println(drink);
        }
    }
}
