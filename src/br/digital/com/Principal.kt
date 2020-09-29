package br.digital.com

fun main(){
    val gerente = DigitalHouseManager()

    gerente.registrarProfessorTitular("Dário", "Clóvis", 7846, "Kotlin")
    gerente.registrarProfessorTitular("Ocineide", "Ribeiro", 8471, "Ruby")
    gerente.registrarProfessorAdjunto("Rebecca", "Oliveira", 9785, 10)
    gerente.registrarProfessorAdjunto("Ytalo", "Ribeiro", 9541, 15)

    gerente.adicionarCurso("Full Stack", 20001, 3)
    gerente.adicionarCurso("Android", 20002, 2)

    gerente.alocarProfessores(20001, 8471, 9785)
    gerente.alocarProfessores(20002, 7846, 9541)

    gerente.matricularAluno("João", "Pereira", 20200530)
    gerente.matricularAluno("Julia", "Gama", 20190487)
    gerente.matricularAluno("Robson", "Peres", 20190654)
    gerente.matricularAluno("Thaysa", "Maria", 20200945)

    gerente.matricularAluno(20200530, 20001)
    gerente.matricularAluno(20190487, 20001)

    gerente.matricularAluno(20190654, 20002)
    gerente.matricularAluno(20200945, 20002)
    gerente.matricularAluno(20200530, 20002)

}