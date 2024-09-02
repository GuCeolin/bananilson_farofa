

public class Secretaria {
    private DadosUniversidade dadosUniversidade;

    public Secretaria(DadosUniversidade dadosUniversidade) {
        this.dadosUniversidade = dadosUniversidade;
    }

    public void matricularAlunoEmTurma(Aluno aluno, Turma turma) {
        turma.adicionarAluno(aluno);
        aluno.matricularDisciplina(turma.getDisciplina());
    }

    public void cancelarMatricula(Aluno aluno, Turma turma) {
        turma.removerAluno(aluno);
        aluno.getCurriculo().removerDisciplina(turma.getDisciplina());
    }

    @Override
    public String toString() {
        return "Secretaria{" +
                "dadosUniversidade=" + dadosUniversidade +
                '}';
    }
}