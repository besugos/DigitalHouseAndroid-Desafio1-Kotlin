fun main() {

    println("\nTESTE DAS FUNCIONALIDADES DO DESAFIO KOTLIN")
    println("-------------------------------------------\n")
    println("Teste de criação de novos alunos: ")

    val aluno1 = Aluno("Joao", "Silveira", 101)
    val aluno2 = Aluno("Jose", "Pereira", 102)
    val aluno3 = Aluno("Maria", "Nogueira", 103)
    val aluno4 = Aluno("Maisa", "Carvalho", 104)

    println(aluno1)
    println(aluno2)
    println(aluno3)
    println(aluno4)
    println("-----------------------------------------------------------------------------------------------------------------------------------------")
    println()
    println("Teste de criação de Professores Titulares:")

    val titular1 = ProfessorTitular("Nestor", "Tavares", 201, "história")
    val titular2 = ProfessorTitular("Nelson", "Pessanha", 202, "aritmética")

    println(titular1)
    println(titular2)
    println("-----------------------------------------------------------------------------------------------------------------------------------------")

    println()
    println("Teste de criação de Professores Adjuntos:")

    val adjunto1 = ProfessorAdjunto("Aristides", "Fernandes", 301, 10)
    val adjunto2 = ProfessorAdjunto("Alcebíades", "Quintanilha", 302, 20)

    println(adjunto1)
    println(adjunto2)
    println("-----------------------------------------------------------------------------------------------------------------------------------------")

    println()
    println("Teste de criação de Cursos:")

    val cursoHistoria = Curso("História", 401, 3)
    val cursoAritmetica = Curso("Aritmética", 402, 2)

    println(cursoHistoria)
    println(cursoAritmetica)
    println("-----------------------------------------------------------------------------------------------------------------------------------------")

    println()
    println("Teste de adição de alunos a um curso (método da classe Curso):")
    println("Para esse teste, tentaremos incluir 3 alunos no curso Aritmética (cujo máximo permitido é de dois alunos)\n")
    println("Inicialmente, o curso não tem nenhum aluno matriculado: ${cursoAritmetica.alunosMatriculados}")
    println("Adicionando o primeiro aluno (resultado esperado: 'true'): ${cursoAritmetica.adicionarUmAluno(aluno1)}")
    println("Adicionando o segundo aluno (resultado esperado: 'true'): ${cursoAritmetica.adicionarUmAluno(aluno2)}")
    println("Adicionando o terceiro aluno (resultado esperado: 'false', pois excede o máximo de alunos para o curso): ${cursoAritmetica.adicionarUmAluno(aluno3)}")
    println("\nApós as duas adições bem sucedidas, espera-se que o curso conte com 2 alunos matriculados: ${cursoAritmetica.alunosMatriculados.size}")
    println()
    println("Testaremos agora se os alunos adicionados foram corretamente armazenados. Os alunos adicionados foram:")
    println(aluno1)
    println(aluno2)
    println("\nE os alunos matriculados são: ")
    for (aluno in cursoAritmetica.alunosMatriculados) {
        println(aluno)
    }
    println("-----------------------------------------------------------------------------------------------------------------------------------------")

    println()
    println("Teste do método excluirAluno(). Para isso, solicitaremos a exclusão do aluno de código 101:")
    cursoAritmetica.excluirUmAluno(aluno1)
    println("Para checar se o método foi bem sucedido, listaremos a quantidade de alunos matriculados e os dados dos alunos matriculados no curso:\n")
    println("Quantidade de alunos (resultado esperado: 1): ${cursoAritmetica.alunosMatriculados.size}")
    println("Dados do aluno matriculado (espera-se apenas um aluno, o de código 102): ")
    for (aluno in cursoAritmetica.alunosMatriculados) {
        println(aluno)
    }
    println("-----------------------------------------------------------------------------------------------------------------------------------------")

    println()
    println("Teste da criação de uma matrícula para o aluno adicionado acima: ")
    val testeMatricula = Matricula(aluno1,cursoAritmetica)
    println(testeMatricula)
    println("-----------------------------------------------------------------------------------------------------------------------------------------")

    println()
    println("Teste dos métodos da classe DigitalHouseManager.")
    println("Para isso, instanciaremos um objeto digitalHouseManager, para nossos testes.")
    val digitalHouseManager = DigitalHouseManager()
    println("E então mostraremos o estado inicial do objeto, com todas suas listas vazias:\n")
    println("Lista de Alunos: ${digitalHouseManager.listaDeAlunos} | Lista de Professores: ${digitalHouseManager.listaDeProfessores} | " +
            "Lista de Cursos: ${digitalHouseManager.listaDeCursos} | Lista de Matriculas: ${digitalHouseManager.listaDeMatriculas}")
    println("-----------------------------------------------------------------------------------------------------------------------------------------")
    println()
    println("Teste do método registrarCurso(). Para isso incluiremos dois cursos na Lista de Cursos: ")
    digitalHouseManager.registrarCurso(cursoAritmetica.nomeCurso, cursoAritmetica.codigoCurso, cursoAritmetica.qtdMaxAlunos)
    digitalHouseManager.registrarCurso(cursoHistoria.nomeCurso, cursoHistoria.codigoCurso, cursoHistoria.qtdMaxAlunos)
    println("Como resultado, agora temos nossa nova lista:\n")
    for (curso in digitalHouseManager.listaDeCursos) {
        println(curso)
    }
    println("-----------------------------------------------------------------------------------------------------------------------------------------")
    println()
    println("Teste do método excluirCurso(). Excluiremos o curso de História (401)")
    digitalHouseManager.excluirCurso(401)
    println("Estado da Lista de Cursos após a exclusão (resultado esperado: apenas deve ser listado o curso Aritmética):\n")
    for (curso in digitalHouseManager.listaDeCursos) {
        println(curso)
    }
    println("-----------------------------------------------------------------------------------------------------------------------------------------")
    println()
    println("Teste do método registrarProfessorAdjunto(). Para isso utilizaremos os professores adjuntos previamente criados.")
    digitalHouseManager.registrarProfessorAdjunto(adjunto1.nome, adjunto1.sobrenome, adjunto1.codigoProfessor, adjunto1.horasMonitoria)
    digitalHouseManager.registrarProfessorAdjunto(adjunto2.nome, adjunto2.sobrenome, adjunto2.codigoProfessor, adjunto2.horasMonitoria)
    println("Após o registro dos professores adjuntos, espera-se agora que a Lista de Professores agora os contenha:\n")
    for (professor in digitalHouseManager.listaDeProfessores) {
        println(professor)
    }

    println("-----------------------------------------------------------------------------------------------------------------------------------------")
    println()
    println("Teste do método registrarProfessorTitular(). Para isso utilizaremos os professores titulares previamente criados.")
    digitalHouseManager.registrarProfessorTitular(titular1.nome, titular1.sobrenome, titular1.codigoProfessor, titular1.especialidade)
    digitalHouseManager.registrarProfessorTitular(titular2.nome, titular2.sobrenome, titular2.codigoProfessor, titular2.especialidade)
    println("Após o registro dos professores titulares, espera-se agora que a Lista de Professores agora os contenha, além dos adjuntos adicionados previamente:")
    println("Vale notar que o tempo de casa de todos os professores registrados é igual a zero, conforme especificado.\n")
    for (professor in digitalHouseManager.listaDeProfessores) {
        println(professor)
    }
    println("-----------------------------------------------------------------------------------------------------------------------------------------")
    println()
    println("Teste do método excluirProfessor(). Para isso excluiremos o Professor Adjunto ${adjunto2.nome} ${adjunto2.sobrenome}, com código ${adjunto2.codigoProfessor}.")
    digitalHouseManager.excluirProfessor(adjunto2.codigoProfessor)
    println("Como resultado, espera-se que a lista contenha apenas os demais professores:\n")
    for (professor in digitalHouseManager.listaDeProfessores) {
        println(professor)
    }





}