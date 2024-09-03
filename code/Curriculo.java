import java.util.ArrayList;
import java.util.List;

public class Curriculo {
    private List<Disciplina> disciplinas;

    public Curriculo() {
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public double calcularCoeficienteRendimento() {
        double somaNotas = 0;
        int somaCreditos = 0;
        for (Disciplina disciplina : disciplinas) {
            somaNotas += disciplina.getNota() * disciplina.getCreditos();
            somaCreditos += disciplina.getCreditos();
        }
        return (somaCreditos > 0) ? somaNotas / somaCreditos : 0.0;
    }

    @Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Currículo:\n");
    for (Disciplina disciplina : disciplinas) {
        sb.append("  ").append(disciplina).append("\n");
    }
    return sb.toString();
}

}
