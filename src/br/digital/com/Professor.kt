package br.digital.com

//Parte D - Classe alterada para ser herdada pelas classes de Professor Titular e Adjunto
abstract class Professor(val nome: String,
                     val sobrenome: String,
                     val codigoDeProfessor: Int) {
    val tempoDeCasa = 0
    override fun equals(other: Any?): Boolean {
        if(other !is Professor) return false
        if(codigoDeProfessor != other.codigoDeProfessor) return false
        return true
    }
}