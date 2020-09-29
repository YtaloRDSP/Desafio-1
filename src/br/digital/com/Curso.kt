package br.digital.com

class Curso(val nome: String,
                 val codigoDeCurso: Int,
                 val maxAlunos: Int) {

    lateinit var profTitular: ProfTitular
    fun addProfTitular(profT: ProfTitular){
        profTitular = profT
    }
    lateinit var profAdjunto: ProfAdjunto
    fun addProfAdjunto(profA: ProfAdjunto){
        profAdjunto = profA
    }

    val listaAluno = mutableListOf<Aluno>()
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