public class StudentController {
    public static void main(String[] args) {
        System.out.println("Iniciando sistema de estudiantes...");

        // Crear objeto del modelo (se agregará por Colaborador 2)
        StudentModel student = new StudentModel("Ana", 20);
        student.printData();

        // Crear objeto del reporte (hecho por Colaborador 1)
        StudentReport report = new StudentReport();
        report.generateReport(student);

        // Crear objeto de la vista (ya existente)
        StudentView view = new StudentView();
        view.display("Integración completada correctamente.");
    }
}
