package br.edu.ifpr.paranavai.olimpiada.principal;

import adaptado.Motor;
import adaptado.RoboSeguidorLinha;

public class MeuRobo {
	public static void main(String[] args) {
		// Criação/Instanciação do robô
		RoboSeguidorLinha robo = new RoboSeguidorLinha();
		
		
		// Obter os motores do robô
		Motor motorEsquerda = robo.getMotorEsquerda();
		Motor motorDireita = robo.getMotorDireita();
		
		// Definir a velocidade do robô
		motorEsquerda.setVelocidade(10);
		motorDireita.setVelocidade(10);
		
		// Andar por um tempo aproximado de 5 segundos (baseado nas rotações do motor)
		robo.andarTempo(5);
		
		// Parar o robo na interface do coppelia
		robo.parar();
		
		// Desconectar o java do coppelia
		robo.desconectar();
	}
}
