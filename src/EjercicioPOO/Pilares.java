package EjercicioPOO;

public class Pilares {
    public static void main(String[] args) {
        Padre padre;

        //Creacion de un objeto de la clase Profesor
        padre = new Profesor(
                1, "Juan", "Lopez",
                33, "Agronomo", 20 );
        System.out.println("Los datos del profesor son:");
        padre.mostrarInfo();
        padre.marcarAsistencia();

        System.out.println();

        padre = new Estudiante(
                2, "Rene", "Sandoval",
                21, "Segundo año", "8.5");
        System.out.println("Los datos del estudiante son:");
        padre.mostrarInfo();
        padre.marcarAsistencia();

        System.out.println();

        padre = new Administrador(
                3, "Pedro","Rodriguez", 35, "Sonsonate", 40 );
        System.out.println("Los datos del administrador son:");
        padre.mostrarInfo();
        padre.marcarAsistencia();


    }
}

class Padre {
    protected int id;
    protected String nombre;
    protected String apellido;
    protected int edad;

    public Padre() {
    }

    public Padre(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void marcarAsistencia()
    {
        System.out.println("Un mensaje");
    }

    public void mostrarInfo() {
        System.out.println("INFORMACION DE LA CLASE...");
        System.out.println("El id de la persona es: " + id);
        System.out.println("El nombre de la persona es: " + nombre);
        System.out.println("El apellido de la persona es: " + apellido);
        System.out.println("La edad es: " + edad);
    }
}

class Profesor extends Padre{
        private String materia;
        private String especialidad;
        private int aniosExperiencia;

    public Profesor(){}

    public Profesor(int id, String nombre, String apellido, int edad, String especialidad, int aniosExperiencia) {
        super(id, nombre, apellido, edad);
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }
    @Override public void marcarAsistencia(){
        System.out.println("Soy un profesor y doy clases.");
    }
    public void prepararClase(){
        System.out.println("Soy un profesor y soy puntual.");
    }

    public void enseñar(){
        System.out.println("Soy un profesor y me gusta dar clases..");
    }

    public void evaluarEstudiantes(){
        System.out.println("Soy un profesor muy exigente..");
    }
}

class Estudiante extends Padre {
    private String grado;
    private String promedio;

    public Estudiante() {
    }

    public Estudiante(int id, String nombre, String apellido, int edad, String grado, String promedio) {
        super(id, nombre, apellido, edad);
        this.grado = grado;
        this.promedio = promedio;
    }

    @Override
    public void marcarAsistencia() {
        System.out.println("Soy un alumno y soy muy responsable");
    }

    public void tomarClase() {
        System.out.println("Soy un alumno y entrego mis tareas");
    }

    public void presentarTarea() {
        System.out.println("Soy un alumno y soy puntual");
    }

    public void hacerExamen() {
        System.out.println("Soy un alumno y estudio todos los dias");
    }
}

    class Administrador extends Padre{
            private String departamento;
            private int aniosExperiencia;

            public Administrador(){}

        public Administrador(int id, String nombre, String apellido, int edad, String departamento, int aniosExperiencia) {
            super(id, nombre, apellido, edad);
            this.departamento = departamento;
            this.aniosExperiencia = aniosExperiencia;
        }
        @Override public void marcarAsistencia(){
            System.out.println("Soy un administrador y soy pasciente");
        }
        public void gestionarPersonal(){
            System.out.println("Soy un administrador y controlo todo el sistema");
        }
        public void planificarEventos(){
            System.out.println("Soy un administrador y soy ordenado");
        }
        public void administrarPresupuesto(){
            System.out.println("Soy administrador y tengo muy buena administracion");
            }
        }