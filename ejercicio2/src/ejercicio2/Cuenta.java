package ejercicio2;
public class Cuenta {
    private int id;
    private double saldo;

    //Constructores
    public Cuenta() {
    }

    public Cuenta(int id, double saldoDisponible) {
        this.id = id;
        this.saldo = saldoDisponible;
    }

   public Cuenta(Cuenta cuenta1){
       this.id = id;
       this.saldo = saldo;
   }
   
   // Getters y Setters
    public int getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "id=" + id + ", saldo=" + saldo + '}';
    }
   
}