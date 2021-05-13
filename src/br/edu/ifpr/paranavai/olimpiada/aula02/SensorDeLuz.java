package br.edu.ifpr.paranavai.olimpiada.aula02;

import adaptado.Motor;
import adaptado.RoboSeguidorLinha;
import adaptado.SensorLuz;

public class SensorDeLuz {
	public static void main(String[] args) {
		// Criação/Instanciação do robô
		RoboSeguidorLinha robo = new RoboSeguidorLinha();

		// Obter os motores do robô
		Motor motorEsquerda = robo.getMotorEsquerda();
		Motor motorDireita = robo.getMotorDireita();

		// Obter sensores de luz do robô
		SensorLuz sensorEsquerda = robo.getSensorEsquerda();
		SensorLuz sensorDireita = robo.getSensorDireita();

		while (true) {
			// faz a leitura dos sensores
			sensorEsquerda.lerSensorLuz();
			sensorDireita.lerSensorLuz();

			// testa as alternativas de execução
			if (!sensorEsquerda.isBranco()) {
				motorEsquerda.setVelocidade(0);
				motorDireita.setVelocidade(10);
			} else if (!sensorDireita.isBranco()) {
				motorEsquerda.setVelocidade(10);
				motorDireita.setVelocidade(0);
			} else {
				motorEsquerda.setVelocidade(10);
				motorDireita.setVelocidade(10);
			}
			// girar as rodas do robô
			robo.andar();
		}
	}
}
