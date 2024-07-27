import model.Frete;
import model.Frete.Tipo;
import model.Produto;

class App {
  public static void main(String[] args) {
    System.out.println("Olá mundo!");

    Produto p1 = new Produto("Produto 1", 150, 1500);
    Produto p2 = new Produto("Produto 2", 200, 2000);
    Produto p3 = new Produto("Produto 3", 400, 4000);

    Frete f1 = new Frete(Tipo.Correios, p1, p2, p3);
    System.out.println(f1.getValor()); // 32
    Frete f2 = new Frete(Tipo.Onibus, p1, p2, p3);
    System.out.println(f2.getValor()); // 12
    Frete f3 = new Frete(Tipo.Transportadora, p1, p2, p3);
    System.out.println(f3.getValor()); // 82

    // Reprojetar Frete com subclasses para que seja possível:
    // Frete f1 = new FreteCorreios(p1, p2, p3);
    // System.out.println(f1.getValor()); // 32
    // Frete f2 = new FreteOnibus(p1, p2, p3);
    // System.out.println(f2.getValor()); // 12
    // Frete f3 = new FreteTransportadora(p1, p2, p3);
    // System.out.println(f3.getValor()); // 82
    // E que a seguinte linha seja impossível (não compile), Frete não pode ser
    // instanciado:
    // Frete f4 = new Frete(p1, p2, p3);

    // Torne-o uma interface:
    // IFrete if1= f1;
    // System.out.println(if1.getValor()); // 32
    // IFrete if2 = f2;
    // System.out.println(if2.getValor()); // 12
  }
}
