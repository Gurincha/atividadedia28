public class Ativ3{
    public static void main(String[] args) {
        
        String meses[]={"Janeiro", "Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};

        System.out.println("1° Semestre:");
        for (int i = 0; i < (meses.length)/2; i++) {
            System.out.println(meses[i]);

        }
        System.out.println("2° Semestre:");
        for (int index = 6; index < meses.length; index++) {
            System.out.println(meses[index]);
        }
    }
}