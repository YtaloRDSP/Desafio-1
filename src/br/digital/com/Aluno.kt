package br.digital.com

data class Aluno(var nome: String, var sobrenome: String, var codigoDeAluno: Integer) {
    override fun equals(other: Any?): Boolean {
        if(other !is Aluno) return false
        if(codigoDeAluno != other.codigoDeAluno) return false
        return true
    }
}