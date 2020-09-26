class Curso (val nomeCurso: String,
             val codigoCurso: Int,
             var qtdMaxAlunos: Int,
             )
 {

         var professorTitular = ProfessorTitular("Não atribuído","", 0, "")
         var professorAdjunto = ProfessorAdjunto("Não atribuído", "", 0, 0)
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

     override fun toString(): String {
         return "Curso: $nomeCurso | código=$codigoCurso | Máximo de Alunos=$qtdMaxAlunos | Titular=${professorTitular.nome} ${professorTitular.sobrenome} | Adjunto=${professorAdjunto.nome} ${professorAdjunto.sobrenome}, Alunos Matriculados=${alunosMatriculados.size}"
     }


 }