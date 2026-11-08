
package jogo_das_faze;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class main {

	public static void main(String[] args) {
		
		
		int encerrar = 0;
		int encerrar1 = 0;
		int status1 = 0;
		int status2 = 0;
		String alternativa = "";
		
		
		do {
			
		String jogadores [] = new String[2];
		int pontos = 0;
		int pontos2 = 0;
		
		for (int i = 0; i < 2; i++) {
			jogadores[i] = JOptionPane.showInputDialog(null, "Insira o seu vulgo " + (i + 1) );
		}
		
		int escolha1, escolha;
		
		while (status1 < 2 && status2 < 2) {
		
		String escolha3 = JOptionPane.showInputDialog(null, "Vamos jogar Jokenpo " + jogadores[0] + "\n Insira 1 para Pedra, 2 para Papel e 3 para Tesoura.");
		if (escolha3 == null) break;
		escolha = Integer.parseInt(escolha3);
		
		String escolha4 = JOptionPane.showInputDialog(null, "Jogaremos Jokenpo contra o jogador " + jogadores[0] + " jogador " + jogadores[1] + "\n Insira 1 para Pedra, 2 para Papel e 3 para Tesoura.");
		if (escolha4 == null) break;
		escolha1 = Integer.parseInt(escolha4);
		
		if ((escolha == 1) && (escolha1 == 3) || (escolha == 2) && (escolha1 == 1) || (escolha == 3) && (escolha1 == 2)) {
			pontos += 15;
			status1 += 1;
			JOptionPane.showMessageDialog(null, "Jogador " + jogadores[0] + " pontuou!\n Pontos do " + jogadores[0] + ": " + pontos + "\n Pontos do jogador " + jogadores[1] + ": " + pontos2);
			System.out.println(status1);
		}else if (escolha == escolha1) {
			JOptionPane.showMessageDialog(null, "Empate! Tente novamente jogadores!");
		}else {
			pontos2 += 15;
			status2 += 1;
			JOptionPane.showMessageDialog(null, "Jogador " + jogadores[1] + " pontuou!\n Pontos do " + jogadores[0] + ": " + pontos + "\n Pontos do jogador " + jogadores[1] + ": " + pontos2);
		}
		}
		
		String vencedor1 = "";
		int pontosvencedor1 = 0;
		
		if (pontos > pontos2) {
			vencedor1 = jogadores[0];
			pontosvencedor1 = pontos;
			JOptionPane.showMessageDialog(null, "Jogador " + jogadores[0] + " venceu a Fase 1 com " + pontos + " pontos e avança sozinho para as próximas fases!");
		} else if (pontos2 > pontos) {
			vencedor1 = jogadores[1];
			pontosvencedor1 = pontos2;
			JOptionPane.showMessageDialog(null, "Jogador " + jogadores[1] + " venceu a Fase 1 com " + pontos2 + " pontos e avança sozinho para as próximas fases!");
		} else {
			vencedor1 = jogadores[0];
			pontosvencedor1 = pontos;
			JOptionPane.showMessageDialog(null, "Empate de pontos na Fase 1! O Jogador " + jogadores[0] + " avança para as próximas fases pelo critério de desempate.");
		}
		
		status1 = 0;
		status2 = 0; 
		
		int status3 = 0;
		JOptionPane.showMessageDialog(null, "Iniciando a Fase 2 (Quiz de Java) para o(a) classificado(a): " + vencedor1);
		
		while (status3 < 5) {
			String escolha3 = JOptionPane.showInputDialog(null, "Quiz de Java - " + vencedor1 + " (Status: " + status3 + "/5)\n Insira a alternativa correta sem erro de digitação.\n"
					+ " Qual das alternativas é falsa?\n"
					+ " A. Um array começa com indice igual a 1.\n"
					+ " B. Uma variavel int pode conter letras.\n"
					+ " C. ''private'' é uma das 52 palavras reservadas.\n");
			alternativa = "A";
			
			if (escolha3 != null && escolha3.equalsIgnoreCase(alternativa)) {
				JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
				pontosvencedor1 += 15;
				status3 += 1;
			}else {
				JOptionPane.showMessageDialog(null, "Errou!");
				status3 += 1;
			}
			
			if (status3 >= 5) break;

			escolha3 = JOptionPane.showInputDialog(null, "Quiz de Java - " + vencedor1 + " (Status: " + status3 + "/5)\n Pontos atuais: "+ pontosvencedor1 +
				 "\n O que é a JVM (Java Virtual Machine) em relação ao Java?\n"
				+ " A. Um banco de dados embutido.\n"
				+ " B. A máquina virtual responsável por executar o bytecode do Java.\n"
				+ " C. Um editor de texto para programadores.\n");
			alternativa = "B";
		
			if (escolha3 != null && escolha3.equalsIgnoreCase(alternativa)) {
				JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
				pontosvencedor1 += 15;
				status3 += 1;
			}else {
				JOptionPane.showMessageDialog(null, "Errou!");
				status3 += 1;
			}
			
			if (status3 >= 5) break;

			escolha3 = JOptionPane.showInputDialog(null, "Quiz de Java - " + vencedor1 + " (Status: " + status3 + "/5)\n Pontos atuais: "+ pontosvencedor1 +
					 "\n Qual comando exibe mensagens em diálogos gráficos no Swing?\n"
					+ " A. System.out.println()\n"
					+ " B. JOptionPane.showMessageDialog()\n"
					+ " C. Scanner.nextInt()\n");
			alternativa = "B";
		
			if (escolha3 != null && escolha3.equalsIgnoreCase(alternativa)) {
				JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
				pontosvencedor1 += 15;
				status3 += 1;
			}else {
				JOptionPane.showMessageDialog(null, "Errou!");
				status3 += 1;
			}
			
			if (status3 >= 5) break;

			escolha3 = JOptionPane.showInputDialog(null, "Quiz de Java - " + vencedor1 + " (Status: " + status3 + "/5)\n Pontos atuais: "+ pontosvencedor1 +
					 "\n Qual estrutura de repetição usamos para contagens fixas?\n"
					+ " A. for\n"
					+ " B. if-else\n"
					+ " C. switch\n");
			alternativa = "A";
		
			if (escolha3 != null && escolha3.equalsIgnoreCase(alternativa)) {
				JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
				pontosvencedor1 += 15;
				status3 += 1;
			}else {
				JOptionPane.showMessageDialog(null, "Errou!");
				status3 += 1;
			}
			
			if (status3 >= 5) break;

			escolha3 = JOptionPane.showInputDialog(null, "Quiz de Java - " + vencedor1 + " (Status: " + status3 + "/5)\n Pontos atuais: "+ pontosvencedor1 +
					 "\n Como converter texto numérico para inteiro?\n"
					+ " A. Integer.parseInt()\n"
					+ " B. String.valueOf()\n"
					+ " C. Double.parseDouble()\n");
			alternativa = "A";
		
			if (escolha3 != null && escolha3.equalsIgnoreCase(alternativa)) {
				JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
				pontosvencedor1 += 15;
				status3 += 1;
			}else {
				JOptionPane.showMessageDialog(null, "Errou!");
				status3 += 1;
			}
		}
		
		
		int status4 = 0;
		JOptionPane.showMessageDialog(null, "Iniciando a Fase 3: Quiz de Evangelion para " + vencedor1 + "!");
		
		while (status4 < 10) {
			String strEscolhaEva = JOptionPane.showInputDialog(null, "Quiz Evangelion - " + vencedor1 + " (Status: " + status4 + "/10)\n Pontos: " + pontosvencedor1 + "\n"
					+ " Qual é o nome do protagonista que pilota a Unidade 01?\n"
					+ " A. Asuka Langley\n"
					+ " B. Shinji Ikari\n"
					+ " C. Kaworu Nagisa\n");
			alternativa = "B";
			if (strEscolhaEva != null && strEscolhaEva.equalsIgnoreCase(alternativa)) {
				JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
				pontosvencedor1 += 10;
			} else {
				JOptionPane.showMessageDialog(null, "Errou!");
			}
			status4++;
			if (status4 >= 10) break;

			strEscolhaEva = JOptionPane.showInputDialog(null, "Quiz Evangelion - " + vencedor1 + " (Status: " + status4 + "/10)\n Pontos: " + pontosvencedor1 + "\n"
					+ " Como se chama a organização paramilitar liderada por Gendo Ikari?\n"
					+ " A. SEELE\n"
					+ " B. NERV\n"
					+ " C. MAGI\n");
			alternativa = "B";
			if (strEscolhaEva != null && strEscolhaEva.equalsIgnoreCase(alternativa)) {
				JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
				pontosvencedor1 += 10;
			} else {
				JOptionPane.showMessageDialog(null, "Errou!");
			}
			status4++;
			if (status4 >= 10) break;

			strEscolhaEva = JOptionPane.showInputDialog(null, "Quiz Evangelion - " + vencedor1 + " (Status: " + status4 + "/10)\n Pontos: " + pontosvencedor1 + "\n"
					+ " Qual é o nome do supercomputador quântico dividido em três partes?\n"
					+ " A. CASPER\n"
					+ " B. LILITH\n"
					+ " C. MAGI\n");
			alternativa = "C";
			if (strEscolhaEva != null && strEscolhaEva.equalsIgnoreCase(alternativa)) {
				JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
				pontosvencedor1 += 10;
			} else {
				JOptionPane.showMessageDialog(null, "Errou!");
			}
			status4++;
			if (status4 >= 10) break;

			strEscolhaEva = JOptionPane.showInputDialog(null, "Quiz Evangelion - " + vencedor1 + " (Status: " + status4 + "/10)\n Pontos: " + pontosvencedor1 + "\n"
					+ " Qual piloto veio da Alemanha e pilota a Unidade 02?\n"
					+ " A. Rei Ayanami\n"
					+ " B. Asuka Langley Soryu\n"
					+ " C. Misato Katsuragi\n");
			alternativa = "B";
			if (strEscolhaEva != null && strEscolhaEva.equalsIgnoreCase(alternativa)) {
				JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
				pontosvencedor1 += 10;
			} else {
				JOptionPane.showMessageDialog(null, "Errou!");
			}
			status4++;
			if (status4 >= 10) break;

			strEscolhaEva = JOptionPane.showInputDialog(null, "Quiz Evangelion - " + vencedor1 + " (Status: " + status4 + "/10)\n Pontos: " + pontosvencedor1 + "\n"
					+ " Qual a verdadeira natureza biológica dos Evangelions?\n"
					+ " A. Robôs puros de metal\n"
					+ " B. Ciborgues humanos\n"
					+ " C. Seres biológicos gigantes contidos por armaduras\n");
			alternativa = "C";
			if (strEscolhaEva != null && strEscolhaEva.equalsIgnoreCase(alternativa)) {
				JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
				pontosvencedor1 += 10;
			} else {
				JOptionPane.showMessageDialog(null, "Errou!");
			}
			status4++;
			if (status4 >= 10) break;

			strEscolhaEva = JOptionPane.showInputDialog(null, "Quiz Evangelion - " + vencedor1 + " (Status: " + status4 + "/10)\n Pontos: " + pontosvencedor1 + "\n"
					+ " Quem é o ser crucificado localizado no Terminal Dogma?\n"
					+ " A. Adão\n"
					+ " B. Lilith\n"
					+ " C. Sachiel\n");
			alternativa = "B";
			if (strEscolhaEva != null && strEscolhaEva.equalsIgnoreCase(alternativa)) {
				JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
				pontosvencedor1 += 10;
			} else {
				JOptionPane.showMessageDialog(null, "Errou!");
			}
			status4++;
			if (status4 >= 10) break;

			strEscolhaEva = JOptionPane.showInputDialog(null, "Quiz Evangelion - " + vencedor1 + " (Status: " + status4 + "/10)\n Pontos: " + pontosvencedor1 + "\n"
					+ " Qual é a enigmática piloto da Unidade 00?\n"
					+ " A. Rei Ayanami\n"
					+ " B. Maya Ibuki\n"
					+ " C. Ritsuko Akagi\n");
			alternativa = "A";
			if (strEscolhaEva != null && strEscolhaEva.equalsIgnoreCase(alternativa)) {
				JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
				pontosvencedor1 += 10;
			} else {
				JOptionPane.showMessageDialog(null, "Errou!");
			}
			status4++;
			if (status4 >= 10) break;

			strEscolhaEva = JOptionPane.showInputDialog(null, "Quiz Evangelion - " + vencedor1 + " (Status: " + status4 + "/10)\n Pontos: " + pontosvencedor1 + "\n"
					+ " Qual o nome do Anjo em formato de octaedro geométrico?\n"
					+ " A. Sachiel\n"
					+ " B. Ramiel\n"
					+ " C. Zeruel\n");
			alternativa = "B";
			if (strEscolhaEva != null && strEscolhaEva.equalsIgnoreCase(alternativa)) {
				JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
				pontosvencedor1 += 10;
			} else {
				JOptionPane.showMessageDialog(null, "Errou!");
			}
			status4++;
			if (status4 >= 10) break;

			strEscolhaEva = JOptionPane.showInputDialog(null, "Quiz Evangelion - " + vencedor1 + " (Status: " + status4 + "/10)\n Pontos: " + pontosvencedor1 + "\n"
					+ " Qual o nome do Quinto Filho e último Anjo enviado à Terra?\n"
					+ " A. Kensuke Aida\n"
					+ " B. Ryoji Kaji\n"
					+ " C. Kaworu Nagisa\n");
			alternativa = "C";
			if (strEscolhaEva != null && strEscolhaEva.equalsIgnoreCase(alternativa)) {
				JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
				pontosvencedor1 += 10;
			} else {
				JOptionPane.showMessageDialog(null, "Errou!");
			}
			status4++;
			if (status4 >= 10) break;

			strEscolhaEva = JOptionPane.showInputDialog(null, "Quiz Evangelion - " + vencedor1 + " (Status: " + status4 + "/10)\n Pontos: " + pontosvencedor1 + "\n"
					+ " Como ficou conhecido o evento cataclísmico do ano 2000?\n"
					+ " A. O Segundo Impacto\n"
					+ " B. O Primeiro Impacto\n"
					+ " C. A Instrumentalidade Humana\n");
			alternativa = "A";
			if (strEscolhaEva != null && strEscolhaEva.equalsIgnoreCase(alternativa)) {
				JOptionPane.showMessageDialog(null, "Parabéns, você acertou!");
				pontosvencedor1 += 10;
			} else {
				JOptionPane.showMessageDialog(null, "Errou!");
			}
			status4++;
		}
		
		JOptionPane.showMessageDialog(null, "Fim de jogo! O jogador " + vencedor1 + " terminou com um total de " + pontosvencedor1 + " pontos!");
		
		System.out.println("Vencedor: " + vencedor1 + " com " + pontosvencedor1 + " pontos.");
		System.out.println(Arrays.toString(jogadores));
		
		String recomecar = JOptionPane.showInputDialog(null, "Deseja encerrar? Insira 0 para jogar novamente ou outro valor para sair:");
		if (recomecar != null) {
			encerrar = Integer.parseInt(recomecar);
		} else {
			encerrar = 1;
		}
		
		} while (encerrar == 0);
		
		
		
		
	}

}
	



