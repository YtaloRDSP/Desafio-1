package br.digital.com

class ProfTitular(nome: String,
                  sobrenome: String,
                  codigoDeProfessor: Int,
                  val especialidade: String): Professor(nome, sobrenome, codigoDeProfessor)