# 8.2 // Classes abstratas, Interfaces e Polimorfismo Paramétrico // IFrete


Implementar respeitando os fundamentos de Orientação a Objetos.

**Tópicos desta atividade:** classes abstratas, interfaces, classes concretas, parametrização de tipos, generics.

---

Refatorar o Sistema de Frete. Em [model](src/model/) há duas classes, [Frete](src/model/Frete.java) e [Produto](src/model/Produto.java), para um sistema de frete _rudimentar_. Reprojete para que o `enum Tipo` torne-se desnecessário e possa ser excluído. Faça isto subclassificando `Frete` conforme os testes a seguir. **Importante:** o `Frete` não poderá ser instanciado senão por uma de suas subclasses, portanto torne-o abstrato. Altere as instruções para a forma de Casos de Teste.

```java
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
// E que a seguinte linha seja impossível (não compile), Frete não pode ser instanciado:
// Frete f4 = new Frete(p1, p2, p3);


// Torne-o uma interface:
// IFrete if1= f1;
// System.out.println(if1.getValor()); // 32
// IFrete if2 = f2;
// System.out.println(if2.getValor()); // 12
```

<small>
  <blockquote>
    „A problem well stated is a problem half solved.“ <br> – Charles Kettering
  </blockquote>
</small>