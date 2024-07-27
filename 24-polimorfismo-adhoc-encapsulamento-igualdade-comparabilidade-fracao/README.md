# 2.4 // Polimorfismo adhoc, Encapsulamento, Igualdade e Comparabilidade // Fração


Implementar respeitando os fundamentos de Orientação a Objetos.

**Tópicos desta atividade:** polimorfismo, sobrecarga, encapsulamento, visibilidade, identidade, igualdade, equals e comparable/compareTo

---

Sobrecarregar o construtor de [Fracao](src/modelo/Fracao.java) para aceitar um `int` representando o valor inteiro, `double` (com até seis casas decimais) e `String` no formato _numero/numero_ como `"3/7"` com até 9 casas no numerador e denominador, por exemplo `"123456789/123456789"`.

Sobrecarregue o método `somar` na classe [Fracao](src/modelo/Fracao.java) para aceitar parâmetros `int`, `double` e `String`, nas mesmas regras acima.

**Casos de Teste:**

```java
Fracao f1 = new Fracao(5, 10);
System.out.println(f1); // 1/2
System.out.println(f1.toString().equals("1/2"));
System.out.println(f1.getNumerador() == 1);
System.out.println(f1.getDenominador() == 2);

Fracao f2 = new Fracao(3); // 3 inteiros
System.out.println(f2.getString().equals("3/1"));

Fracao f3 = new Fracao("30/40");
System.out.println(f3.getNumerador() == 3);
System.out.println(f3.getDenominador() == 4);
System.out.println(f3.getString().equals("3/4"));

Fracao f4 = new Fracao(0.345);
// https://www.wolframalpha.com/input/?i=rationalize+0.345
System.out.println(f4.getString().equals("69/200"));

Fracao f5 = new Fracao(0.4);
System.out.println(f5.getNumerador() == 2);
System.out.println(f5.getDenominador() == 5);
System.out.println(f5.getString().equals("2/5"));

// https://www.wolframalpha.com/input?i=1%2F2+%2B+2%2F1
f1.somar(2); // 1/2 + 2/1
System.out.println(f1.getString().equals("5/2"));

f1.somar(0.5); // 5/2 + 1/2
System.out.println(f1.getString().equals("3/1"));

f1.somar(0.2862); // https://www.wolframalpha.com/input/?i=rationalize+0.2862
System.out.println(f1.getString().equals("16431/5000"));

f3.somar("7/8");
System.out.println(f3.getNumerador() == 13);
System.out.println(f3.getDenominador() == 8);
System.out.println(f3.getString().equals("13/8"));

f3.somar(6.45);
System.out.println(f3.getNumerador() == 323);
System.out.println(f3.getDenominador() == 40);
System.out.println(f3.getString().equals("323/40"));
```


Avaliar a equivalência de `Fracao` com `equals`, dadas instâncias de `Fracao` devem retornar verdadeiro se possuem o mesmo valor.

**Casos de Teste:**

```java
Fracao f6 = new Fracao(1, 5);
Fracao f7 = new Fracao(1, 3);
Fracao f8 = new Fracao(125, 375);
Fracao f9 = new Fracao(15, 75);

System.out.println(f6.equals(f8) == false);
System.out.println(f6.equals(f9) == true);
System.out.println(f7.equals(f8) == true);

System.out.println(new Fracao("3/19").equals(new Fracao(3, 19)) == true);
```

Tornar `Fracao` comparável, através da implementação da interface `Comparable`.

**Casos de Teste:**

```java
Fracao f10 = new Fracao(2, 12);
Fracao f11 = new Fracao(3, 4);
Fracao f12 = new Fracao(9, 10);
Fracao f13 = new Fracao(5);
Fracao f14 = new Fracao(18, 24);

// Todas estas assertivas devem imprimir true
System.out.println(f10.compareTo(f11) < 0);
System.out.println(f12.compareTo(f11) > 0);
System.out.println(f13.compareTo(f12) > 0);
System.out.println(f11.compareTo(f14) == 0);

Comparable<Fracao> f15 = f10;
Comparable<Fracao> f16 = new Fracao(20, 120);
System.out.println(f15.compareTo((Fracao) f16) == 0);
System.out.println(f16.compareTo(f14) < 0);

Fracao[] fracoes = {f10, f11, f12, f13, f14};

// Classifique em ordem crescente através de java.util.Arrays

System.out.println(fracoes[0].equals(f10));
System.out.println(fracoes[1].equals(f11));
System.out.println(fracoes[2].equals(f14));
System.out.println(fracoes[3].equals(f12));
System.out.println(fracoes[4].equals(f13));
```

---
Obs.: os casos de teste não podem ser alterados, mas outros podem ser adicionados. Fique a vontade para adicionar códigos que imprimem ou separam os testes, por exemplo.


<small>
  <blockquote>
    "Weeks of coding can save you hours of planning." <br> - Unknown
  </blockquote>
</small>