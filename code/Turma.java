import java.util.ArrayList;
import java.util.List;

public class Turma {
    private Disciplina disciplina;
    private Professor professor;
    private List<Aluno> alunos;
    private boolean ativa;

    private static final int MIN_ALUNOS = 3;
    private static final int MAX_ALUNOS = 60;

    public Turma(Disciplina disciplina, Professor professor) {
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = new ArrayList<>();
        this.ativa = false; // Inicia como não ativa
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void adicionarAluno(Aluno aluno) {
        if (alunos.size() < MAX_ALUNOS) {
            alunos.add(aluno);
            System.out.println("Aluno " + aluno.getNome() + " matriculado em " + disciplina.getNome());
        } else {
            System.out.println("A disciplina " + disciplina.getNome() + " atingiu o limite máximo de 60 alunos.");
        }
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public void finalizarPeriodoMatriculas() {
        if (alunos.size() >= MIN_ALUNOS) {
            ativa = true;
            System.out.println("A disciplina " + disciplina.getNome() + " será oferecida no próximo semestre.");
        } else {
            ativa = false;
            System.out.println("A disciplina " + disciplina.getNome() + " foi cancelada por não ter alunos suficientes.");

        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Turma de ").append(disciplina.getNome()).append("\n")
          .append("Professor: ").append(professor.getNome()).append("\n")
          .append("Alunos (").append(alunos.size()).append("):\n");
        for (Aluno aluno : alunos) {
            sb.append("  ").append(aluno.getNome()).append(" - Matrícula: ").append(aluno.getMatricula()).append("\n");
        }
        sb.append("Status: ").append(ativa ? "Ativa" : "Cancelada").append("\n");
        return sb.toString();
    }
}
