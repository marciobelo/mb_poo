package br.nom.belo.marcio;

public class PreencheComSublinhado {

	public static void main(String[] args) {

			if( args.length != 2) {
				
				System.out.println( "Entre um nome e uma quantidade");
				System.exit( -1);
			}

			String nome = args[0];
			int qtde = Integer.parseInt( args[1]);
			if( nome.length() >= qtde) {
				
				System.out.println( nome.substring( 0, qtde));
			}
			else {
				
				int qtdeApreencher = qtde - nome.length();
				String preenchido = sublinhados( qtdeApreencher / 2) +
									( qtdeApreencher % 2 != 0 ? "_" : "") +
									nome + 
									sublinhados( qtdeApreencher / 2);
				System.out.println( preenchido);					
			}
	}

	private static String sublinhados(int n) {
		
		String result = "";
		for( int i=0; i < n; i++) {
			
			result = result + "_";
		}
		return result;
	}
}
/*
Se voc� executar esse programa assim:
$ java PreencheComSublinhado Marcio Belo 15
Voc� receber� a mensagem 'Entre um nome e uma quantidade'. Isso se deve ao programa entender que tr�s argumentos
est�o sendo passados por linha de comando, n�o dois. Para indicar que s�o dois, o nome deve estar delimitado
por aspas. Apenas o conte�do dentro das aspas ser�o recebidos pelo args[0].
$ java PreencheComSublinhado "Marcio Belo" 15
Na linha 10, usamos o m�todo exit da classe System. Ela aborta imediatamente a execu��o do programa
e faz interromper a execu��o da VM (Virtual Machine, ou M�quina Virtual). O valor -1 pode ser capturado
pelo programa que chamou a VM para sinalizar um condi��o de erro.
Um detalhe curioso: a diferen�a no uso de length quando aplicado a classe Array, no nosso caso referenciado como
args na linha 7, e quando aplicado a String, como na linha 15. No caso da classe Array, length foi definida como uma 
vari�vel p�blica; no caso da String, foi definido como m�todo, por isso preciso abrir e fechar par�nteses. Uma 
diferen�a inconveniente visto que se trata do mesmo prop�sito, mas que mostra que a forma como um objeto ser�
usado depende da forma em que ele est� definido em sua classe.
ser� usado � a classe que o define.    
Na linha 22 estamos usando uma fun��o chamada sublinhados, definida na mesma classe do nosso programa como static.
A ela � passado um par�metro inteiro com a quantidade de caracteres sublinhados que eu quero que seja retornado na String.
Repare que a opera��o de divis�o atua sobre dois inteiros, portanto o resultado ser� o quociente da divis�o.
Na linha 23 usamos uma estrutura condicional chamada operador tern�rio. A express�o � esquerda de ? procure apura se
a quantidade a preencher � �mpar. Se for, adiciono o sublinhado (entre o ? e :) a mais que deve ficar � esquerda do nome. 
Sen�o ele retorna uma String vazia (� direita de : at� o ;), para n�o adicionar nada ao resultado.
 */
