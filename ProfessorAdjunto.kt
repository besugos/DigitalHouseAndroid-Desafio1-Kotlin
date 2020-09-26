class ProfessorAdjunto (nome: String,
                        sobrenome: String,
                        codigoProfessor: Int,
                        val horasMonitoria: Int): Professor(nome, sobrenome, codigoProfessor) {

    var tempoDeCasa = 0

    override fun toString(): String {
        return "Professor Adjunto: nome=$nome | sobrenome=$sobrenome | código=$codigoProfessor | horas de monitoria=$horasMonitoria | tempo de casa=$tempoDeCasa"
    }
}