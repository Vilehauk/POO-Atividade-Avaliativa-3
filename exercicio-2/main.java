import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Moto> motos = new ArrayList<>();
        ArrayList<Carro> carros = new ArrayList<>();
        String select;
        boolean sair=false;
        Scanner scan = new Scanner(System.in);
        // Item (a)
        
        while(sair == false) {
            System.out.println("deseja cadastrar um carro ou uma moto?");
            select = scan.nextLine();
            if(select.equals("moto")) {
                Moto moto = new Moto();
                moto.insertData();
                motos.add(moto);
            } else if(select.equals("carro")) {
                Carro carro = new Carro();
                carro.insertData();
                carros.add(carro);
            }
            System.out.println("deseja parar de cadastrar?(s/n)");
            select = scan.nextLine();
            if(select.equals("s")) {
                sair = true;
            }
        }
        
        System.out.println("motos");
        for(int i=0;i<motos.size();i++) {
            motos.get(i).printDados();
        }
        
        System.out.println("carros");
        for(int i=0;i<carros.size();i++) {
            carros.get(i).printDados();
        }
        
        // Item (b)
        double preco_total = 0.0f;
        
        for(int i=0;i<motos.size();i++) {
            preco_total = preco_total + motos.get(i).getPreco();
            if(motos.get(i).getAno()>=2008) {   // aproveitando o for loop, isso n afeta o preco total como ele e contabilizado antes desse bloco
                motos.get(i).setPreco(motos.get(i).getPreco()*1.1f);
            }
        }
        for(int i=0;i<carros.size();i++) {
            preco_total = preco_total + carros.get(i).getPreco();
            if(carros.get(i).getKm()>100000.0f) {
                carros.get(i).setPreco(carros.get(i).getPreco()*0.92);
            }
        }
        System.out.println("preco total: "+preco_total);
        System.out.println();
        
        for(int i=0;i<motos.size();i++) {
            motos.get(i).printDados();
        }
        for(int i=0;i<carros.size();i++) {
            carros.get(i).printDados();
        }
    }
}
