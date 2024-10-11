class Alumnos {
    private String matricula;
    private String nombre;
    private double estructura;
    private double ingles;
    private double iot;
    private double promedio;

    public Alumnos(String matricula, String nombre) {
        //inicializar el nombre y matrivula del alumno
        this.matricula = matricula;
        this.nombre = nombre;
    }

    public void setEstructura(double estructura) {
        this.estructura = estructura;
    }

    public void setIngles(double ingles) {
        this.ingles = ingles;
    }

    public void setIot(double iot) {
        this.iot = iot;
    }

    public void setPromedio() {
        this.promedio = (estructura + ingles + iot) / 3;  // Calcular promedio general
    }

    public double getEstructura() {
        return estructura;
    }

    public double getIngles() {
        return ingles;
    }

    public double getIot() {
        return iot;
    }

    public double getPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula + ", Nombre: " + nombre + ", Promedio: " + promedio;
    }
}