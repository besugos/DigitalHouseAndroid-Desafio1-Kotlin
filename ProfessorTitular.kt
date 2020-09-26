class ProfessorTitular (nome: String,
                        sobrenome: String,
                        codigoProfessor: Int,
                        tempoDeCasa: Int,
                        val especialidade: String): Professor(nome, sobrenome, codigoProfessor, tempoDeCasa) {
}