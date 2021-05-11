/*
 * Exercício-02
 * Conforme estudado no encontro síncrono, utilizando a biblioteca .jar fornecida, identifique os erros de código abaixo e corrija-os.
 
 	RoboSeguidorLinha r = new Motor();
 	mD.r.getMotorDireita()
 	md.andar();
 	mD.andar_tempo(10);
 	MD.desconectar.parar();
 
  
 * */
package br.edu.ifpr.paranavai.olimpiada.aula01.exercicios;

import adaptado.Motor;
import adaptado.RoboSeguidorLinha;

public class Exercicio02 {
	public static void main(String[] args) {
		// Criação/Instanciação do robô
		RoboSeguidorLinha robo = new RoboSeguidorLinha();
		

		// Obter motor da direita
		Motor motorDireita = robo.getMotorDireita();
		
		
		// virar para esquerda por 5 segundos
		motorDireita.setVelocidade(10);
		robo.andarTempo(5);
		
				
		// Parar o robo na interface do coppelia
		robo.parar();
		
		// Desconectar o java do coppelia
		robo.desconectar();
	}
}
