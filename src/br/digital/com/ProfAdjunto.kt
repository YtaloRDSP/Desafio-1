package br.digital.com

class ProfAdjunto(nome: String,
                  sobrenome: String,
                  tempoDeCasa: Integer,
                  codigoDeProfessor: Integer,
                  val hrsMonitoria: Integer): Professor(nome, sobrenome, tempoDeCasa, codigoDeProfessor)