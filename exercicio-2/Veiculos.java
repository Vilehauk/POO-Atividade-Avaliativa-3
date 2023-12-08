/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Veiculos {
    private String modelo;
    private double preco;

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
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
    
    public void printDados() {
        System.out.println("modelo: "+this.modelo);
        System.out.printf("preco: %.2f\n"+this.preco);
    }
    
    public Veiculos() {
        
    }
    
    public Veiculos(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }
}
