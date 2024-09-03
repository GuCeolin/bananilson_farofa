public class Disciplina {
    private String nome;
    private int creditos;
    private double nota;

    public Disciplina(String nome, int creditos, double nota) {
        this.nome = nome;
        this.creditos = creditos;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public int getCreditos() {
        return creditos;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", creditos=" + creditos +
                ", nota=" + nota +
                '}';
    }
}
