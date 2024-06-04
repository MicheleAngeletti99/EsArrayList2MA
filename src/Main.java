import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> lista = new ArrayList<>();
        lista.add(new Student("Daniele", 21));
        lista.add(new Student("Carlo", 20));
        lista.add(new Student("Alberto", 20));
        lista.add(new Student("Elena", 20));
        lista.add(new Student("Tommaso", 21));
        lista.add(new Student("Francesca", 21));
        lista.add(new Student("Barbara", 21));
        lista.add(new Student("Alessandro", 20));
        lista.add(new Student("Elisa", 21));
        lista.add(new Student("Federico", 20));
        lista.add(new Student("Caterina", 21));
        lista.add(new Student("Sofia", 20));

        System.out.println("Lista iniziale");
        for (Student student : lista) {
            student.stampaDettagli();
        }

        // Ordino la lista per nome
        lista.sort(Comparator.comparing(Student::getName));
        System.out.println("Lista ordinata");
        for (Student student : lista) {
            student.stampaDettagli();
        }
    }
}