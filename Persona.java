public class Persona {
    private String Nombre;
    private int cedula;
    private int edad;
    private int auxilio;
    private boolean Desplazado;
    private int Estrato;
//-------------------------------------------------
    public Persona() {
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public boolean isDesplazado() {
        return Desplazado;
    }
    public void setDesplazado(boolean desplazado) {
        Desplazado = desplazado;
    }
    public int getEstrato() {
        return Estrato;
    }
    public void setEstrato(int estrato) {
        Estrato = estrato;
    }
    public int getAuxilio() {
        return auxilio;
    }
    public void setAuxilio(int auxilio) {
        this.auxilio = auxilio;
    }
    
    
}
