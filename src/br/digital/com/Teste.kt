@file:Suppress("DEPRECATION")

package br.digital.com
//arquivo para realizar testes de cada parte adicionada, não pertencente ao original
fun main(){
    val gerente = DigitalHouseManager()
    gerente.adicionarCurso("Programação", 3366, 2)
    gerente.matricularAluno("Ytalo","Ribeiro", 1245)
    gerente.registrarProfessorAdjunto("Mycroft", "Holmes", 1234, 10)
    gerente.registrarProfessorTitular("Sherlock", "Holmes", 7848, "Historia")
    gerente.alocarProfessores(3366, 7848, 1235)
    println(gerente.listaCurso[0].profTitular.nome)
    println(gerente.listaCurso[0].profAdjunto.nome)
}
