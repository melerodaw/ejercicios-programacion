package ejercicio1;
public class Empresa {
    // Declaración de atributos
    private Vehiculo[] vehiculosRegistrados;

    // Constructor por defecto
    public Empresa() {
        this.vehiculosRegistrados = new Vehiculo[0];
    }

    // Constructor por parámetros
    public Empresa(Vehiculo[] vehiculosRegistrados) {
        this.vehiculosRegistrados = vehiculosRegistrados;
    }
    
    // Constructor de copia
    public Empresa(Empresa e) {
        this.vehiculosRegistrados = e.vehiculosRegistrados;
    }
    
    // Declaración de getters (1 por atributo)
    public Vehiculo[] getVehiculosRegistrados() {
        return vehiculosRegistrados;
    }

    // Declaración de setters (1 por atributo)
    public void setVehiculosRegistrados(Vehiculo[] vehiculosRegistrados) {
        this.vehiculosRegistrados = vehiculosRegistrados;
    }
    
    // Declaración de métodos personalizados
    public boolean comprobarVehiculo(Vehiculo[] vR, Vehiculo v){
        for(int i=0; i < vR.length; i++){
            if(vR[i].getMatricula().equals(v.getMatricula())){
                return true;
            }
        }
        return false;
    }
    
    public void incorporarVehiculo(Vehiculo[] vR, Vehiculo v){
        if(comprobarVehiculo(vR, v) == false){
            
        }
    } 
            
          
//+ alquilarVehiculo(v: vehiculo): void


    // Declaración toString() (con @Override)
    @Override
    public String toString() {
        return "Empresa{" + "vehiculosRegistrados=" + vehiculosRegistrados + '}';
    }
    
}


