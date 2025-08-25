/*
  Josué Javier Carrera Soyós
  202300834
  LAB IPC1 "A"
 */

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String[] operaciones = {"Suma", "Resta", "Multiplicación", "División", "Potencia", "Raíz", "Salir"};
    int opcionSeleccionada;
    int a, b; // valores a realizar la operacion del usuario..

    do {

      System.out.println("MENU DE OPERACIONES:");
      // DESPLEGANDO MENU DE OPCIONES:
      int i = 0;
      for (String operacion : operaciones){
        System.out.println((i + 1) + ". " + operaciones[i]);
        i++;
      }

      // REGISTRANDO Y VALIDANDO OPCION:
      while (true){
        System.out.print("Elige una opción: "); // solicitando valor - opcion del menu
        if (input.hasNextInt()){
          opcionSeleccionada = input.nextInt();
          input.nextLine();
          if (opcionSeleccionada >= 1 && opcionSeleccionada <= 7){ //validando que este dentro del rango de opciones
            break;
          } else {
            System.out.println("Error: opción fuera de rango, eliga entre las opciones (1-7).");
          }
        } else {
          input.nextLine(); // limpiando o reiniciando el scanner-input, de lo contrario entra en bucle.. (nextint no consume el "\n") ._.
          System.out.println("Error: tipo de dato no válido, debe ser de tipo entero.");
        }
      }

      // MOSTRANDO LA OPCION SELECCIONADA:
      System.out.println("Opción seleccionada: " + operaciones[opcionSeleccionada - 1]);

      // SOLICITANDO VALORES SI EL USUARIO NO ESCOGIO SALIR:
      if (opcionSeleccionada != 7){

        // SOCILITANDO VALOR "a":
        while (true){
          System.out.print("Ingresa el valor de a: ");
          String valorA = input.nextLine().strip();
          if(Operaciones.convertir(valorA) != 99){ // "99" devuelto por convertir en el archivo Operaciones.java
            a = Operaciones.convertir(valorA);
            System.out.println("¡valor registrado!");
            break;
          } else {
            System.out.println("valor no válido, ingrese nuevamente el valor para a (String)");
          }
        }

        // SOLICITANDO VALOR "b":
        while (true){
          System.out.print("Ingresa el valor de b: ");
          String valorB = input.nextLine().strip();
          if(Operaciones.convertir(valorB) != 99){
            b = Operaciones.convertir(valorB);
            System.out.println("¡valor registrado!");
            break;
          } else {
            System.out.println("valor no válido, ingrese nuevamente el valor para a (String)");
          }
        }

        // MOSTRANDO OPERACION, VALORES Y RESULTADO:
        System.out.println("Opción seleccionada: " + operaciones[opcionSeleccionada - 1]);
        System.out.println("Valores ingresados: " + "a = " + a + ", b = " + b);
        System.out.print("Resultado: ");
        System.out.printf("%.2f", Operaciones.operar(a, b, opcionSeleccionada)); // "%.2f" -> dos posiciones decimales a mostrar (division y raiz)
        System.out.println("");
        System.out.println("====================");
      }

    } while (opcionSeleccionada != 7); // repitiendo hasta que el usuario escoga la opcion "7. Salir"


  }
}
