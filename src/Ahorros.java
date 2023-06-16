
public class Ahorros extends SuperClass {
    private double saldo;
    private boolean debito;
    private boolean deposito;


public Ahorros(){
    super();
}
    public Ahorros(String nombre, String apellido, String correo, int cedula, double saldo, boolean debito, boolean deposito) {
        super(nombre, apellido, correo, cedula);
        this.saldo = saldo;
        this.debito = debito;
        this.deposito = deposito;
    }





    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setDebito(boolean debito) {
        this.debito = debito;
    }

    public boolean getDebito() {
        return debito;
    }

    public void setDeposito(boolean deposito) {
        this.deposito = deposito;
    }

    public boolean getDeposito() {
        return deposito;
    }
}



