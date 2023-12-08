
import java.util.Scanner;

public class Midia {
    private int codigo;
    private double preco;
    private String nome;
    
    public String getTipo() {
        return "midia";
    }
    
    public String getDetalhes() {
        return "codigo: "+this.getCodigo()+"\nnome: "+this.getNome()+"\npreco: "+this.getPreco();
    }
    
    public void printDados() {
        System.out.println(this.getTipo());
        System.out.println(this.getDetalhes());
    }
    
    public void inserirDados() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("insira o codigo da midia: ");
        this.setCodigo(Integer.parseInt(scan.nextLine()));
        
        System.out.println("insira o nome da midia: ");
        this.setNome(scan.nextLine());
        
        System.out.println("insira o preco da midia: ");
        this.setPreco(Float.parseFloat(scan.nextLine()));
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Midia() {
    }
    
    public Midia(int c, String n, double p) {
        this.nome = n;
        this.codigo = c;
        this.preco = p;
    }
}
