public class Secretaria {
    private DadosUniversidade dadosUniversidade;

    public Secretaria(DadosUniversidade dadosUniversidade) {
        this.dadosUniversidade = dadosUniversidade;
    }

    public void matricularAlunoEmTurma(Aluno aluno, Turma turma) {
        turma.adicionarAluno(aluno);
    }

    public void cancelarMatricula(Aluno aluno, Turma turma) {
        turma.removerAluno(aluno);
    }

    @Override
    public String toString() {
        return "Secretaria{" +
                "dadosUniversidade=" + dadosUniversidade +
                '}';
    }
}
