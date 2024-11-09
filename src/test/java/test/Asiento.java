package test;
public class Asiento{
    String color;
    int registro;
    int precio;
    void cambiarColor(String colo){
        switch (colo) {
            case "rojo":
                this.color="rojo";
                break;
            case  "verde":
                this.color="verde";
                break;
            case "negro":
                this.color="negro";
                break;
            case "blanco":
                this.color="blanco";
                break;
            case  "amarillo":
                this.color="amarillo";
                break;
            default:
                break;
        }
    }
    
}