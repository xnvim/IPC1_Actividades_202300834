public class Operaciones {

  // CONVERSION Y OPERACIONES:

  public static int convertir(String numero){

    numero = numero.toLowerCase();

    switch (numero){
      case "cero":
        return 0;
      case "uno":
        return 1;
      case "dos":
        return 2;
      case "tres":
        return 3;
      case "cuatro":
        return 4;
      case "cinco":
        return 5;
      case "seis":
        return 6;
      case "siete":
        return 7;
      case "ocho":
        return 8;
      case "nueve":
        return 9;
      default:
        return 99; // caso default, "99" para identificar que el "string" no pudo ser convertido
    }
  }

  public static double operar(int a, int b, int operacion){

    // convirtiendo valores de tipo int (a,b) a double (c,d) -> cubriendo division y raiz
    double c = a;
    double d = b;

    switch (operacion){
      case 1:
        return c + d;
      case 2:
        return c - d;
      case 3:
        return c * d;
      case 4:
        return c / d;
      case 5:
        return Math.pow(c, d); // el valor "c" sera elevado al valor "d"
      case 6:
        return Math.pow(c, 1.0/d); // la raiz "d" del valor "c"
      default:
        return 0; // caso default, no sucede ni provoca nada
    }
  }

}
