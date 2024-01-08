public class alumno {
   
    private String dni;
    private String nombre;
    private String apellidos;
    private String email;

    public alumno(){

    }

    public alumno(String _dni, String _nombre, String _apellidos,String _email){
        this.dni=_dni;
        this.nombre=_nombre;
        this.apellidos=_apellidos;
        this.email=_email;
    }

    public String getDni(){
        return this.dni;
    }
    public void setDni(String _dni){
        this.dni=_dni;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String _nombre){
        this.nombre=_nombre;
    }
    public String getApellidos(){
        return this.apellidos;
    }
    public void setEmail(String _email){
        this.email=_email;
    }
    public String getEmail(){
        return this.email;
    }

}

