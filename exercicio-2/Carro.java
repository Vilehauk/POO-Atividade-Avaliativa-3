import java.util.Scanner;

public class Carro extends Veiculos {
    private double km;

    /**
     * @return the km
     */
    public double getKm() {
        return km;
    }

    /**
     * @param km the km to set
     */
    public void setKm(double km) {
        this.km = km;
    }
    
    public void insertData() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("insira o modelo: ");
        this.setModelo( scan.nextLine());
        
        System.out.println("insira o preco: ");
        this.setPreco(Float.parseFloat(scan.nextLine()));
        
        System.out.println("insira o km: ");
        this.setKm(Float.parseFloat(scan.nextLine()));
    }
    
    public void printDados() {
        System.out.println("modelo: "+this.getModelo());
        System.out.printf("preco: %.2f\n",this.getPreco());
        System.out.println("km: "+this.km);
        System.out.println();
    }
    
    public Carro() {
        
    }
    
    public Carro(String modelo, double preco, double km) {
        super(modelo,preco);
        this.km = km;
    }
}
