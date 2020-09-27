@file:Suppress("DEPRECATION")

package br.digital.com
//arquivo para realizar testes de cada parte adicionada, não pertencente ao original
fun main(){
    val p1 = ProfTitular("Jorge", "Ben", Integer(15), Integer(33), "Historia")
    val p2 = ProfAdjunto("Jorge", "Aragão", Integer(3), Integer(27), Integer(20))

    val a1 = Aluno("Ytalo", "Ribeiro", Integer(1123))
    val a2 = Aluno("Roberto", "Carlos", Integer(1178))
    val c1 = Curso("Geografia", Integer(123), p1, p2, Integer(20), a1, a2)

    val m1 = Matricula(a1, c1)
    println(m1.aluno.nome)
    println(m1.curso.nome)
    println(m1.data)

}