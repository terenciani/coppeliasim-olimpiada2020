/*
 * Exercício-04
 * Implemente um algoritmo que ande fazendo um círculo na tela. 
 * O robô deve continuar andando em círculo e nunca terminar sua execução.
 * 
 * Pesquise na internet como utilizar um laço de repetição que não tem fim.
 * Utilize o método andar() do motor dentro do laço de repetição.
 * 
 * OBSERVAÇÃO: para finalizar a execução da simulação, você precisa parar 
 * o processo na sua IDE (netbeans ou eclipse)(no Eclipse existe um símbolo de "stop" 
 * em vermelho no painel inferior do lado da esquerda; No Netbeans existe um botãozinho 
 * de stop na barra inferior no lado da direita) e também no CoppeliaSim a cada execução.
 *
 * */
package br.edu.ifpr.paranavai.olimpiada.aula01.exercicios;

import adaptado.Motor;
import adaptado.RoboSeguidorLinha;

public class Exercicio04 {
	public static void main(String[] args) {
		// Criação/Instanciação do robô
		RoboSeguidorLinha robo = new RoboSeguidorLinha();
		
		// Obter motor da direita
		Motor motorDireita = robo.getMotorDireita();
		
		// Laço de repetição infinito, o robô continua andando e nunca para.
		while(true) {
			// Definir a velocidade de um dos motores
			motorDireita.setVelocidade(10);
			robo.andarTempo(1);
		}
	}
}
