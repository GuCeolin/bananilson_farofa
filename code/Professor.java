

import java.util.List;

public class Professor {
    private String nome;
    private List<Disciplina> disciplinasMinistradas;

    public Professor(String nome, List<Disciplina> disciplinasMinistradas) {
        this.nome = nome;
        this.disciplinasMinistradas = disciplinasMinistradas;
    }

    public String getNome() {
        return nome;
    }

    public List<Disciplina> getDisciplinasMinistradas() {
        return disciplinasMinistradas;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        if (!disciplinasMinistradas.contains(disciplina)) {
            disciplinasMinistradas.add(disciplina);
        }
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", disciplinasMinistradas=" + disciplinasMinistradas +
                '}';

    }
}
