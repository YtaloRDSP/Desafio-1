package br.digital.com

class Curso(val nome: String,
                 val codigoDeCurso: Integer, 
                 val profTitular: ProfTitular, 
                 val profAdjunto: ProfAdjunto, 
                 val maxAlunos: Int,
                 vararg val lista: Aluno) {
    val listaAluno = mutableListOf<Aluno>(*lista)
    override fun equals(other: Any?): Boolean {
        if(other !is Curso) return false
        if(codigoDeCurso != other.codigoDeCurso) return false
        return true
    }

    fun adicionarUmAluno(umAluno: Aluno): Boolean{
        if(listaAluno.size < maxAlunos){
            listaAluno.add(umAluno)
            return true
        }
        return false
    }

    fun excluirAluno(umAluno: Aluno){
        if(listaAluno.indexOf(umAluno) != -1) listaAluno.removeAt(listaAluno.indexOf(umAluno))
    }
}