import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Criando disciplinas
        Disciplina MecanicaDosFluidos = new Disciplina("Mecanica Dos Fluidos", 4, 9.0);
        Disciplina fisica = new Disciplina("Física", 4, 8.5);
        Disciplina mecanicaAutomotiva = new Disciplina("Mecânica Automotiva", 3, 0);
        Disciplina matematica = new Disciplina("Matemática", 4, 0);
        Disciplina quimica = new Disciplina("Química", 4, 0);
        Disciplina eletromagnetismo = new Disciplina("Eletromagnetismo", 4, 0);
        Disciplina estatistica = new Disciplina("Estatistica", 2, 0);
        Disciplina Carburadores = new Disciplina("Carburadores", 2, 0);

        // Criando curso
        Curso engenharias = new Curso("Engenharia", Arrays.asList(MecanicaDosFluidos, fisica));

        // Criando professor
        Professor profJoacir = new Professor("Joacir", Arrays.asList(MecanicaDosFluidos));

        // Criando aluno
        Curriculo curriculoAluno = new Curriculo();
        Aluno alunoJamal = new Aluno("Jamal", "0237", curriculoAluno);


        // Criando turma
        Turma turmaMatematica = new Turma(MecanicaDosFluidos, profJoacir);

        // Criando aluno
        Aluno alunoPedro = new Aluno("Pedro", "0657", curriculoAluno);

        // Matriculando o aluno em disciplinas obrigatórias
        alunoPedro.matricularDisciplinaObrigatoria(matematica);
        alunoPedro.matricularDisciplinaObrigatoria(fisica);
        alunoPedro.matricularDisciplinaObrigatoria(quimica);
        alunoPedro.matricularDisciplinaObrigatoria(eletromagnetismo);

        // Matriculando o aluno em disciplinas optativas
        alunoPedro.matricularDisciplinaOptativa(mecanicaAutomotiva);
        alunoPedro.matricularDisciplinaOptativa(Carburadores);

        // Criando dados da universidade
        DadosUniversidade dadosUniversidade = new DadosUniversidade();
        dadosUniversidade.adicionarAluno(alunoJamal);
        dadosUniversidade.adicionarProfessor(profJoacir);
        dadosUniversidade.adicionarCurso(engenharias);
        dadosUniversidade.adicionarTurma(turmaMatematica);

        // Criando secretaria
        Secretaria secretaria = new Secretaria(dadosUniversidade);

        // Matriculando aluno na turma
        secretaria.matricularAlunoEmTurma(alunoJamal, turmaMatematica);
        alunoJamal.matricularDisciplinaObrigatoria(fisica);
        

        
        

        // Gerando cobrança para o aluno
        SistemaDeCobrancas sistemaDeCobrancas = new SistemaDeCobrancas();
        sistemaDeCobrancas.gerarCobranca(alunoJamal, 1500.00);
        sistemaDeCobrancas.notificarAluno(alunoJamal);

        // Exibindo informações da universidade
        System.out.println(dadosUniversidade);

        // Exibindo informações da turma
        System.out.println(turmaMatematica);
    }
}
