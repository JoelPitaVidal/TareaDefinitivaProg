package validadornumeros;

import javax.swing.*;
import java.util.Scanner;

public class comprobarnumero implements Validador {
    public static void comprobador() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nomuero para comprobar paridad, o 0 para salir");
        Integer opcion = sc.nextInt();
        if (opcion == 0) {
            return;
        } else {
            if (Validador.esPar(opcion)) {
                JOptionPane.showMessageDialog(null, "ES PAR");
            } else {
                JOptionPane.showMessageDialog(null, "ES IMPAR");
            }
            comprobador();
        }
    }
}