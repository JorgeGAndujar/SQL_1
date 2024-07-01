
package agenda;

public class Persona1 {
    //VARIABLES DE INSTANCIA (ATRIBUTOS)
    private String dni;
    private String nombre;
    private String paterno;
    private String dirección;
    private String telefono;
    private String nacimiento;
    private String foto;
    //CONSTRUCTORES

    public Persona1() {
        this.dni = "";
        this.nombre = "";
        this.paterno = "";
        this.dirección = "";
        this.telefono =  "";
        this.nacimiento = "";
        this.foto = "";
    }

    public Persona1(String dni, String nombre, String paterno, String dirección, String telefono, String nacimiento, String foto) {
        this.dni = dni;
        this.nombre = nombre;
        this.paterno = paterno;
        this.dirección = dirección;
        this.telefono = telefono;
        this.nacimiento = nacimiento;
        this.foto = foto;
    }
    //METODOS SET Y GET

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    //METODO TOSTRING
    @Override
    public String toString() {
        return "Persona1{" + "dni=" + dni + ", nombre=" + nombre + ", paterno=" + paterno + ", direcci\u00f3n=" + dirección + ", telefono=" + telefono + ", nacimiento=" + nacimiento + ", foto=" + foto + '}';
    }

    
}
