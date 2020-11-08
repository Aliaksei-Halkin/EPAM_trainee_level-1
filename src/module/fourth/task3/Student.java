package module.fourth.task3;


/**
 * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
 * из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
 * номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */
public class Student {
    private String surnameAndInitials;
    private int numberGroup;
    private int[] effectiveness;

    public Student(String surnameAndInitials, int numberGroup, int[] effectiveness) {
        this.surnameAndInitials = surnameAndInitials;
        this.numberGroup = numberGroup;
        this.effectiveness = effectiveness;
    }

    public String getSurnameAndInitials() {
        return surnameAndInitials;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public int[] getEffectiveness() {
        return effectiveness;
    }
}
