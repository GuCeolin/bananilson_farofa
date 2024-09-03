import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private String matricula;
    private Curriculo curriculo;
    private List<Disciplina> disciplinasObrigatorias;
    private List<Disciplina> disciplinasOptativas;

    public Aluno(String nome, String matricula, Curriculo curriculo) {
        this.nome = nome;
        this.matricula = matricula;
        this.curriculo = curriculo;
        this.disciplinasObrigatorias = new ArrayList<>();
        this.disciplinasOptativas = new ArrayList<>();
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

    public List<Disciplina> getDisciplinasObrigatorias() {
        return disciplinasObrigatorias;
    }

    public List<Disciplina> getDisciplinasOptativas() {
        return disciplinasOptativas;
    }

    public void matricularDisciplinaObrigatoria(Disciplina disciplina) {
        if (disciplinasObrigatorias.size() < 4) {
            disciplinasObrigatorias.add(disciplina);
            curriculo.adicionarDisciplina(disciplina);
        } else {
            System.out.println("Não é possível matricular em mais disciplinas obrigatórias.");
        }
    }

    public void matricularDisciplinaOptativa(Disciplina disciplina) {
        if (disciplinasOptativas.size() < 2) {
            disciplinasOptativas.add(disciplina);
            curriculo.adicionarDisciplina(disciplina);
        } else {
            System.out.println("Não é possível matricular em mais disciplinas optativas.");
        }
    }

    

    

    @Override
    public String toString() {
        return "Aluno: " + nome + "\n" +
               "Matrícula: " + matricula + "\n" +
               "Disciplinas Obrigatórias: " + disciplinasObrigatorias + "\n" +
               "Disciplinas Optativas: " + disciplinasOptativas + "\n" +
               curriculo + "\n";
    }
}
