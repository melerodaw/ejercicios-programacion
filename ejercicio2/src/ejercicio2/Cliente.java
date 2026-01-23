package ejercicio2;
public class Cliente {
    private Cuenta account;
    
    //Constructores

    public Cliente() {
    }

    public Cliente(Cuenta account) {
        this.account = account;
    }
    
    public Cliente(Cliente c1) {
        this.account = account;
    }
    
    //Getters y Setters

    public Cuenta getAccount() {
        return account;
    }

    public void setAccount(Cuenta account) {
        this.account = account;
    }
    
    //Metodos
    public void ingresar(double saldo, double dinero){
        // que el ingreso sea > 0.
        if(dinero <= 0){
            System.out.println("Debes introducir una cantidad superior a 0.");
        } else {
            saldo += dinero;
            this.account.setSaldo(saldo);
            System.out.println("Operacion realizada con exito.");
        }
    }
    
    public void retirar(double saldo, double dinero){
        // que saldo sea >= dinero a retirar. retirada numero positivo        
        if(saldo < dinero){
            System.out.println("Operacion cancelada: no puedes retirar mas de lo que tienes acumulado en la cuenta.");
        }else if(dinero <= 0){
            System.out.println("Debes introducir una cantidad superior a 0.");
        }else{
            saldo -= dinero;
            this.account.setSaldo(saldo);
            System.out.println("Operacion realizada con exito");
        }
}
    
    public void consultar(double saldo){
        System.out.println("Tu saldo es: " + saldo);
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "account=" + account + '}';
    }
    
    
}
