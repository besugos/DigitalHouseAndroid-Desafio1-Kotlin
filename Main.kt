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
    val cursoAritmetica = Curso("Aritmética", 402, 3)

    println(cursoHistoria)
    println(cursoAritmetica)




}