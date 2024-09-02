package code;
public class Aluno {
    private final String nome;
    private final String matricula;
    private final Curriculo curriculo;

    public Aluno(String nome, String matricula, Curriculo curriculo) {
        this.nome = nome;
        this.matricula = matricula;
        this.curriculo = curriculo;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public Curriculo getCurriculo() {
        return curriculo;
    }

    public void matricularDisciplina(Disciplina disciplina) {
        curriculo.adicionarDisciplina(disciplina);
    }

    public double calcularCoeficienteRendimento() {
        return curriculo.calcularCoeficienteRendimento();
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", curriculo=" + curriculo +
                '}';
    }
}
