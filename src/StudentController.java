public class StudentController {
    public static void main(String[] args) {
        System.out.println("Iniciando sistema de estudiantes...");

        StudentModel student = new StudentModel("Ana", 20);
        student.printData();

        StudentView view = new StudentView();
        view.display("Integración completada correctamente.");
    }
}
