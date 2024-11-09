package test;
public class Motor{
    int numeroCilindros;
    string tipo;
    int registro;
    void cambiarRegistro(int numero){
        this.registro=numero;

    }
    void asignarTipo(string cambio){
        if (cambio=="electrico") {
            this.tipo=cambio;

        }else if (cambio="gasolina") {
            this.tipo=cambio;
        }else{
            this.tipo=this.tipo;
        }
        
    }
}
