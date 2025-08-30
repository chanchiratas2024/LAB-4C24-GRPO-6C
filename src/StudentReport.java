public class StudentReport {
    public void generateReport(StudentModel student) {
        System.out.println("Reporte del estudiante:");
        System.out.println("Nombre: " + student.getNombre());
        System.out.println("Edad: " + student.getEdad());
        System.out.println("----------------------------");
    }
}
