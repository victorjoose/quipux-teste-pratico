// 2. Dado um tempo em números, devemos convertê-lo em palavras da forma: 

// 6h → seis horas 
// 6:02 → seis e dois minutos 
// 6:10 → seis e dez minutos 
// 6h30 → seis e meia 
// 6h45 → seis e quarenta e cinco minutos 
// 6h55 → seis e cinquenta e cinco minutos

// Escribe un programa que imprima el tiempo en palabras para la entrada dada en  el formato mencionado arriba. 
// Formato de entrada:
// Se requieren dos líneas de entrada: 
// H, representando las horas 
// M, representando los minutos
// Requisitos  
// 1 ≤ X < 12 
// 0 ≤ X< 60 
// Formato de salida  
// Mostrar el tiempo en palabras 
// Ejemplo entrada 
// 2 
// 40 
// Ejemplo salida 
// dos y cuarenta minutos 


import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horas = lerHoras(scanner);
        int minutos = lerMinutos(scanner);
      
        String resultado = converterTempoParaPalavras(horas, minutos);
        System.out.println(resultado);

        scanner.close();
    }

  private static String converterTempoParaPalavras(int horas, int minutos) {
      String horaStr = HORAS[horas];
      String minutoStr = MINUTOS[minutos];

      String horaLabel = horas == 1 ? "hora" : "horas";
      String minutoLabel = minutos == 1 ? "minuto" : "minutos";

      if (minutos == 0) {
          return horaStr + " " + horaLabel + " " + horaLabel;
      } else if (minutos == 15) {
          return horaStr + " "+ horaLabel + " e quinze " + minutoLabel;
      } else if (minutos == 30) {
          return horaStr + " "+ horaLabel + " e meia";
      } else if (minutos == 45) {
          return horaStr + " "+ horaLabel + " e quarenta e cinco " + minutoLabel;
      } else {
          return horaStr + " " + horaLabel + " e " + minutoStr + " " + minutoLabel;
      }
  }

  private static int lerHoras(Scanner scanner) {
    int horas;
    while (true) {
        System.out.print("\nDigite um número de horas entre 1 e 11: ");
        horas = scanner.nextInt();
        if (horas >= 1 && horas <= 11) {
            break;
        } else {
            System.out.println("Hora inválida. Digite um valor entre 1 e 11.");
        }
    }
    return horas;
  }

  private static int lerMinutos(Scanner scanner) {
    int minutos;
    while (true) {
        System.out.print("\nDigite um núemro de minutos entre 0 e 59: ");
        minutos = scanner.nextInt();
        if (minutos >= 0 && minutos < 60) {
            break;
        } else {
            System.out.println("Minutos inválidos. Digite um valor entre 0 e 59.");
        }
    }
    return minutos;
  }

    private static final String[] HORAS = {
        "zero", "uma", "duas", "três", "quatro", "cinco", "seis", 
        "sete", "oito", "nove", "dez", "onze"
    };

  private static final String[] MINUTOS = {
      "zero", "um", "dois", "três", "quatro", "cinco", "seis", 
      "sete", "oito", "nove", "dez", "onze", "doze", "treze", 
      "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", 
      "dezenove", "vinte", "vinte e um", "vinte e dois", "vinte e três", 
      "vinte e quatro", "vinte e cinco", "vinte e seis", "vinte e sete", 
      "vinte e oito", "vinte e nove", "trinta", "trinta e um", 
      "trinta e dois", "trinta e três", "trinta e quatro", 
      "trinta e cinco", "trinta e seis", "trinta e sete", 
      "trinta e oito", "trinta e nove", "quarenta", "quarenta e um", 
      "quarenta e dois", "quarenta e três", "quarenta e quatro", 
      "quarenta e cinco", "quarenta e seis", "quarenta e sete", 
      "quarenta e oito", "quarenta e nove", "cinquenta", "cinquenta e um", 
      "cinquenta e dois", "cinquenta e três", "cinquenta e quatro", 
      "cinquenta e cinco", "cinquenta e seis", "cinquenta e sete", 
      "cinquenta e oito", "cinquenta e nove"
  };
}
