package br.digital.com

class DigitalHouseManager {
    val listaAl = mutableListOf<Aluno>()
    val listaProfTitular = mutableListOf<ProfTitular>()
    val listaProfAdjunto = mutableListOf<ProfAdjunto>()
    val listaCurso = mutableListOf<Curso>()
    val listaMatricula = mutableListOf<Matricula>()

    fun adicionarCurso(nome: String,
                       codigoCurso: Int,
                       qtdMaxAlunos: Int){
        val umCurso = Curso(nome,codigoCurso, qtdMaxAlunos)
        listaCurso.add(umCurso)
    }

    fun excluirCurso(codigoCurso: Int){
        var excluir = -1
        listaCurso.forEach{
            if(codigoCurso.equals(it.codigoDeCurso)) excluir = listaCurso.indexOf(it)
        }
        try{
            listaCurso.removeAt(excluir)
        }
        catch (ex: Exception){
            println("Nenhum curso a ser excluído")
        }
    }

    fun registrarProfessorAdjunto(nome: String,
                                  sobrenome: String,
                                  codigoProfessor: Int,
                                  qtdHoras: Int){
        val umProfessor = ProfAdjunto(nome, sobrenome, codigoProfessor, qtdHoras)
        listaProfAdjunto.add(umProfessor)
    }

    fun registrarProfessorTitular(nome: String,
                                  sobrenome: String,
                                  codigoProfessor: Int,
                                  especialidade: String){
        val umProfessor =  ProfTitular(nome, sobrenome, codigoProfessor, especialidade)
        listaProfTitular.add(umProfessor)
    }

    fun excluirProfessor(codigoProfessor: Int){
        var excluir = -1
        listaProfTitular.forEach{
            if(codigoProfessor.equals(it.codigoDeProfessor)) excluir = listaProfTitular.indexOf(it)
        }
        if(excluir == -1){
            listaProfAdjunto.forEach{
                if(codigoProfessor.equals(it.codigoDeProfessor)) excluir = listaProfAdjunto.indexOf(it)
            }
        }
        else listaProfTitular.removeAt(excluir)
        try{
            listaProfAdjunto.removeAt(excluir)
        }
        catch (ex: Exception){
            println("Nenhum Professor a ser excluído")
        }
    }

    fun matricularAluno(nome: String,
                        sobrenome: String,
                        codigoAluno: Int){
        val umAluno = Aluno(nome, sobrenome, codigoAluno)
        listaAl.add(umAluno)
    }

    fun matricularAluno(codigoAluno: Int,
                        codigoCurso: Int){
        var sinal = false
        var cursoIndex = -1
        var alunoIndex = -1
        listaCurso.forEach{
            if(codigoCurso.equals(it.codigoDeCurso)){
                cursoIndex = listaCurso.indexOf(it)
                listaAl.forEach{
                    if(codigoAluno.equals(it.codigoDeAluno)){
                        sinal = listaCurso[cursoIndex].adicionarUmAluno(it)
                        alunoIndex = listaAl.indexOf(it)
                        if(!sinal) println("Turma não possui vagas disponíveis!")
                    }
                }
            }
        }
        if(sinal){
            val umaMatricula = Matricula(listaAl[alunoIndex], listaCurso[cursoIndex])
            listaMatricula.add(umaMatricula)
            println("Matricula do aluno ${listaAl[alunoIndex].nome} realizada na turma de ${listaCurso[cursoIndex].nome}")
        }
    }

    fun alocarProfessores(codigoCurso: Int,
                          codigoProfessorTitular: Int,
                          codigoProfessorAdjunto: Int){
        var cursoIndex = -1
        listaCurso.forEach{
            if(codigoCurso.equals(it.codigoDeCurso)){
                cursoIndex = listaCurso.indexOf(it)
                listaProfTitular.forEach{
                    if(codigoProfessorTitular.equals(it.codigoDeProfessor)) listaCurso[cursoIndex].addProfTitular(it)
                }
                listaProfAdjunto.forEach{
                    if(codigoProfessorAdjunto.equals(it.codigoDeProfessor)) listaCurso[cursoIndex].addProfAdjunto(it)
                }
            }
        }
    }

    fun consultarMatricula(codigoAluno: Int){
        var c = 0
        listaMatricula.forEach{
            if(codigoAluno.equals(it.aluno.codigoDeAluno)){
                println("Aluno(a) ${it.aluno.nome} está matriculado(a) no curso ${it.curso.nome}")
                c++
            }
        }
        if(c == 0) println("Aluno(a) não está matriculado(a) em nenhum curso.")
    }
}