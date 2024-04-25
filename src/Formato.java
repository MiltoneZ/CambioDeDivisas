import java.util.Scanner;

public class Formato extends Operaciones{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        while(opcion != 3){
            // Imprime el menu del programa.
            System.out.println(Textos.topBar);
            System.out.println(Textos.menu);
            System.out.println("Digite el tipo que operacion que desea realizar: ");
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Numero 1");
                    break;
                case 2:
                    System.out.println("Numero 2");
                    break;
                case 3:
                    break;
            }
        }
    }
}