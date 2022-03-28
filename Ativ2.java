public class Ativ2 {
    public static void main(String[] args) {
        


        String produto[]=new String[10];
        produto[0]="amendoim";
        produto[1]="cana de açucar";
        produto[2]="soja";
        produto[3]="café";
        produto[4]="carne";
        produto[5]="arroz";
        produto[6]="trigo";
        produto[7]="gasolina";
        produto[8]="milhor";
        produto[9]="algodão";

        int estoque[]=new int[10];
        estoque[0]=100;
        estoque[1]=5000;
        estoque[2]= 60;
        estoque[3]= 20;
        estoque[4]=15;
        estoque[5]=60;
        estoque[6]=100;
        estoque[7]=7;
        estoque[8]=60;
        estoque[9]=100;

        for (int i = 0; i < produto.length; i++) {
            System.out.println("O produto "+produto[i]+" tem "+estoque[i]+" unidades em estoque");
            
        }



    }
}

