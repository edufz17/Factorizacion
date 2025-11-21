import java.util.InputMismatchException;
import java.util.Scanner;

public class factorizacion {
    public static void main(String[] args) {
        Scanner esc1 = new Scanner(System.in);
        int n=1;
        int cont = 0;
        do {
            System.out.println("Introduce un numero para factorizar");
            try {
                n = esc1.nextInt();
                esc1.nextLine();
                if ( n < 0 ) System.out.println("Error, introduce un numero positivo");
            }catch(InputMismatchException e)
                    {
                        System.out.println("Entrada no valida");
                        esc1.nextLine();
                        n = -1;

                    }
                } while (n <= 0) ;
                for (int i = 2; i <= n; i++) {
                    cont = 0;
                    while (n % i == 0) {
                        cont++;
                        n /= i;
                    }
                    if (cont > 0) {
                        System.out.println("El divisor " + i + " se repite " + cont + " veces");
                    }
                }

            }
        }
