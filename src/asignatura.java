public class asignatura {
    private int codigo;
    private String asignatura;

    public asignatura(){}

    public asignatura(int _codigo, String _asignatura){
        this.codigo=_codigo;
        this.asignatura=_asignatura;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public void setCodigo(int _codigo){
        this.codigo=_codigo;
    }
    public String getAsignatura(){
        return this.asignatura;
    }
    public void setAsignatura(String _asignatura){
        this.asignatura=_asignatura;
    }
}
