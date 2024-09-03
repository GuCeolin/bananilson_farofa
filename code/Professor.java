import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private List<Disciplina> disciplinasMinistradas;

    public Professor(String nome, List<Disciplina> disciplinasMinistradas) {
        this.nome = nome;
        this.disciplinasMinistradas = new ArrayList<>(disciplinasMinistradas);
    }

    public String getNome() {
        return nome;
    }

    public List<Disciplina> getDisciplinasMinistradas() {
        return disciplinasMinistradas;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinasMinistradas.add(disciplina);
    }

    public void listarAlunosPorDisciplina(Turma turma) {
        if (disciplinasMinistradas.contains(turma.getDisciplina())) {
            System.out.println("Alunos matriculados na disciplina " + turma.getDisciplina().getNome() + ":");
            for (Aluno aluno : turma.getAlunos()) {
                System.out.println("  " + aluno.getNome() + " - Matrícula: " + aluno.getMatricula());
            }
        } else {
            System.out.println("O professor " + nome + " não ministra a disciplina " + turma.getDisciplina().getNome());
        }
    }

    @Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Professor: ").append(nome).append("\nDisciplinas Ministradas:\n");
    for (Disciplina disciplina : disciplinasMinistradas) {
        sb.append("  ").append(disciplina).append("\n");
    }
    return sb.toString();
}

}
