package fases;

import java.util.ArrayList;

import javax.swing.JOptionPane;
public class main {

  public static void main(String[] args) {  
   String textoRanking = " RANKING DE JOGADORES \n";
   int reset3;
   ArrayList<String> listaNomes = new ArrayList<>();
   ArrayList<Integer> listaPontos = new ArrayList<>();
   
 	
		do { 
	int resposta;
    String nome;
    int reset = -1;
    int reset2 = -1;
    int pontos = 0;
    		 	
        nome = JOptionPane.showInputDialog("Qual é o seu nome?");  
            if (nome == null) {
                return;
            }
            
        JOptionPane.showMessageDialog(null, "Vamos jogar um jogo?"
            		+ "\n O jogo funciona da seguinte forma:"
            		+ "\n A cada acerto você somará 15 pontos"
            		+ "\n Serão 3 fases");
               
        resposta = JOptionPane.showConfirmDialog(null, "Você aceita o desafio, " + nome + "?", 
                "Início", 
        JOptionPane.YES_NO_OPTION);  
                        
        if (resposta != JOptionPane.YES_OPTION) {
              JOptionPane.showMessageDialog(null, "Que pena! Fica para a próxima.");
        return;}
        
        do {
        	do {
        		pontos = 0;
         JOptionPane.showMessageDialog(null, "Então vamos ao primeiro jogo!");  
            
        int fase1;
       
    	fase1 = Integer.parseInt(JOptionPane.showInputDialog(null,"RODADA 1"
    			+ "\nEscolha o seu objeto"
    			+ "\n1 para tesoura"
    			+ " \n2 para papel "
    			+ "\n3 para pedra"));
    	int aleatorio1 = (int) (Math.random() * 3) + 1;
    	if(aleatorio1 == fase1) {
    		JOptionPane.showMessageDialog(null, "Empate!");
    	}
    	else if ((fase1 == 1 && aleatorio1 == 2) || 
    	         (fase1 == 2 && aleatorio1 == 3) || 
    	         (fase1 == 3 && aleatorio1 == 1)) {
    		
    		JOptionPane.showMessageDialog(null, "Parabens você ganhou!");
    		pontos = pontos +15;
    	} else
    		JOptionPane.showMessageDialog(null, "Você perdeu!");; 
    	
    	int fase2;
    	
    	fase2 = Integer.parseInt(JOptionPane.showInputDialog(null,"RODADA 2"
    			+ "\nEscolha o seu objeto"
    			+ "\n1 para tesoura"
    			+ " \n2 para papel "
    			+ "\n3 para pedra"));
    	int aleatorio2 = (int) (Math.random() * 3) + 1;
    	if(aleatorio2 == fase2) {
    		JOptionPane.showMessageDialog(null, "Empate!");
    	}
    	else if ((fase2 == 1 && aleatorio2 == 2) || 
    	         (fase2 == 2 && aleatorio2 == 3) || 
    	         (fase2 == 3 && aleatorio2 == 1)) {
    		
    		JOptionPane.showMessageDialog(null, "Parabens você ganhou!");
    		pontos = pontos +15;
    	} else
    		JOptionPane.showMessageDialog(null, "Você perdeu!");; 
    	
    	int fase3;
    	
    	fase3 = Integer.parseInt(JOptionPane.showInputDialog(null,"RODADA 3"
    			+ "\nEscolha o seu objeto"
    			+ "\n1 para tesoura"
    			+ " \n2 para papel "
    			+ "\n3 para pedra"));
    	int aleatorio3 = (int) (Math.random() * 3) + 1;
    	if(aleatorio3 == fase3) {
    		JOptionPane.showMessageDialog(null, "Empate!");
    	}
    	else if ((fase3 == 1 && aleatorio3 == 2) || 
    	         (fase3 == 2 && aleatorio3 == 3) || 
    	         (fase3 == 3 && aleatorio3 == 1)) {
    		
    		JOptionPane.showMessageDialog(null, "Parabens você ganhou!");
    		pontos = pontos +15;
    	} else
    		JOptionPane.showMessageDialog(null, "Você perdeu!");; 
    	
    	
    	
    	 if (pontos >= 30) {
    	 JOptionPane.showMessageDialog(null, "Boaa! você conseguiu passar de fase com:" + pontos + " pontos"
    	            		                  + "\n agora vamos ao quiz de java que conta com 5 perguntas"
    	            		                  + "\n leia atentamente as questões e depois informe a alternativa correta");  
    	 break;
    	 } else {
    	 reset = JOptionPane.showConfirmDialog(null,"você perdeu " + nome + " gostaria de recomeçar?", 
                 "Derrota", 
                 JOptionPane.YES_NO_OPTION
             );  
             
             
             if (reset != JOptionPane.YES_OPTION) {
                 JOptionPane.showMessageDialog(null, "Que pena! Fica para a próxima.");
                 return; 
               }
    	      }
    	     } while(reset == JOptionPane.YES_OPTION);
    	 
    	 
    	 JOptionPane.showMessageDialog(null, "O que é que o método JOptionPane.showInputDialog(\"Digite um valor:\") retorna por padrão em Java?\r\n"
    		 		+ "\r\n"
    		 		+ "A) Um número inteiro (int)\r\n"
    		 		+ "\r\n"
    		 		+ "B) Um texto (String)\r\n"
    		 		+ "\r\n"
    		 		+ "C) Um valor verdadeiro ou falso (boolean)");
    		 
    	 int quiz1;
    	 do {
    	 quiz1 = Integer.parseInt(JOptionPane.showInputDialog(null, "\n informe sua resposta"
    	    			+ "\n1 para opção a"
    	    			+ " \n2 para opção b "
    	    			+ "\n3 para opção c"));
    	 switch (quiz1) {
    	 
    	 case 1:
    	 JOptionPane.showMessageDialog(null,"não foi dessa vez mais sorte na proxima");    		
    	 break;
    	 case 2:
    	 JOptionPane.showMessageDialog(null, "parabens! você acertou");
    	 pontos = pontos + 15;
         break;
    	 case 3:
    	 JOptionPane.showMessageDialog(null, "não foi dessa vez mais sorte na proxima");
    	 break;
    	 default:
    	 JOptionPane.showMessageDialog(null, "essa alternativa não existe responda novamente");
    	 break;        
         }
    	   } while (quiz1 < 1 || quiz1 > 3);
    	 
    	 JOptionPane.showMessageDialog(null, "Qual é a propriedade ou forma correta de descobrir o tamanho (número de elementos) de um vetor chamado numeros em Java?\r\n"
    	    			+ "\r\n"
    	    			+ "A) numeros.length\r\n"
    	    			+ "\r\n"
    	    			+ "B) numeros.size()\r\n"
    	    			+ "\r\n"
    	    			+ "C) numeros.count()");
        		 
         int quiz2;
        do { 
         quiz2 = Integer.parseInt(JOptionPane.showInputDialog(null, "\n informe sua resposta"
        	    			+ "\n1 para opção a"
        	    			+ " \n2 para opção b "
        	    			+ "\n3 para opção c"));
         switch (quiz2) {
         
         case 1:
         JOptionPane.showMessageDialog(null,"parabens! você acertou"); 
         pontos = pontos + 15;
         break;
         case 2:
         JOptionPane.showMessageDialog(null, "não foi dessa vez mais sorte na proxima");	    
         break;
         case 3:
         JOptionPane.showMessageDialog(null, "não foi dessa vez mais sorte na proxima");
         break;
         default:
         JOptionPane.showMessageDialog(null, "essa alternativa não existe responda novamente");
         break;        
         }
        } while (quiz2 < 1 || quiz2 > 3);
         
         JOptionPane.showMessageDialog(null, "O que acontece se esqueceres de colocar o comando break no final de um case dentro de um switch?\r\n"
        	    			+ "\r\n"
        	    			+ "A) O programa dá um erro de compilação imediato.\r\n"
        	    			+ "\r\n"
        	    			+ "B) A execução continua a correr e entra nos case seguintes (efeito de \"queda\" ou fall-through).\r\n"
        	    			+ "\r\n"
        	    			+ "C) O programa ignora o switch inteiro.");
            		 
   		int quiz3;
        do {
   		quiz3 = Integer.parseInt(JOptionPane.showInputDialog(null, "\n informe sua resposta"
            	    			+ "\n1 para opção a"
            	    			+ " \n2 para opção b "
            	    			+ "\n3 para opção c"));
        switch (quiz3) {
        
        case 1:
        JOptionPane.showMessageDialog(null,"não foi dessa vez mais sorte na proxima"); 
        break;
        case 2:
        JOptionPane.showMessageDialog(null, "parabens! você acertou");
        pontos = pontos + 15;
        break;
        case 3:
        JOptionPane.showMessageDialog(null, "não foi dessa vez mais sorte na proxima");
        break;
        default:
        JOptionPane.showMessageDialog(null, "essa alternativa não existe responda novamente");
        break; 
        }
        } while (quiz3 < 1 || quiz3 > 3);
        
        JOptionPane.showMessageDialog(null, "Como se declara e instancia corretamente um vetor de 5 números inteiros (int) em Java?\r\n"
            	    			+ "\r\n"
            	    			+ "A) int[] vetor = new int[5];\r\n"
            	    			+ "\r\n"
            	    			+ "B) int vetor = new int(5);\r\n"
            	    			+ "\r\n"
            	    			+ "C) array int vetor = {5};");
                		 
        int quiz4;
         do {       	    	
        quiz4 = Integer.parseInt(JOptionPane.showInputDialog(null, "\n informe sua resposta"
                	    			+ "\n1 para opção a"
                	    			+ " \n2 para opção b "
                	    			+ "\n3 para opção c"));
        switch (quiz4) {
        
        case 1:
        JOptionPane.showMessageDialog(null,"parabens! você acertou"); 
        pontos = pontos + 15;
        break;
        case 2:
        JOptionPane.showMessageDialog(null, "não foi dessa vez mais sorte na proxima");
        break;
        case 3:
        JOptionPane.showMessageDialog(null, "não foi dessa vez mais sorte na proxima");
        break;
        default:
        JOptionPane.showMessageDialog(null, "essa alternativa não existe responda novamente");
        break; 
        }
         } while (quiz4 < 1 || quiz4 > 3);
         
        JOptionPane.showMessageDialog(null, "Para verificar numa estrutura condicional if se uma variável inteira pontos é exatamente igual a 30, qual operador de comparação deves usar?\r\n"
                	    			+ "\r\n"
                	    			+ "A) =\r\n"
                	    			+ "\r\n"
                	    			+ "B) ==\r\n"
                	    			+ "\r\n"
                	    			+ "C) ===");                   		 
                    		 
        int quiz5;
        do {            	    	
        quiz5 = Integer.parseInt(JOptionPane.showInputDialog(null, "\n informe sua resposta"
                    	    			+ "\n1 para opção a"
                    	    			+ " \n2 para opção b "
                    	    			+ "\n3 para opção c"));
                    	    	
        switch (quiz5) {
                    	    	
        case 1:
        JOptionPane.showMessageDialog(null,"não foi dessa vez mais sorte na proxima"); 
        break;
        case 2:
        JOptionPane.showMessageDialog(null, "parabens! você acertou");
        pontos = pontos + 15;
        break;
        case 3:
        JOptionPane.showMessageDialog(null, "não foi dessa vez mais sorte na proxima");
        break;
        default:
        JOptionPane.showMessageDialog(null, "essa alternativa não existe responda novamente");
        break; 
        }
        } while (quiz1 < 1 || quiz1 > 3);
        
        if (pontos >= 60) {
       	 JOptionPane.showMessageDialog(null, "Boaa! você conseguiu passar de fase com:"+ pontos +"pontos"
       	            		                  + "\n agora vamos ao quiz de IA que conta com 10 perguntas"
       	            		                  + "\n leia atentamente as questões e depois informe a alternativa correta");  
       	 } else {
       	 reset2 = JOptionPane.showConfirmDialog(null,"você não conseguiu a pontuação minima " + nome + " gostaria de recomeçar?", 
                    "derrota", 
                    JOptionPane.YES_NO_OPTION
                );  
                
                
                if (reset2 != JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "Que pena! Fica para a próxima.");
                    return; 
                }
       	 }
        } while (reset2 == JOptionPane.YES_OPTION);
         
        JOptionPane.showMessageDialog(null, "De que forma a inteligência artificial AlphaFold, desenvolvida pela DeepMind, revolucionou a biologia molecular?\r\n"
        		+ "\r\n"
        		+ "a) Sequenciando o DNA de espécies em extinção em tempo recorde.\r\n"
        		+ "\r\n"
        		+ "b) Prevendo a estrutura tridimensional de proteínas a partir de suas sequências de aminoácidos.\r\n"
        		+ "\r\n"
        		+ "c) Criando células sintéticas totalmente funcionais em laboratório.");                   		 
 		 
        int IA1;
 	    	do {
        IA1 = Integer.parseInt(JOptionPane.showInputDialog(null, "\n informe sua resposta"
 	    			+ "\n1 para opção a"
 	    			+ " \n2 para opção b "
 	    			+ "\n3 para opção c"));
 	    	
        switch (IA1) {
 	    	
        case 1:
        JOptionPane.showMessageDialog(null,"não foi dessa vez mais sorte na proxima"); 
        break;
        case 2:
        JOptionPane.showMessageDialog(null, "parabens! você acertou");
        pontos = pontos + 15;
        break;
        case 3:
        JOptionPane.showMessageDialog(null, "não foi dessa vez mais sorte na proxima");
        break;
        default:
        JOptionPane.showMessageDialog(null, "essa alternativa não existe responda novamente");
        break; }
 	    	 } while (IA1 < 1 || IA1 > 3);
        JOptionPane.showMessageDialog(null, "Na astronomia, qual é uma das principais aplicações dos algoritmos de aprendizado de máquina (machine learning)?\r\n"
        		+ "\r\n"
        		+ "a) Pilotar sondas espaciais sem necessidade de combustível.\r\n"
        		+ "\r\n"
        		+ "b) Analisar grandes volumes de dados telescópicos para identificar exoplanetas e galáxias.\r\n"
        		+ "\r\n"
        		+ "c) Alterar a trajetória de asteroides em rota de colisão com a Terra.");                   		 
 		 
        int IA2;
 	    do {	
        IA2 = Integer.parseInt(JOptionPane.showInputDialog(null, "\n informe sua resposta"
 	    			+ "\n1 para opção a"
 	    			+ " \n2 para opção b "
 	    			+ "\n3 para opção c"));
 	    	
        switch (IA2) {
 	    	
        case 1:
        JOptionPane.showMessageDialog(null,"não foi dessa vez mais sorte na proxima"); 
        break;
        case 2:
        JOptionPane.showMessageDialog(null, "parabens! você acertou");
        pontos = pontos + 15;
        break;
        case 3:
        JOptionPane.showMessageDialog(null, "não foi dessa vez mais sorte na proxima");
        break;
        default:
        JOptionPane.showMessageDialog(null, "essa alternativa não existe responda novamente");
        break; 
        }
 	   } while (IA2 < 1 || IA2 > 3);
        
        JOptionPane.showMessageDialog(null, "Como a IA acelera a descoberta de novos medicamentos (drug discovery) na química e farmácia?\r\n"
        		+ "\r\n"
        		+ "a) Realizando testes clínicos diretamente em pacientes humanos sem etapas prévias.\r\n"
        		+ "\r\n"
        		+ "b) Simulando e triando bilhões de interações moleculares para identificar compostos promissores.\r\n"
        		+ "\r\n"
        		+ "c) Substituindo a necessidade de aprovação por órgãos reguladores");                   		 
 		 
        int IA3;
 	    	do {
        IA3 = Integer.parseInt(JOptionPane.showInputDialog(null, "\n informe sua resposta"
 	    			+ "\n1 para opção a"
 	    			+ " \n2 para opção b "
 	    			+ "\n3 para opção c"));
 	    	
        switch (IA3) {
 	    	
        case 1:
        JOptionPane.showMessageDialog(null,"não foi dessa vez mais sorte na proxima"); 
        break;
        case 2:
        JOptionPane.showMessageDialog(null, "parabens! você acertou");
        pontos = pontos + 15;
        break;
        case 3:
        JOptionPane.showMessageDialog(null, "não foi dessa vez mais sorte na proxima");
        break;
        default:
        JOptionPane.showMessageDialog(null, "essa alternativa não existe responda novamente");
        break; 
        }
 	    	} while (IA3 < 1 || IA3 > 3);
        JOptionPane.showMessageDialog(null, "Na física de partículas, como no LHC (Grande Colisor de Hadrons), por que a IA é fundamental?\r\n"
        		+ "\r\n"
        		+ "a) Para filtrar e processar petabytes de dados de colisões subatômicas em tempo real.\r\n"
        		+ "\r\n"
        		+ "b) Para gerar a energia elétrica necessária para manter os aceleradores ligados.\r\n"
        		+ "\r\n"
        		+ "c) Para fabricar os ímãs supercondutores usados nos experimentos");                   		 
 		 
        int IA4;
 	    do {	
        IA4 = Integer.parseInt(JOptionPane.showInputDialog(null, "\n informe sua resposta"
 	    			+ "\n1 para opção a"
 	    			+ " \n2 para opção b "
 	    			+ "\n3 para opção c"));
 	    	
        switch (IA4) {
 	    	
        case 1:
        JOptionPane.showMessageDialog(null,"parabens! você acertou"); 
        pontos = pontos + 15;
        break;
        case 2:
        JOptionPane.showMessageDialog(null, "não foi dessa vez mais sorte na proxima");
        break;
        case 3:
        JOptionPane.showMessageDialog(null, "não foi dessa vez mais sorte na proxima");
        break;
        default:
        JOptionPane.showMessageDialog(null, "essa alternativa não existe responda novamente");
        break; }
 	   } while (IA4 < 1 || IA4 > 3);
        JOptionPane.showMessageDialog(null, "Na medicina e no diagnóstico por imagem, qual é o papel principal dos sistemas de visão computacional?\r\n"
        		+ "\r\n"
        		+ "a) Substituir completamente os médicos cirurgiões em todas as operações.\r\n"
        		+ "\r\n"
        		+ "b) Auxiliar na detecção precoce de tumores e anomalias em exames como radiografias e ressonâncias.\r\n"
        		+ "\r\n"
        		+ "c) Fabricar remédios personalizados dentro do corpo do paciente.");                   		 
 		 
        int IA5;
 	    	do {
        IA5 = Integer.parseInt(JOptionPane.showInputDialog(null, "\n informe sua resposta"
 	    			+ "\n1 para opção a"
 	    			+ " \n2 para opção b "
 	    			+ "\n3 para opção c"));
 	    	
        switch (IA5) {
 	    	
        case 1:
        JOptionPane.showMessageDialog(null,"não foi dessa vez mais sorte na proxima"); 
        break;
        case 2:
        JOptionPane.showMessageDialog(null, "parabens! você acertou");
        pontos = pontos + 15;
        break;
        case 3:
        JOptionPane.showMessageDialog(null, "não foi dessa vez mais sorte na proxima");
        break;
        default:
        JOptionPane.showMessageDialog(null, "essa alternativa não existe responda novamente");
        break; 
        }
 	    	} while (IA5 < 1 || IA5 > 3);      
        JOptionPane.showMessageDialog(null, "De que maneira os modelos de IA ajudam nas ciências climáticas?\r\n"
        		+ "\r\n"
        		+ "a) Resfriando a atmosfera terrestre por meio de ondas digitais.\r\n"
        		+ "\r\n"
        		+ "b) Processando dados meteorológicos globais para criar previsões do tempo e modelos de mudança climática mais precisos.\r\n"
        		+ "\r\n"
        		+ "c) Eliminando as emissões de carbono de indústrias pesadas automaticamente.");                   		 
 		 
        int IA6;
 	    	do {
        IA6 = Integer.parseInt(JOptionPane.showInputDialog(null, "\n informe sua resposta"
 	    			+ "\n1 para opção a"
 	    			+ " \n2 para opção b "
 	    			+ "\n3 para opção c"));
 	    	
        switch (IA6) {
 	    	
        case 1:
        JOptionPane.showMessageDialog(null,"não foi dessa vez mais sorte na proxima"); 
        break;
        case 2:
        JOptionPane.showMessageDialog(null, "parabens! você acertou");
        pontos = pontos + 15;
        break;
        case 3:
        JOptionPane.showMessageDialog(null, "não foi dessa vez mais sorte na proxima");
        break;
        default:
        JOptionPane.showMessageDialog(null, "essa alternativa não existe responda novamente");
        break; 
        }
 	    	} while (IA6 < 1 || IA6 > 3);        
        JOptionPane.showMessageDialog(null, "O que caracteriza a chamada \"Ciência Autônoma\" ou laboratórios geridos por IA (Self-Driving Labs)?\r\n"
        		+ "\r\n"
        		+ "a) Laboratórios construídos exclusivamente no espaço sideral.\r\n"
        		+ "\r\n"
        		+ "b) Sistemas onde a IA projeta experimentos, robôs os executam e a IA analisa os resultados para planejar os próximos passos.\r\n"
        		+ "\r\n"
        		+ "c) Softwares de computador que apenas escrevem artigos científicos sem fazer experimentos.");                   		 
 		 
        int IA7;
 	    do {	
        IA7 = Integer.parseInt(JOptionPane.showInputDialog(null, "\n informe sua resposta"
 	    			+ "\n1 para opção a"
 	    			+ " \n2 para opção b "
 	    			+ "\n3 para opção c"));
 	    	
        switch (IA7) {
 	    	
        case 1:
        JOptionPane.showMessageDialog(null,"não foi dessa vez mais sorte na proxima"); 
        break;
        case 2:
        JOptionPane.showMessageDialog(null, "parabens! você acertou");
        pontos = pontos + 15;
        break;
        case 3:
        JOptionPane.showMessageDialog(null, "não foi dessa vez mais sorte na proxima");
        break;
        default:
        JOptionPane.showMessageDialog(null, "essa alternativa não existe responda novamente");
        break; 
        }
 	   } while (IA7 < 1 || IA7 > 3);
 	    
        JOptionPane.showMessageDialog(null, "Na área de ciência dos materiais, qual tem sido uma grande contribuição da IA?\r\n"
        		+ "\r\n"
        		+ "a) Aumentar o peso de metais leves para torná-los mais resistentes.\r\n"
        		+ "\r\n"
        		+ "b) Prever e sintetizar novas estruturas de materiais para baterias mais eficientes e painéis solares.\r\n"
        		+ "\r\n"
        		+ "c) Transformar plásticos comuns em elementos radioativos.");                   		 
 		 
        int IA8;
 	    do {	
        IA8 = Integer.parseInt(JOptionPane.showInputDialog(null, "\n informe sua resposta"
 	    			+ "\n1 para opção a"
 	    			+ " \n2 para opção b "
 	    			+ "\n3 para opção c"));
 	    	
        switch (IA8) {
 	    	
        case 1:
        JOptionPane.showMessageDialog(null,"não foi dessa vez mais sorte na proxima"); 
        break;
        case 2:
        JOptionPane.showMessageDialog(null, "parabens! você acertou");
        pontos = pontos + 15;
        break;
        case 3:
        JOptionPane.showMessageDialog(null, "não foi dessa vez mais sorte na proxima");
        break;
        default:
        JOptionPane.showMessageDialog(null, "essa alternativa não existe responda novamente");
        break; 
        }
 	   } while (IA8 < 1 || IA8 > 3);
 	    
        JOptionPane.showMessageDialog(null, "Na genômica, como a IA auxilia os pesquisadores?\r\n"
        		+ "\r\n"
        		+ "a) Identificando padrões em grandes conjuntos de dados genéticos para associar mutações a doenças.\r\n"
        		+ "\r\n"
        		+ "b) Clonando organismos vivos instantaneamente.\r\n"
        		+ "\r\n"
        		+ "c) Alterando o código genético de plantas apenas com sinal de Wi-Fi.");                   		 
 		 
        int IA9;
 	    do {	
        IA9 = Integer.parseInt(JOptionPane.showInputDialog(null, "\n informe sua resposta"
 	    			+ "\n1 para opção a"
 	    			+ " \n2 para opção b "
 	    			+ "\n3 para opção c"));
 	    	
        switch (IA9) {
 	    	
        case 1:
        JOptionPane.showMessageDialog(null,"parabens! você acertou");
        pontos = pontos + 15;
        break;
        case 2:
        JOptionPane.showMessageDialog(null, "não foi dessa vez mais sorte na proxima");
        break;
        case 3:
        JOptionPane.showMessageDialog(null, "não foi dessa vez mais sorte na proxima");
        break;
        default:
        JOptionPane.showMessageDialog(null, "essa alternativa não existe responda novamente");
        break; 
        }
 	   } while (IA9 < 1 || IA9 > 3);
 	    
        JOptionPane.showMessageDialog(null, "Qual é um dos principais desafios éticos no uso da IA na pesquisa científica?\r\n"
        		+ "\r\n"
        		+ "a) O risco de a IA se recusar a trabalhar aos finais de semana.\r\n"
        		+ "\r\n"
        		+ "b) A reprodutibilidade dos resultados, o viés nos dados de treinamento e a falta de transparência (\"caixa-preta\") em alguns modelos.\r\n"
        		+ "\r\n"
        		+ "c) A falta de computadores no mercado para rodar os softwares.");                   		 
 		 
        int IA10;
 	    do {	
        IA10 = Integer.parseInt(JOptionPane.showInputDialog(null, "\n informe sua resposta"
 	    			+ "\n1 para opção a"
 	    			+ " \n2 para opção b "
 	    			+ "\n3 para opção c"));
 	    	
        switch (IA10) {
 	    	
        case 1:
        JOptionPane.showMessageDialog(null,"não foi dessa vez mais sorte na proxima"); 
        break;
        case 2:
        JOptionPane.showMessageDialog(null, "parabens! você acertou");
        pontos = pontos + 15;
        break;
        case 3:
        JOptionPane.showMessageDialog(null, "não foi dessa vez mais sorte na proxima");
        break;
        default:
        JOptionPane.showMessageDialog(null, "essa alternativa não existe responda novamente");
        break; 
        }
 	   } while (IA10 < 1 || IA10 > 3);        
        JOptionPane.showMessageDialog(null,"Parabens! Você acaba de concluir os nosso jogo sua pontuação final foi:"+pontos);
          
        listaNomes.add(nome);
        listaPontos.add(pontos);
        
        for (int i = 0; i < listaNomes.size(); i++) {
            textoRanking += (i + 1) + "º - " + listaNomes.get(i) + " : " + listaPontos.get(i) + " pontos\n";
        }
        JOptionPane.showMessageDialog(null, textoRanking);
        
        reset3 = JOptionPane.showConfirmDialog(null, "Gostaria de começar do zero " + nome + "?",
        		"fim",
        		 JOptionPane.YES_NO_OPTION);
        if (reset3 != JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Que pena! Fica para a próxima.");
            return;
        }
    	}while (reset3 == JOptionPane.YES_OPTION);
   }
}