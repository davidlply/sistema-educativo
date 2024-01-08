public class nota {
    alumno alum;
    asignatura asig;
    private int evaluacion;
    private int curso;
    private int valor;

    public nota(){}

    public nota(int _evaluacion, int _curso, int _valor, alumno _alum, asignatura _asig){
        this.evaluacion=_evaluacion;
        this.curso=_curso;
        this.valor=_valor;
        this.alum=_alum;
        this.asig=_asig;
    }

    public alumno getAlum() {
        return alum;
    }
    public void setAlum(alumno alum) {
        this.alum = alum;
    }
    public asignatura getAsig() {
        return asig;
    }
    public void setAsig(asignatura asig) {
        this.asig = asig;
    }
    public int getEvaluacion() {
        return evaluacion;
    }
    public void setEvaluacion(int evaluacion) {
        this.evaluacion = evaluacion;
    }
    public int getCurso() {
        return curso;
    }
    public void setCurso(int curso) {
        this.curso = curso;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }


}
