import java.util.Scanner;
public class Ativ4 {
    public static void main(String[] args) {
        
        int n=5;
        int num[]=new int[n];

        Scanner ler=new Scanner(System.in);
        System.out.println("Digite cinco numeros: ");
        for (int i = 0; i < num.length; i++) {
            
            num[i]=ler.nextInt();
        }
        for (int index = 0; index < num.length; index++) {
            
            if(num[index] %2!=0){
                System.out.println("o numero "+num[index]+ " é impar");

            }else{
                System.out.println("o numero "+ num[index]+" é par");
            }

        }


    }
}
