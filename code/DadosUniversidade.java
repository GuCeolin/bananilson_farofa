

import java.util.ArrayList;
import java.util.List;

public class DadosUniversidade {
    private List<Aluno> alunos;
    private List<Professor> professores;
    private List<Curso> cursos;
    private List<Turma> turmas;

    public DadosUniversidade() {
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.turmas = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        if (!alunos.contains(aluno)) {
            alunos.add(aluno);
        }
    }

    public void adicionarProfessor(Professor professor) {
        if (!professores.contains(professor)) {
            professores.add(professor);
        }
    }

    public void adicionarCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
        }
    }




public void adicionarTurma(Turma turma) {
    if (!turmas.contains(turma)) {
        turmas.add(turma);
    }
}

public List<Aluno> getAlunos() {
    return alunos;
}

public List<Professor> getProfessores() {
    return professores;
}

public List<Curso> getCursos() {
    return cursos;
}

public List<Turma> getTurmas() {
    return turmas;
}

@Override
public String toString() {
    return "DadosUniversidade{" +
            "alunos=" + alunos +
            ", professores=" + professores +
            ", cursos=" + cursos +
            ", turmas=" + turmas +
            '}';
}
}