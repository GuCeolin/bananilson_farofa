
import java.util.ArrayList;
import java.util.List;

class Aluno{
 private String nome;
 private int matricula;

 public void fazerMatricula(){

 }
public void cancelarMatricula(){

}

@Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                '}';
    } 

}

class Curso{
    public String nome;
    public int creditos;
    public List<String> disciplinas;
    public List<Turma> turmas;
    

}

class Professor {
    private String nome;
    private int matricula;
    private String disciplina;

    public Aluno getAluno(){
        return aluno;
    }

    public void acessarTurma() {
        
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
    

}

class Turma{
    private int maxaluno = 60;
    private int minaluno = 3;
    private String materia;
    private Professor professor;
    public List<Aluno> alunos = new ArrayList<>();

    public Turma(String materia, Professor professor, List<Aluno> aluno) {
        this.materia = materia;
        this.professor = professor;
        this.aluno = aluno;
    }
      
    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return aluno;
    }

    public void setAlunos(List<Aluno> aluno) {
        this.aluno = aluno;
    }
}

class Secretaria {
    private List<Disciplina> disciplinas;
    private List<Professor> professores;
    private List<Aluno> alunos;

    public void gerarCurriculo() {
    }

    public void notificarPagamentos() {
        
    }
}

class Sistema {
    public void gerarBoleto() {
      
    }
}