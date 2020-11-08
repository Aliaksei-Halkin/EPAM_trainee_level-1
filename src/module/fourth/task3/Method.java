package module.fourth.task3;

public class Method {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("Иванов А.М.", 15, new int[]{7, 8, 9, 4, 5});
        students[1] = new Student("Петров М.С.", 15, new int[]{7, 6, 9, 4, 5});
        students[2] = new Student("Сидоров А.Ч", 14, new int[]{0, 8, 13, 4, 5});
        students[3] = new Student("Карасева В.М.", 14, new int[]{9, 9, 9, 10, 9});
        students[4] = new Student("Холодов В.С.", 15, new int[]{10, 8, 8, 4, 5});
        students[5] = new Student("Макаревич В.В.", 15, new int[]{5, 2, 9, 4, 5});
        students[6] = new Student("Селезнева М.А.", 14, new int[]{10, 10, 10, 10, 10});
        students[7] = new Student("Яцына А.М.", 14, new int[]{5, 8, 9, 9, 5});
        students[8] = new Student("Якуто А.Л", 15, new int[]{11, 8, 9, 8, 5});
        students[9] = new Student("Николаева В.В.", 15, new int[]{8, 8, 9, 4, 9});

        printExcellentStudent(students);
    }

    static void printExcellentStudent(Student[] students) {
        for (Student st : students) {
            int minNumber = 10;

            for (int i = 0; i < st.getEffectiveness().length; i++) {
                if (st.getEffectiveness()[i] < minNumber) {
                    minNumber = st.getEffectiveness()[i];
                }
                exceptionInGradeStudent(st, i);
            }
            if (minNumber >= 9) {
                System.out.println("Student " + st.getSurnameAndInitials() + " from group " + st.getNumberGroup() +
                        " is excellent");
            }
        }

    }

    private static void exceptionInGradeStudent(Student st, int i) {
        try {
            if (st.getEffectiveness()[i] > 10 || st.getEffectiveness()[i] < 1)
                throw new Exception("the rating does not exist");
        } catch (Exception e) {
            System.out.println(e.getMessage() + " for the Student " + st.getSurnameAndInitials() +
                    " this grade is " + st.getEffectiveness()[i]);
        }
    }

}
