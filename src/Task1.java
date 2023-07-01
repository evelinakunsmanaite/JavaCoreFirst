public class Task1 {
    public static void main (){
        Students student = new Students("Lina","3eeb-1");
        Teachers teacher = new Teachers("Alina", "math");

        student.printInfo();
        System.out.println("Группа студента " + student.getGroup());
        teacher.printInfo();
        System.out.println("Предмет преподавателя " + teacher.getSubject());
    }
}
