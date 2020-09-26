package br.digital.com

fun main(){
    val M1 = Curso("Matemática", Integer(1774))
    val H1 = Curso("História", Integer(1254))
    val G1 = Curso("Geografia", Integer(1254))
    val G2 = Curso("Geografia", Integer(1274))
    println(G1.equals(M1))
    println(G1.equals(G2))
    println(G1.equals(H1))
}