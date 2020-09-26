package br.digital.com

class ProfTitular(nome: String,
                  sobrenome: String,
                  tempoDeCasa: Integer,
                  codigoDeProfessor: Integer,
                  val especialidade: String): Professor(nome, sobrenome, tempoDeCasa, codigoDeProfessor)