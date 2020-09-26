abstract class Professor (nome:String,
                          sobrenome: String,
                          val codigoProfessor: Int,
                          var tempoDeCasa: Int): Pessoa (nome, sobrenome) {

    init {
        tempoDeCasa = 0
    }

}