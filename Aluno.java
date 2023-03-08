public class Aluno {
    private String ra;
    private String name;
    private Curso discipline;

    public String getRa() {
        return ra;
    }

    public String getName() {
        return name;
    }

    public Curso getDiscipline() {
        return discipline;
    }

    Aluno(String ra, String name, Curso discipline) {
        this.ra = ra;
        this.name = name;
        this.discipline = discipline;
    }

    public static void main(String[] args) {
        CadastroAluno alunos = new CadastroAluno();

        Aluno aluno1 = new Aluno("081100001", "Johnny", Curso.ADMINISTRACAO);
        Aluno aluno2 = new Aluno("081100002", "Robert", Curso.ADMINISTRACAO);
        Aluno aluno3 = new Aluno("081100003", "Dianne", Curso.ADMINISTRACAO);
        Aluno aluno4 = new Aluno("081100004", "Franky", Curso.ADMINISTRACAO);
        Aluno aluno5 = new Aluno("081100005", "Django", Curso.ADMINISTRACAO);

        alunos.add(aluno4);
        alunos.add(aluno1);
        alunos.add(aluno5);
        alunos.add(aluno2);
        alunos.add(aluno3);

        System.out.println("Unsorted list");
        alunos.print();
        
        System.out.println("Sorted list");
        alunos.sort();
        alunos.print();
    }
}

class AlunoComparator implements java.util.Comparator<Aluno> {
    @Override
    public int compare(Aluno a, Aluno b) {
        return Integer.parseInt(a.getRa()) - Integer.parseInt(b.getRa());
    }
}