package br.edu.ifpr.paranavai.olimpiada.aula03;

import adaptado.Motor;
import adaptado.RoboSeguidorLinha;
import adaptado.SensorLuz;

public class MeuRobo {
	public static void main(String[] args) {
		RoboSeguidorLinha robo = new RoboSeguidorLinha();

		Motor motorEsquerda = robo.getMotorEsquerda();
		Motor motorDireita = robo.getMotorDireita();

		SensorLuz sensor = robo.getSensorCentro();

		motorEsquerda.setVelocidade(10);
		motorDireita.setVelocidade(10);

		while (true) {
			sensor.lerSensorLuz(); // atualiza o valor do sensor
			int r = sensor.getR();
			int g = sensor.getG();
			int b = sensor.getB();
			System.out.println("Leu rgb(" + r + ", " + g + ", " + b + ")");
			robo.andarTempo(2);
		}

	}
}
