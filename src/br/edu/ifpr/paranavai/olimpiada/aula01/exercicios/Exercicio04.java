/*
 * Exerc�cio-04
 * Implemente um algoritmo que ande fazendo um c�rculo na tela. 
 * O rob� deve continuar andando em c�rculo e nunca terminar sua execu��o.
 * 
 * Pesquise na internet como utilizar um la�o de repeti��o que n�o tem fim.
 * Utilize o m�todo andar() do motor dentro do la�o de repeti��o.
 * 
 * OBSERVA��O: para finalizar a execu��o da simula��o, voc� precisa parar 
 * o processo na sua IDE (netbeans ou eclipse)(no Eclipse existe um s�mbolo de "stop" 
 * em vermelho no painel inferior do lado da esquerda; No Netbeans existe um bot�ozinho 
 * de stop na barra inferior no lado da direita) e tamb�m no CoppeliaSim a cada execu��o.
 *
 * */
package br.edu.ifpr.paranavai.olimpiada.aula01.exercicios;

import adaptado.Motor;
import adaptado.RoboSeguidorLinha;

public class Exercicio04 {
	public static void main(String[] args) {
		// Cria��o/Instancia��o do rob�
		RoboSeguidorLinha robo = new RoboSeguidorLinha();
		
		// Obter motor da direita
		Motor motorDireita = robo.getMotorDireita();
		
		// La�o de repeti��o infinito, o rob� continua andando e nunca para.
		while(true) {
			// Definir a velocidade de um dos motores
			motorDireita.setVelocidade(10);
			robo.andarTempo(1);
		}
	}
}
