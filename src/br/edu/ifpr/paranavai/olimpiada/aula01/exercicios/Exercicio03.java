/*
 * Exerc�cio-03
 * Implemente um algoritmo que fa�a com que um rob� ande para frente por 5 segundos,
 * para tr�s na direita por 2 segundos e, em seguida, para frente na esquerda por 3 segundos.
 *
 * */
package br.edu.ifpr.paranavai.olimpiada.aula01.exercicios;

import adaptado.Motor;
import adaptado.RoboSeguidorLinha;

public class Exercicio03 {
	public static void main(String[] args) {
		// Cria��o/Instancia��o do rob�
		RoboSeguidorLinha robo = new RoboSeguidorLinha();
		

		// Obter motor da direita e esquerda
		Motor motorDireita = robo.getMotorDireita();
		Motor motorEsquerda = robo.getMotorEsquerda();
		
		// Ir para frente por 5 segundos
		motorDireita.setVelocidade(10);
		motorEsquerda.setVelocidade(10);
		robo.andarTempo(5);
		
		// Para tr�s na direita por 2 segundos
		motorDireita.setVelocidade(-8);
		motorEsquerda.setVelocidade(-10);
		robo.andarTempo(2);
		
		// Para frente e esquerda por 3 segundos
		motorDireita.setVelocidade(10);
		motorEsquerda.setVelocidade(8);
		robo.andarTempo(3);
				
		// Parar o robo na interface do coppelia
		robo.parar();
		
		// Desconectar o java do coppelia
		robo.desconectar();
	}
}
