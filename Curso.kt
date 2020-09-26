class Curso (val nomeCurso: String,
             val codigoCurso: Int,
             val professorTitular: ProfessorTitular,
             val professorAdjunto: ProfessorAdjunto,
             var qtdMaxAlunos: Int,
             val alunosMatriculados: MutableList<Aluno>)
 {

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