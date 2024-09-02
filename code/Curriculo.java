import java.util.ArrayList;
import java.util.List;

public class Curriculo {
    private List<Disciplina> disciplinas;

    public Curriculo() {
        this.disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        if (!disciplinas.contains(disciplina)) {
            disciplinas.add(disciplina);
        }
    }

    public double calcularCoeficienteRendimento() {
        double totalPontos = 0;
        int totalCreditos = 0;

        for (Disciplina disciplina : disciplinas) {
            totalPontos += disciplina.getNota() * disciplina.getCreditos();
            totalCreditos += disciplina.getCreditos();
        }

        return totalCreditos > 0 ? totalPontos / totalCreditos : 0;
    }

    @Override
    public String toString() {
        return "Curriculo{" +
                "disciplinas=" + disciplinas +
                '}';
    }
}