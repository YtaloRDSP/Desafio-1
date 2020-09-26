package br.digital.com

fun main(){
    val P1 = Professor("Jorge", "Ben", Integer(15), Integer(11))
    val P2 = Professor("Alcione", "Assis", Integer(5), Integer(25))
    val P3 = Professor("Jorge", "Aragão", Integer(3), Integer(33))
    val P4 = Professor("Arlindo", "Cruz", Integer(9), Integer(33))
    println(P4.equals(P1))
    println(P4.equals(P2))
    println(P4.equals(P3))
}