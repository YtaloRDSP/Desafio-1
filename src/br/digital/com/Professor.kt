package br.digital.com

data class Professor(val nome: String,
                val sobrenome: String,
                val tempoDeCasa: Integer,//anos
                val codigoDeProfessor: Integer) {
    override fun equals(other: Any?): Boolean {
        if(other !is Professor) return false
        if(codigoDeProfessor != other.codigoDeProfessor) return false
        return true
    }
}