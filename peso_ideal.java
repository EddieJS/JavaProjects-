import java.util.Scanner;

public class peso_ideal {

	public static void main(String[] args) {
		//Variáveis
		float altura, peso_ideal; 
		char sexo;
		Scanner teclado = new Scanner(System.in);
		
		//Entrada
		System.out.println("Informe sua altura: ");
		altura = teclado.nextFloat();
		
		System.out.println("Informe o sexo m/f: ");
		sexo = teclado.next().charAt(0);
		
		//Processamento
		if (sexo == 'm') {
			peso_ideal = (float)(72.7 * altura) - 58; //precisa inserir cast para que o resultado seja em float
			System.out.printf("Seu peso ideal é %.2f", peso_ideal);
		}
		if (sexo == 'f') {
			peso_ideal = (float)(62.1 * altura) - (float)44.7;//inserir o cast novamente porque 44.7 é um double e precisamos do resultado em float
			System.out.printf("Seu peso ideal é %.2f", peso_ideal); 
		}
		if (sexo != 'm' && sexo != 'f') {
			System.out.println("Sexo não reconhecido");
			peso_ideal = 0;
		}
		teclado.close();
		
	}

}
