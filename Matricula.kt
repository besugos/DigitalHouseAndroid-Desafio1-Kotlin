import java.time.LocalDateTime

data class Matricula (val aluno:Aluno, val curso: Curso) {

    init {
        val dataMatricula = LocalDateTime.now()
    }


}