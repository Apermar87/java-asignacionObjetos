public class App {
    public static void main(String[] args) throws Exception {
        Avion a1 = new Avion("Airbus", 4);
        Avion a2;
        Avion a3 = new Avion("Boeing", 4);
        a2 = a1;

        a1.imprimirFabricante();
        a2.imprimirFabricante();
        System.out.println("");

        a1.setNombreFabricante("Douglas");
        a1.imprimirFabricante();
        a2.imprimirFabricante();
        System.out.println("");

        a1.cambiarFabricante(a2);
        a1.imprimirFabricante();
        a2.imprimirFabricante();
        
    }
}
