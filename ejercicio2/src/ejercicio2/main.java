package ejercicio2;
public class main {
    public static void main(String[] args) {
        Cuenta acc1 = new Cuenta();
        acc1.setId(0);
        acc1.setSaldo(1200.25);
        
        Cliente c1 = new Cliente();
        c1.setAccount(acc1);
        
        c1.consultar(acc1.getSaldo());

        c1.ingresar(acc1.getSaldo(), 300.40);
        c1.consultar(acc1.getSaldo());
        
        c1.retirar(acc1.getSaldo(), 150.99);
        c1.consultar(acc1.getSaldo());
        
        
        //System.out.println(c1.toString());
    }
    
}
