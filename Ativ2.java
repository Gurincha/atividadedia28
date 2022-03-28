import java.util.Scanner;

public class Ativ2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        String funcionario[]=new String[n];
        for (int index = 0; index < funcionario.length; index++) {
            System.out.println("Digite o nome do funcionario");
            funcionario[index]=sc.next();
        }
        for (int i = 0; i < funcionario.length; i++) {
            System.out.println("Os funcionarios são: "+funcionario[i]);
        }
       
    }
}

