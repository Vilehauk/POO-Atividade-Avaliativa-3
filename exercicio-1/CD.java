
import java.util.Scanner;

public class CD extends Midia {
    private int nMusicas;
    private int musica;
    
    @Override
    public String getTipo() {
        return "CD";
    }
    
    @Override
    public String getDetalhes() {
        return "codigo: "+this.getCodigo()+"\nnome: "+this.getNome()+"\npreco: "+this.getPreco()+"\nn de musicas: "+this.getnMusicas();
    }
    
    @Override
    public void inserirDados() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("insira o codigo do CD: ");
        this.setCodigo(Integer.parseInt(scan.nextLine()));
        
        System.out.println("insira o nome do CD: ");
        this.setNome(scan.nextLine());
        
        System.out.println("insira o preco do CD: ");
        this.setPreco(Float.parseFloat(scan.nextLine()));
        
        System.out.println("insira a quantidade de musicas: ");
        this.setnMusicas(Integer.parseInt(scan.nextLine()));
    }
    
    public void setMusica(int m) {
        this.musica = m;
    }

    /**
     * @return the nMusicas
     */
    public int getnMusicas() {
        return nMusicas;
    }

    /**
     * @param nMusicas the nMusicas to set
     */
    public void setnMusicas(int nMusicas) {
        this.nMusicas = nMusicas;
    }
    
    public CD() {
        
    }
    
    public CD(int c, String n, double p, int m) {
        super(c,n,p);
        this.nMusicas = m;
    }
}
