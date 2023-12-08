import java.util.Scanner;

public class DVD extends Midia {
    private int nFaixas;
    private int faixa;
    
    @Override
    public String getTipo() {
        return "DVD";
    }
    
    @Override
    public String getDetalhes() {
        return "codigo: "+this.getCodigo()+"\nnome: "+this.getNome()+"\npreco: "+this.getPreco()+"\nnumero de faixas: "+this.getnFaixas();
    }
    
    @Override
    public void inserirDados() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("insira o codigo do DVD: ");
        this.setCodigo(Integer.parseInt(scan.nextLine()));
        
        System.out.println("insira o nome do DVD: ");
        this.setNome(scan.nextLine());
        
        System.out.println("insira o preco do DVD: ");
        this.setPreco(Float.parseFloat(scan.nextLine()));
        
        System.out.println("insira a quantidade de musicas: ");
        this.setnFaixas(Integer.parseInt(scan.nextLine()));
    }
    
    public void setFaixa(int f) {
        this.faixa = f;
    }

    /**
     * @return the nFaixas
     */
    public int getnFaixas() {
        return nFaixas;
    }

    /**
     * @param nFaixas the nFaixas to set
     */
    public void setnFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }
    
    public DVD() {
        
    }
    
    public DVD(int c, String n, float p, int f) {
        super(c,n,p);
        this.nFaixas = f;
    }
}
