class ProfessorTitular (nome: String,
                        sobrenome: String,
                        codigoProfessor: Int,
                        val especialidade: String): Professor(nome, sobrenome, codigoProfessor) {

    var tempoDeCasa = 0

    override fun toString(): String {
        return "Professor Titular: nome=$nome | sobrenome=$sobrenome | código=$codigoProfessor | especialidade=$especialidade | tempo de casa=$tempoDeCasa"
    }
}