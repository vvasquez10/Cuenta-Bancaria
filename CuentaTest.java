public class CuentaTest {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("ahorros");
        CuentaBancaria cuenta2 = new CuentaBancaria("corriente");
        
        cuenta1.abonaDinero(120);

        cuenta1.getSaldos();        

        CuentaBancaria.getCantidadCuentas();
    }            
}
