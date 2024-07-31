import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Student> students = new HashMap<>();

        students.put("Henry", new Student("Henry", 88));
        students.put("Omolola", new Student("Omolola", 90));
        students.put("Kendra", new Student("Kendra", 85));
        students.put("Wendy", new Student("Wendy", 95));

        students = increaseGrades(students);

        students.forEach((name, student) -> System.out.println(student));
    }

    public static Map<String, Student> increaseGrades(Map<String, Student> students) {
        for (Student student : students.values()) {
            int newGrade = (int) (student.getGrade() * 1.10);
            student.setGrade(Math.min(newGrade, 100)); // Ensuring the grade does not exceed 100
        }
        return students;
    }
}


