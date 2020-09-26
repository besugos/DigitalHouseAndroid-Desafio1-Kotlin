class Curso (val nomeCurso: String,
             val codigoCurso: Int,
             var qtdMaxAlunos: Int,
             )
 {

         var professorTitular = ProfessorTitular("","", 0, "")
         var professorAdjunto = ProfessorAdjunto("", "", 0, 0)
         var alunosMatriculados = mutableListOf<Aluno>()


     fun adicionarUmAluno(umAluno: Aluno): Boolean {
         if (alunosMatriculados.size >= qtdMaxAlunos) {
             return false
         } else {
             alunosMatriculados.add(umAluno)
             return true
         }

     }

     fun excluirUmAluno(umAluno: Aluno) {
         if (alunosMatriculados.contains(umAluno)) {
             alunosMatriculados.remove(umAluno)
         }
     }


}