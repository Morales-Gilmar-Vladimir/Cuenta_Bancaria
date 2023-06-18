public class Cheques extends SuperClass {
    //Atributos
    private String titularC;
    private double saldo;
    private int claveC;
    private double retiro;

    public Cheques(){
        super();
    }
    public Cheques(String titularC, double saldo, int claveC, double retiro) {
        this.titularC = titularC;
        this.saldo = saldo;
        this.claveC = claveC;
        this.retiro = retiro;
    }

    public Cheques(String nombre, String apellido, String correo, int cedula, String titularC, double saldo, int claveC, double retiro) {
        super(nombre, apellido, correo, cedula);
        this.titularC = titularC;
        this.saldo = saldo;
        this.claveC = claveC;
        this.retiro = retiro;
    }

    //Setters y Getters
    public String getTitularC() {
        return titularC;
    }

    public void setTitularC(String titularC) {
        this.titularC = titularC;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getClaveC() {
        return claveC;
    }

    public void setClaveC(int claveC) {
        this.claveC = claveC;
    }
    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Su saldo es "+ saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void corriente(){
        System.out.println("Esta es una cuenta corriente");
    }
}