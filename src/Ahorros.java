
public class Ahorros {
    private double saldo;
    private boolean debito;
    private boolean deposito;

    public Ahorros(double saldo) {
        this.saldo = saldo;
        this.debito = false;
        this.deposito = false;
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



