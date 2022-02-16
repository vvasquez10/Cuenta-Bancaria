class CuentaBancaria{
    private double saldoCuentaCorriente;
    private double saldoAhorros;
    private String tipoCuenta;
    private static int cuentasCreadas=0;
    private long idCuenta;

    public CuentaBancaria(String tipoCuenta){
        CuentaBancaria.aumentaCuenta();
        this.tipoCuenta = tipoCuenta;
        if (this.tipoCuenta.toLowerCase()=="corriente"){
            this.saldoCuentaCorriente = 0;
        } else if((this.tipoCuenta.toLowerCase()=="ahorros")){
            this.saldoAhorros=0;
        }
        this.idCuenta = generaIdCuenta();
    }

    private static void aumentaCuenta(){
        CuentaBancaria.cuentasCreadas++;
    }

    public static void getCantidadCuentas(){
        System.out.println(cuentasCreadas);;
    }

    public double getSaldoCorriente(){        
        return this.saldoCuentaCorriente;
    }
    public double getSaldoAhorros(){
        return this.saldoAhorros;
    }

    public void abonaDinero(double monto){
        if (this.tipoCuenta.toLowerCase()=="corriente"){
            this.saldoCuentaCorriente+=monto;
        } else if (this.tipoCuenta.toLowerCase()=="ahorros"){
            this.saldoAhorros+=monto;
        } else{
            System.out.println("No se reconoce el tipo de cuenta.");
        }
    }

    public void retiraDinero(double monto){
        if (this.tipoCuenta.toLowerCase()=="corriente" && this.saldoCuentaCorriente >= monto){
            this.saldoCuentaCorriente-=monto;
        } else if (this.tipoCuenta.toLowerCase()=="ahorros" && this.saldoAhorros >= monto){
            this.saldoAhorros-=monto;
        } else{
            System.out.println("No se pudo realizar el retiro.");
        }
    }

    public void getSaldos(){
        if (this.tipoCuenta.toLowerCase()=="corriente"){
            System.out.println(this.idCuenta+" Saldo Cuenta Corriente: "+this.getSaldoCorriente());
        } else if (this.tipoCuenta.toLowerCase()=="ahorros"){
            System.out.println(this.idCuenta+" Saldo Cuenta de Ahorros: "+this.getSaldoAhorros());
        } 
    }

    private long generaIdCuenta(){
        long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;       
        return number;
    }
}