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
    println("Iniciamos mostrando o conteúdo da Lista de Professores, que deve estar vazia:")
    println(digitalHouseManager.listaDeProfessores)
    digitalHouseManager.registrarProfessorAdjunto(adjunto1.nome, adjunto1.sobrenome, adjunto1.codigoProfessor, adjunto1.horasMonitoria)
    digitalHouseManager.registrarProfessorAdjunto(adjunto2.nome, adjunto2.sobrenome, adjunto2.codigoProfessor, adjunto2.horasMonitoria)
    println("\nApós o registro dos professores adjuntos, espera-se agora que a Lista de Professores agora os contenha:\n")
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
    println("Teste do método excluirProfessor(). Para isso excluiremos o Professor Adjunto ${adjunto2.nome} ${adjunto2.sobrenome}, " +
            "com código ${adjunto2.codigoProfessor}, e o Professor Titular ${titular2.nome} ${titular2.sobrenome}, com código ${titular2.codigoProfessor}")
    digitalHouseManager.excluirProfessor(titular2.codigoProfessor)
    digitalHouseManager.excluirProfessor(adjunto2.codigoProfessor)
    println("Como resultado, espera-se que a lista contenha apenas os demais professores:\n")
    for (professor in digitalHouseManager.listaDeProfessores) {
        println(professor)
    }
    println("-----------------------------------------------------------------------------------------------------------------------------------------")
    println()
    println("Teste do primeiro método marticularAluno(). Para isso utilizaremos os alunos previamente criados.")
    println("O objetivo do método é incluir os alunos na Lista de Alunos. Iniciamos mostrando o conteúdo da Lista de Alunos, que deve estar vazia:")
    println(digitalHouseManager.listaDeAlunos)
    digitalHouseManager.matricularAluno(aluno1.nome, aluno1.sobrenome, aluno1.codigoAluno)
    digitalHouseManager.matricularAluno(aluno2.nome, aluno2.sobrenome, aluno2.codigoAluno)
    digitalHouseManager.matricularAluno(aluno3.nome, aluno3.sobrenome, aluno3.codigoAluno)
    digitalHouseManager.matricularAluno(aluno4.nome, aluno4.sobrenome, aluno4.codigoAluno)
    println("\nApós o registro dos alunos, espera-se agora que a Lista de Alunos agora os contenha:\n")
    for (aluno in digitalHouseManager.listaDeAlunos) {
        println(aluno)
    }
    println("-----------------------------------------------------------------------------------------------------------------------------------------")
    println()
    println("Teste do segundo método marticularAluno(). Para isso utilizaremos os alunos previamente criados e já adicionados à Lista de Alunos.")
    println("O objetivo do método é matricular o aluno em um Curso, se possível. Iniciamos mostrando os alunos matriculados no Curso Aritmética, que deve estar vazia:")

    for (curso in digitalHouseManager.listaDeCursos) {
        println("${curso.nomeCurso}: ${curso.alunosMatriculados}")
    }

    println()
    println("O teste consiste em tentar matricular os quatro alunos criados no curso Aritmética. O que se espera é que as duas primeiras tentativas dêem certo, e as duas seguintes falhem, por exceder o máximo de alunos permitidos no curso.")
    println("O método também deve inserir cada matrícula realizada com sucesso na lista de matrículas. Mostramos aqui o estado inicial da lista de Matrículas, que deve também estar vaia:")
    println(digitalHouseManager.listaDeMatriculas)
    println()
    println("Inclusão do aluno1 (espera-se sucesso):")
    digitalHouseManager.matricularAluno(aluno1.codigoAluno, cursoAritmetica.codigoCurso)
    println()
    println("Inclusão do aluno2 (espera-se sucesso):")
    digitalHouseManager.matricularAluno(aluno2.codigoAluno, cursoAritmetica.codigoCurso)
    println()
    println("Inclusão do aluno3 (espera-se falha):")
    digitalHouseManager.matricularAluno(aluno3.codigoAluno, cursoAritmetica.codigoCurso)
    println()
    println("Inclusão do aluno4 (espera-se falha):")
    digitalHouseManager.matricularAluno(aluno4.codigoAluno, cursoAritmetica.codigoCurso)
    println()
    println("O estado final esperado é que a lista de alunos do curso Aritmética contenha os dois primeiros alunos:")
    for(curso in digitalHouseManager.listaDeCursos) {
        for (aluno in curso.alunosMatriculados){
            println(aluno)
        }
    }
    println()
    println("Espera-se também que a Lista de Matrículas contenha as duas matrículas efetuadas com sucesso: ")
    for (matricula in digitalHouseManager.listaDeMatriculas) {
        println(matricula)
    }

    println("-----------------------------------------------------------------------------------------------------------------------------------------")
    println()
    println("Teste do método alocarProfessores(). Para isso, utilizaremos os professores já criados e registrados:")
    for (professor in digitalHouseManager.listaDeProfessores) {
        println(professor)
    }
    println()
    println("Adicionaremos ambos ao curso Aritmética, que no momento não possui professores atribuídos:")
    for (curso in digitalHouseManager.listaDeCursos) {
        println(curso)
    }

    digitalHouseManager.alocarProfessores(cursoAritmetica.codigoCurso, titular1.codigoProfessor, adjunto1.codigoProfessor)

    println()
    println("Então, alocamos os professores no curso, que agora devem aparecer atribúidos no curso: ")
    for (curso in digitalHouseManager.listaDeCursos) {
        println(curso)
    }




}