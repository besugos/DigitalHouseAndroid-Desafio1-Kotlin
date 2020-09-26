class Curso (val nomeCurso: String,
             val codigoCurso: Int,
             val professorTitular: ProfessorTitular,
             val professorAdjunto: ProfessorAdjunto,
             var qtdMaxAlunos: Int,
             val alunosMatriculados: MutableList<Aluno>)
 {

     fun adicionarUmAluno(umAluno: Aluno): Boolean {
         //TO-DO
         return true
     }

     fun excluirUmAluno(umAluno: Aluno) {
         //TO-DO
     }


}