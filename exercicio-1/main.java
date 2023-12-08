public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CD cd1 = new CD(1,"the nutcracker",10,43);
        CD cd2 = new CD();
        cd2.inserirDados();
        
        DVD dvd1 = new DVD(1,"the nutcracker",10,43);
        DVD dvd2 = new DVD();
        dvd2.inserirDados();
        
        cd1.printDados();
        cd2.printDados();
        dvd1.printDados();
        dvd2.printDados();
    }
    
}
