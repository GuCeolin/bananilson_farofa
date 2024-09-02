

public class Main {
    public static void main(String[] args) {
        // Criando disciplinas
        Disciplina matematica = new Disciplina("Matemática", 4, 0);
        Disciplina fisica = new Disciplina("Física", 4, 0);

        // Criando currículo e curso
        Curriculo curriculoJoao = new Curriculo();
        Curso cursoEngenharia = new Curso("Engenharia", List.of(matematica, fisica));

        // Criando aluno e professor
        Aluno joao = new Aluno("João", "12345", curriculoJoao);
        Professor professorCarlos = new Professor("Carlos", List.of(matematica, fisica));

        
        // Criando turma
        Turma turmaMatematica = new Turma(matematica, professorCarlos);

        // Criando dados da universidade e secretaria
        DadosUniversidade dadosUniversidade = new DadosUniversidade();
        Secretaria secretaria = new Secretaria(dadosUniversidade);

        // Adicionando aluno e professor à universidade
        dadosUniversidade.adicionarAluno(joao);
        dadosUniversidade.adicionarProfessor(professorCarlos);
        dadosUniversidade.adicionarCurso(cursoEngenharia);
        dadosUniversidade.adicionarTurma(turmaMatematica);

        // Matriculando aluno em uma turma
        secretaria.matricularAlunoEmTurma(joao, turmaMatematica);

        // Gerando cobrança
        SistemaDeCobrancas sistemaDeCobrancas = new SistemaDeCobrancas();
        sistemaDeCobrancas.gerarCobranca(joao, 1500.00);
        sistemaDeCobrancas.notificarAluno(joao);

        // Exibindo informações
        System.out.println(dadosUniversidade);
        System.out.println(secretaria);
        System.out.println(joao);
        System.out.println(turmaMatematica);
    }
}