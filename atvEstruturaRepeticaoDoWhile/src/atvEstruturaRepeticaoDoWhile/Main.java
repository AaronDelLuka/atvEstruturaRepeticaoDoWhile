package atvEstruturaRepeticaoDoWhile;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Algoritmo 01 (validação de nota, salário, sexo e idade e permitindo repetições)
		 * String entrada;
		int numero1, numero2, soma;

		do {
			entrada = JOptionPane.showInputDialog("Informe o primeiro número: ");
			numero1 = Integer.parseInt(entrada);

			entrada = JOptionPane.showInputDialog("Informe o segundo número: ");
			numero2 = Integer.parseInt(entrada);

			soma = numero1 + numero2;
			JOptionPane.showMessageDialog(null, "A soma é: " + soma);

			entrada = JOptionPane.showInputDialog("Deseja continuar? (S)im ou (N)ão").toLowerCase();
		} while (entrada.equals("s") || entrada.equals("sim"));
		*/
		
		/* Algoritmo 02 (validação de nota, salário, sexo e idade e permitindo repetições):
		 * String entrada;
		int numero1, numero2, soma;

		do {
			entrada = JOptionPane.showInputDialog("Informe o primeiro número: ");
			numero1 = Integer.parseInt(entrada);

			entrada = JOptionPane.showInputDialog("Informe o segundo número: ");
			numero2 = Integer.parseInt(entrada);

			soma = numero1 + numero2;
			JOptionPane.showMessageDialog(null, "A soma é: " + soma);

			int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");

			if (resp == JOptionPane.YES_OPTION) {
				entrada = "sim";
			} else if (resp == JOptionPane.NO_OPTION || resp == JOptionPane.CANCEL_OPTION) {
				entrada = "não";
			}
		} while (entrada.equals("s") || entrada.equals("sim"));
		*/
		
		/* Exercício 2 (validação de nota, salário, sexo e idade):
		 * Scanner scanner = new Scanner(System.in);

		double nota;
		double salario;
		char sexo;
		int idade;

		do {
			System.out.print("Informe a nota (entre 0 e 10): ");
			nota = scanner.nextDouble();
		} while (nota < 0 || nota > 10);

		do {
			System.out.print("Informe o salário (maior que zero): ");
			salario = scanner.nextDouble();
		} while (salario <= 0);

		do {
			System.out.print("Informe o sexo (m ou f): ");
			sexo = scanner.next().charAt(0);
		} while (sexo != 'm' && sexo != 'f');

		do {
			System.out.print("Informe a idade (entre 0 e 120): ");
			idade = scanner.nextInt();
		} while (idade < 0 || idade > 120);

		System.out.println("Dados informados com sucesso!");
		*/
	}

}
