package br.edu.ifpr.paranavai.olimpiada.aula01.exercicios;

import adaptado.Motor;
import adaptado.RoboSeguidorLinha;

public class Exercicio01 {
	public static void main(String[] args) {
		// Criação/Instanciação do robô
		RoboSeguidorLinha robo = new RoboSeguidorLinha();
		
		
		// Obter os motores do robô
		Motor motorEsquerda = robo.getMotorEsquerda();
		Motor motorDireita = robo.getMotorDireita();
		
		// Andar para frentre por dois segundos
		motorEsquerda.setVelocidade(10);
		motorDireita.setVelocidade(10);
		robo.andarTempo(2);
		
		// Andar para traz por um segundo
		motorEsquerda.setVelocidade(-5);
		motorDireita.setVelocidade(-5);
		robo.andarTempo(1);
		
		// Fazer uma curva para frentre  e para esquerda por dois segundos
		motorEsquerda.setVelocidade(5);
		motorDireita.setVelocidade(10);
		robo.andarTempo(2);
		
		// Parar o robo na interface do coppelia
		robo.parar();
		
		// Desconectar o java do coppelia
		robo.desconectar();
	}
}
