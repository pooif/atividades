import util.Bag;
import util.IBag;

class App {
	public static void main(String[] args) {
		System.out.println("Olá mundo!");

		IBag textos = new Bag(5);

    textos.add("um");
		textos.add("texto");
		textos.add("de");
		textos.add("exemplo");

    // Deveria sem restrito apenas a Strings, então ...
		textos.add(5); // não deveria compilar.

    System.out.println(textos);


		// Parametrizar o tipo na classe Bag para que as seguintes instrução funcionem:
		// IBag<String> nomes = new Bag<>(4);
		// nomes.add("Pierre");
		// nomes.add("Han");
		// nomes.add("Björn");
		// nomes.add(5); // esta instrução não deve compilar, mantenha comentada.

		// IBag<Integer> idades = new Bag<Integer>(4);
		// idades.add(45);
		// idades.add(54);
		// idades.add(67);


    // IBag<IBag<String>> bagDeBags = new Bag<>();

    // IBag<String> nomes = new Bag<>(3);
    // IBag<String> setores = new Bag<>(3);
    // IBag<String> funcoes = new Bag<>(3);

    // bagDeBags.add(nomes);
    // bagDeBags.add(setores);
    // bagDeBags.add(funcoes);

    // System.out.println(bagDeBags);
	}
}
