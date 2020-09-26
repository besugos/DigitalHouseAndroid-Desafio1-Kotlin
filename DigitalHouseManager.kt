class DigitalHouseManager {
    init {
        val listaDeAlunos = mutableListOf<Aluno>()
        val listaDeProfessores = mutableListOf<Professor>()
        val listaDeCursos = mutableListOf<Curso>()
        val listaDeMatriculas = mutableListOf<Matricula>()
    }

    fun registrarCurso(nome:String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int) {
        //TO-DO
    }

    fun excluirCurso(codigoCurso: Int) {
        //TO-DO
    }

    fun registrarProfessorAdjunto(nome:String,
                                  sobrenome: String,
                                  codigoProfessor: Int,
                                  quantidadeDeHoras: Int) {
        //TO-DO
    }

    fun registrarProfessorTitular(nome:String,
                                  sobrenome: String,
                                  codigoProfessor: Int,
                                  especialidade:String) {
        //TO-DO
    }

    fun excluirProfessor(codigoProfessor: Int) {
        //TO-DO
    }

    fun matricularAluno(nome:String, sobrenome:String, codigoAluno: Int) {
        //TO-DO
    }

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        //TO-DO
    }

    fun alocarProfessores(codigoCurso: Int, codigoProfessorTitular: Int, codigoProfessorAdjunto: Int) {
        //TO-DO
    }
    


}