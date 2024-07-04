package edu.yitzhak.firstweek.variables;

public class Variables {
  public static void main(String[] args) {
    // Declaração de variáveis
    int age = 25;
    double height = 1.75;
    String name = "Yitzhak";
    char sex = 'M';
    boolean isHuman = true;

    // Variaveis com CAIXA ALTA são constantes, "final" indica que não pode ser
    // alterada e um valor fixo.

    final double PI = 3.14159265359;

    short shortNumber = 10;
    int normalNumber = shortNumber;
    short normalNumber2 = (short) normalNumber;

    System.out.println("shortNumber: " + normalNumber2);

    // Impressão de variáveis
    System.out.println("Idade: " + age);
    System.out.println("Altura: " + height);
    System.out.println("Nome: " + name);
    System.out.println("Sexo: " + sex);
    System.out.println("Humano: " + isHuman);

  }
}
