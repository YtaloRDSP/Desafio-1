package br.digital.com

data class Curso(val nome: String, val codigoDeCurso: Integer) {
    override fun equals(other: Any?): Boolean {
        if(other !is Curso) return false
        if(codigoDeCurso != other.codigoDeCurso) return false
        return true
    }
}