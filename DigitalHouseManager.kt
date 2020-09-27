class DigitalHouseManager {

    var listaDeAlunos = mutableSetOf<Aluno>()
    var listaDeProfessores = arrayListOf<Professor>()
    var listaDeCursos = mutableSetOf<Curso>()
    var listaDeMatriculas = mutableSetOf<Matricula>()


    fun registrarCurso(nome:String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int) {
        val novoCurso = Curso(nome, codigoCurso, quantidadeMaximaDeAlunos)
        if (!(listaDeCursos.contains(novoCurso))) {
            listaDeCursos.add(novoCurso)
        }
    }

    fun excluirCurso(codigoCurso: Int) {
        for (curso in listaDeCursos) {
            if (curso.codigoCurso == codigoCurso) {
                listaDeCursos.remove(curso)
            }
        }
    }

    fun registrarProfessorAdjunto(nome:String,
                                  sobrenome: String,
                                  codigoProfessor: Int,
                                  quantidadeDeHoras: Int) {
        val novoAdjunto = ProfessorAdjunto(nome, sobrenome, codigoProfessor, quantidadeDeHoras)
        if (!(listaDeProfessores.contains(novoAdjunto))) {
            listaDeProfessores.add(novoAdjunto)
        }
    }

    fun registrarProfessorTitular(nome:String,
                                  sobrenome: String,
                                  codigoProfessor: Int,
                                  especialidade:String) {
        val novoTitular = ProfessorTitular(nome, sobrenome, codigoProfessor, especialidade)
        if (!(listaDeProfessores.contains(novoTitular))) {
            listaDeProfessores.add(novoTitular)
        }
    }

    fun excluirProfessor(codigoProfessor: Int) {

        for (i in 0 until listaDeProfessores.size){
            if (listaDeProfessores[i].codigoProfessor == codigoProfessor) {
                listaDeProfessores.remove(listaDeProfessores[1])
                break
            }
        }

    }

    fun matricularAluno(nome:String, sobrenome:String, codigoAluno: Int) {
        val novoAluno = Aluno(nome, sobrenome, codigoAluno)
        if (!(listaDeAlunos.contains(novoAluno))) {
            listaDeAlunos.add(novoAluno)
        }
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        var cursoAlvo = Curso("", 0, 0)
        var alunoNovo = Aluno("", "", 0)

        for (curso in listaDeCursos) {
            if (curso.codigoCurso == codigoCurso) {
                cursoAlvo = curso
            }
        }
        for (aluno in listaDeAlunos) {
            if (aluno.codigoAluno == codigoAluno) {
                alunoNovo = aluno
            }
        }
        if (cursoAlvo.alunosMatriculados.size < cursoAlvo.qtdMaxAlunos) {
            cursoAlvo.adicionarUmAluno(alunoNovo)
            val novaMatricula = Matricula(alunoNovo, cursoAlvo)
            listaDeMatriculas.add(novaMatricula)
            println("Matrícula realizada com sucesso.")
        } else {
            println("Não foi possível realizar a matrícula. Não há vagas disponíveis no curso informado.")
        }
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {

        var titularInformado = ProfessorTitular("", "", 0, "")
        var adjuntoInformado = ProfessorAdjunto("", "", 0, 0)

        for (professor in listaDeProfessores) {
            if (professor.codigoProfessor == codigoProfessorTitular) {
                titularInformado = professor as ProfessorTitular
            } else if (professor.codigoProfessor == codigoProfessorAdjunto) {
                adjuntoInformado = professor as ProfessorAdjunto
            }
        }

        for (curso in listaDeCursos) {
            if (curso.codigoCurso == codigoCurso) {
                curso.professorTitular = titularInformado
                curso.professorAdjunto = adjuntoInformado
            }
        }

    }
}