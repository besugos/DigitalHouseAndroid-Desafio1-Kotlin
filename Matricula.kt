import java.time.LocalDateTime

data class Matricula (val aluno:Aluno, val curso: Curso) {


    val dataMatricula = LocalDateTime.now()

    override fun toString(): String {
        return "Matricula: aluno: ${aluno.nome} ${aluno.sobrenome} | curso: ${curso.nomeCurso} | data da matrícula: $dataMatricula"
    }


}