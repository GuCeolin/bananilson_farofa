import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private List<Disciplina> disciplinas;

    public Curso(String nome, List<Disciplina> disciplinas) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>(disciplinas);
    }

    public String getNome() {
        return nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public int calcularTotalCreditos() {
        int totalCreditos = 0;
        for (Disciplina disciplina : disciplinas) {
            totalCreditos += disciplina.getCreditos();
        }
        return totalCreditos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Curso: ").append(nome).append("\n")
          .append("Total de Créditos: ").append(calcularTotalCreditos()).append("\n")
          .append("Disciplinas:\n");
        for (Disciplina disciplina : disciplinas) {
            sb.append("  ").append(disciplina).append("\n");
        }
        return sb.toString();
    }
}
    

