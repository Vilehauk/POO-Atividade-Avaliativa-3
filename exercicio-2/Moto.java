
import java.util.Scanner;

public class Moto extends Veiculos {
    private int ano;

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void insertData() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("insira o modelo: ");
        this.setModelo(scan.nextLine());
        
        System.out.println("insira o preco: ");
        this.setPreco(Float.parseFloat(scan.nextLine()));
        
        System.out.println("insira o ano: ");
        this.setAno(Integer.parseInt(scan.nextLine()));
    }
    
    @Override
    public void printDados() {
        System.out.println("modelo: "+this.getModelo());
        System.out.printf("preco: %.2f\n",this.getPreco());
        System.out.println("ano: "+this.ano);
        System.out.println();
    }
    
    public Moto() {
        
    }
    
    public Moto(String modelo, double preco, int ano) {
        super(modelo,preco);
        this.ano = ano;
    }
}
