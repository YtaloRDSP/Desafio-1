package br.digital.com

class DigitalHouseManager {
    val listaAl = mutableListOf<Aluno>()
    val listaProf = mutableListOf<Professor>()
    val listaCurso = mutableListOf<Curso>()
    val listaMatricula = mutableListOf<Matricula>()

    fun addAluno(vararg lista: Aluno){
        listaAl.addAll(lista)
    }
    fun addProf(vararg lista: Professor){
        listaProf.addAll(lista)
    }
    fun addCurso(vararg lista: Curso){
        listaCurso.addAll(lista)
    }
    fun addMatricula(vararg lista: Matricula){
        listaMatricula.addAll(lista)
    }


}