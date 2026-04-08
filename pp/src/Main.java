import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("DIGITE SU EDAD PARA VERIFICAR");
        int age=sc.nextInt();

        if (age>=18) {
            System.out.println("USTED ES MAYOR DE EDAD");
        }else {
            System.out.println("USTED ES MENOR DE EDAD");
        }

        }

}