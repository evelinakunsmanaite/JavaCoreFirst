package first;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student) {
        int ranked = (int) (2 + Math.random() * 4);
        String rankedStr;
        switch (ranked) {
            case 2 -> rankedStr = "неудовлетворительно";
            case 3 -> rankedStr = "удовлетворительно";
            case 4 -> rankedStr = "хорошо";
            case 5 -> rankedStr = "отлично";
            default -> throw new IllegalStateException("Unexpected value: " + ranked);
        }

        System.out.println("\nПреподаватель " + name + " оценил студента " + student.getName() + " по предмету "
                + subject + " на оценку " + rankedStr);
    }
}
