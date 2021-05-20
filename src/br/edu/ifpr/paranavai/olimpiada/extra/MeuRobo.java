package br.edu.ifpr.paranavai.olimpiada.extra;

import adaptado.Motor;
import adaptado.RoboSeguidorLinha;
import adaptado.SensorProximidade;

public class MeuRobo {
	public static void main(String[] args) {
		//obter o rob� e motores
		RoboSeguidorLinha robo = new RoboSeguidorLinha();
		Motor motorEsquerda = robo.getMotorEsquerda();
		Motor motorDireita = robo.getMotorDireita();
		motorEsquerda.setVelocidade(0);
		motorDireita.setVelocidade(0);
		// conectar no sensor Proximity_sensor (nome na �rvore de objetos)
		SensorProximidade sensorProximidade = robo.getSensorProximidade("Proximity_sensor");
		// rob� deve andar at� que a dist�ncia seja de 2 metros
		double dist = 2;
		while (dist >= 2) {
			motorEsquerda.setVelocidade(5);
			motorDireita.setVelocidade(5);
			// atualizar o valor do sensor
			sensorProximidade.lerDistancia();
			// testar se existe alguma dist�ncia lida
			if (sensorProximidade.isDistancia()) {
				// obter a dist�ncia lida
				dist = sensorProximidade.getDistancia();
				System.out.println("Dist�ncia lida: " + dist + " cm");
			}
			robo.andar();
		}
		robo.parar();
		System.out.println("Fim da execu��o do rob�");
		robo.desconectar();
	}
}