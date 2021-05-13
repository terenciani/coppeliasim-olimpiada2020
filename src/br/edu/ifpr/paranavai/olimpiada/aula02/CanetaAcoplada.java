package br.edu.ifpr.paranavai.olimpiada.aula02;

import adaptado.Motor;
import adaptado.RoboSeguidorLinha;

public class CanetaAcoplada {
	public static void main(String[] args) {
		// Cria��o/Instancia��o do rob�
		RoboSeguidorLinha robo = new RoboSeguidorLinha();
		
		
		// Obter os motores do rob�
		Motor motorEsquerda = robo.getMotorEsquerda();
		Motor motorDireita = robo.getMotorDireita();
		
		// Andar para frentre por dois segundos
		motorEsquerda.setVelocidade(20);
		motorDireita.setVelocidade(20);
		robo.andarTempo(3);
		
		// Andar para frente e para direita por 2 segundos
		motorEsquerda.setVelocidade(20);
		motorDireita.setVelocidade(10);
		robo.andarTempo(2);
		
		// Parar o robo na interface do coppelia
		robo.parar();
		
		// Desconectar o java do coppelia
		robo.desconectar();
	}
}
