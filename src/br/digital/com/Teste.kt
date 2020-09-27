@file:Suppress("DEPRECATION")

package br.digital.com
//arquivo para realizar testes de cada parte adicionada, não pertencente ao original
fun main(){
    val p1 = ProfTitular("Jorge", "Ben", Integer(15), Integer(33), "Geografia")
    val p2 = ProfAdjunto("Jorge", "Aragão", Integer(3), Integer(27), Integer(20))

    val a1 = Aluno("Ytalo", "Ribeiro", Integer(1123))
    val a2 = Aluno("Roberto", "Carlos", Integer(1178))
    val c1 = Curso("Geografia", Integer(123), p1, p2, Integer(20), a1, a2)

    val m1 = Matricula(a1, c1)
    val m2 = Matricula(a2, c1)

    val gerente = DigitalHouseManager()
    gerente.run {
        addAluno(a1,a2)
        addProf(p1, p2)
        addCurso(c1)
        addMatricula(m1, m2)

        for(item in listaAl) println(item.nome)
        for(item in listaProf) println(item.nome)
        for(item in listaCurso) println(item.nome)
        for(item in listaMatricula) println(item.aluno)
    }
}
