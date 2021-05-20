package br.edu.ifpr.paranavai.olimpiada.extra;

import adaptado.Motor;
import adaptado.RoboSeguidorLinha;
import adaptado.SensorProximidade;

public class MeuRobo {
	public static void main(String[] args) {
		//obter o robô e motores
		RoboSeguidorLinha robo = new RoboSeguidorLinha();
		Motor motorEsquerda = robo.getMotorEsquerda();
		Motor motorDireita = robo.getMotorDireita();
		motorEsquerda.setVelocidade(0);
		motorDireita.setVelocidade(0);
		// conectar no sensor Proximity_sensor (nome na árvore de objetos)
		SensorProximidade sensorProximidade = robo.getSensorProximidade("Proximity_sensor");
		// robô deve andar até que a distância seja de 2 metros
		double dist = 2;
		while (dist >= 2) {
			motorEsquerda.setVelocidade(5);
			motorDireita.setVelocidade(5);
			// atualizar o valor do sensor
			sensorProximidade.lerDistancia();
			// testar se existe alguma distância lida
			if (sensorProximidade.isDistancia()) {
				// obter a distância lida
				dist = sensorProximidade.getDistancia();
				System.out.println("Distância lida: " + dist + " cm");
			}
			robo.andar();
		}
		robo.parar();
		System.out.println("Fim da execução do robô");
		robo.desconectar();
	}
}