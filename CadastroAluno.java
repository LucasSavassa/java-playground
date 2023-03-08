import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * CadastroAluno
 */
public class CadastroAluno {
    private List<Aluno> students;

    public CadastroAluno() {
        students = new ArrayList();
    }

    public void add(Aluno student) {
        this.students.add(student);
    }

    public void sort() {
        Collections.sort(students, new AlunoComparator());
    }

    public void print() {
        for (Aluno student : students) {
            System.out.println(String.format("Aluno %s", students.indexOf(student)));
            System.out.println(String.format("Nome: %s", student.getName()));
            System.out.println(String.format("Ra: %s", student.getRa()));
        }
    }
}