using System;

public class SalaryCalculator
{
  public static void main()
  {
    float valorSalario = float.parse(Console.ReadLine());
    float valorBeneficios = float.parse(Console.ReadLine());

    float valorImposto = 0;

    if (valorSalario >= 0 && valorSalario <= 1100)
    {
      valorImposto = 0.05F * valorSalario;
    }
    else if (valorSalario > 1100 && valorSalario <= 2500)
    {
      valorImpost = 0.10F * valorSalario;
    }
    else if (valorSalario > 2500)
    {
      valorImposto = 0.15F * valorSalario;
    }
    float saida = valorSalario - valorImposto + valorBeneficios;
    Console.WriteLine(saida.ToString("0.00"));
  }
}