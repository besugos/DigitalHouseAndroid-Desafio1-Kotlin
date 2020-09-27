fun main() {

    println("\nTESTE DAS FUNCIONALIDADES DO DESAFIO KOTLIN")
    println("-------------------------------------------\n")
    println("Criação de novos alunos: ")

    val aluno1 = Aluno("Joao", "Silveira", 101)
    val aluno2 = Aluno("Jose", "Pereira", 102)
    val aluno3 = Aluno("Maria", "Nogueira", 103)
    val aluno4 = Aluno("Maisa", "Carvalho", 104)

    println(aluno1)
    println(aluno2)
    println(aluno3)
    println(aluno4)
    println()
    println("Criação de Professores Titulares:")

    val titular1 = ProfessorTitular("Nestor", "Tavares", 201, "história")
    val titular2 = ProfessorTitular("Nelson", "Pessanha", 202, "aritmética")

    println(titular1)
    println(titular2)

    println()
    println("Criação de Professores Titulares:")

    val adjunto1 = ProfessorAdjunto("Aristides", "Fernandes", 301, 10)
    val adjunto2 = ProfessorAdjunto("Alcebíades", "Quintanilha", 302, 20)

    println(adjunto1)
    println(adjunto2)

    println()
    println("Criação de Cursos:")

    val cursoHistoria = Curso("História", 401, 3)
    val cursoAritmetica = Curso("Aritmética", 402, 2)

    println(cursoHistoria)
    println(cursoAritmetica)

    println()
    println("Adição de alunos a um curso (método da classe Curso):")
    println("Para esse teste, tentaremos incluir 3 alunos no curso Aritmética (cujo máximo permitido é de dois alunos.")
    println("Inicialmente, o curso não tem nenhum aluno matriculado: ${cursoAritmetica.alunosMatriculados}")
    println("Adicionando o primeiro aluno (resultado esperado: 'true'): ${cursoAritmetica.adicionarUmAluno(aluno1)}")
    println("Adicionando o segundo aluno (resultado esperado: 'true'): ${cursoAritmetica.adicionarUmAluno(aluno2)}")
    println("Adicionando o terceiro aluno (resultado esperado: 'false', pois excede o máximo de alunos para o curso): ${cursoAritmetica.adicionarUmAluno(aluno3)}")
    println("Após as duas adições bem sucedidas, espera-se que o curso conte com 2 alunos matriculados: ${cursoAritmetica.alunosMatriculados.size}")
    println("Testaremos agora se os alunos adicionados foram corretamente armazenados. Os alunos adicionados foram:")
    println(aluno1)
    println(aluno2)
    println("E os alunos matriculados são: ")
    for (aluno in cursoAritmetica.alunosMatriculados) {
        println(aluno)
    }

    println()
    println("Agora testaremos o método excluir aluno. Para isso, solicitaremos a exclusão do aluno de código 101: ")
    cursoAritmetica.excluirUmAluno(aluno1)
    println("Para checar se o método foi bem sucedido, listaremos a quantidade de alunos matriculados e os dados dos alunos matriculados no curso:")
    println("Quantidade de alunos (resultado esperado: 1): ${cursoAritmetica.alunosMatriculados.size}")
    println("Dados do aluno matriculado (espera-se apenas um aluno, o de código 102): ")
    for (aluno in cursoAritmetica.alunosMatriculados) {
        println(aluno)
    }







}