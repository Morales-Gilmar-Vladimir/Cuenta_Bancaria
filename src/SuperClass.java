public class SuperClass {
    private String Nombre;
    private String Apellido;
    private String correo;
    private int Cedula;
    private String Tipo_Cuenta;

    public SuperClass(String nombre, String apellido, String correo, int cedula, String tipo_Cuenta) {
        Nombre = nombre;
        Apellido = apellido;
        this.correo = correo;
        Cedula = cedula;
        Tipo_Cuenta = tipo_Cuenta;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int cedula) {
        Cedula = cedula;
    }

    public String getTipo_Cuenta() {
        return Tipo_Cuenta;
    }

    public void setTipo_Cuenta(String tipo_Cuenta) {
        Tipo_Cuenta = tipo_Cuenta;
    }



}
