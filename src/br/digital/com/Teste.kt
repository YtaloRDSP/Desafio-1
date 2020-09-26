package br.digital.com

fun main(){
    val P1 = ProfTitular("Jorge", "Ben", Integer(15), Integer(33), "Historia")
    val P2 = ProfTitular("Alcione", "Assis", Integer(5), Integer(25), "Geografia")
    val P3 = ProfAdjunto("Jorge", "Aragão", Integer(3), Integer(27), Integer(20))
    val P4 = ProfAdjunto("Arlindo", "Cruz", Integer(9), Integer(33), Integer(15))
    println(P1.equals(P2))
    println(P1.equals(P3))
    println(P1.equals(P4))

    println(P1.especialidade)
    println(P2.especialidade)
    println(P3.hrsMonitoria)
    println(P4.hrsMonitoria)
}