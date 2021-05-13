package br.edu.ifpr.paranavai.olimpiada.aula02;

import adaptado.Motor;
import adaptado.RoboSeguidorLinha;
import adaptado.SensorLuz;

public class AndandoEntreDuasLinhas {
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

			// se for pra ir reto, os dois devem ser branco
			if (sensorEsquerda.isBranco() && sensorDireita.isBranco()) {
				motorEsquerda.setVelocidade(5);
				motorDireita.setVelocidade(5);
				robo.andar();
			}
			// Se encontrou preto na direita, vira pra esquerda
			else if (!sensorDireita.isBranco()) {
				motorEsquerda.setVelocidade(0);
				motorDireita.setVelocidade(5);
				robo.andar();
			}
			// Se encontrou preto na esquerda, vira pra direita
			else if (!sensorEsquerda.isBranco()) {
				motorEsquerda.setVelocidade(5);
				motorDireita.setVelocidade(0);
				robo.andar();
			}
			// qualquer outra situação não prevista
			else {
				System.out.println("Algum problema aconteceu");
				System.out.println("  Esquerda branco " + sensorEsquerda.isBranco());
				System.out.println("  Direita branco " + sensorDireita.isBranco());
				robo.parar();
				robo.desconectar();
				break;
			}

		}
	}
}
