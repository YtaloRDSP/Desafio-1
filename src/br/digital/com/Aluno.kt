package br.digital.com

data class Aluno(val nome: String, val sobrenome: String, val codigoDeAluno: Integer) {
    override fun equals(other: Any?): Boolean {
        if(other !is Aluno) return false
        if(codigoDeAluno != other.codigoDeAluno) return false
        return true
    }
}