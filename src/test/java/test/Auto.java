package test;



public class Auto{
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static String cantidadCreados;
    int cantidadAsientos(){
        int contador=0;
        for(int i=0; i< this.asientos.length; i++){
            if (this.asientos[i] != null ) {
                contador=contador+1;
        

            }

            
        }
        return contador;


    }
    String verificarIntegridad(){
        if (this.motor.registro==this.registro) {
            int o=motor.registro;
            for(int i=0; i< this.asientos.length; i++){
                if (this.asientos[i] != null ) {
                    if (this.asientos[i].registro==o) {
                        return "Auto original";
                
                    
                    }else{
                        return "Las piezas no son originales";
                    }
                
                }
            }
            
        }else{
            return "Las piezas no son originales";
        }
    }
        

}