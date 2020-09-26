class Aluno (nome:String, sobrenome:String, val codigoAluno: Int): Pessoa(nome, sobrenome) {
    override fun toString(): String {
        return "Aluno: nome=$nome | sobrenome=$sobrenome | código=$codigoAluno"
    }
}