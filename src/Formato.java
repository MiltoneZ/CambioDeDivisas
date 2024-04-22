import java.util.Scanner;

public class Formato {
    public static void main(String[] args) {
        System.out.println(Textos.topBar);
        System.out.println(Textos.menu);

        System.out.println("Digite el tipo que operacion que desea realizar: ");
        Scanner teclado = new Scanner(System.in);
        int opcion = Integer.parseInt(teclado.nextLine());

        switch (opcion){
            case 1:
                System.out.println("Numero 1");
        }
    }
}
