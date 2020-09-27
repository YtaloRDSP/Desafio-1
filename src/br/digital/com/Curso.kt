package br.digital.com

class Curso(val nome: String,
                 val codigoDeCurso: Integer, 
                 val profTitular: ProfTitular, 
                 val profAdjunto: ProfAdjunto, 
                 val maxAlunos: Integer, 
                 vararg val lista: Aluno) {
    override fun equals(other: Any?): Boolean {
        if(other !is Curso) return false
        if(codigoDeCurso != other.codigoDeCurso) return false
        return true
    }
}