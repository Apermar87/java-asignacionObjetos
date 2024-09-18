public class Avion {
    private String nombreFabricante;
    private int motores;

    public Avion(String nombreFabricante, int motores) {
        this.nombreFabricante = nombreFabricante;
        this.motores = motores;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
    }

    public void imprimirFabricante(){
        System.out.println("Nombre del fabricante: " + nombreFabricante);
    }

    public void cambiarFabricante(Avion a){
        a.nombreFabricante = "Loockhead"; 
    }
    
}
