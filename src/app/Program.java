package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> list = new ArrayList<>();
		
		IO.print("Entre com o numero de contribuintes: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			IO.println("Contribuinte #" + i + ":");
			IO.print("Pessoa Fisica ou Juridica (f/j)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine(); // limpar o buffer
			IO.print("Nome: ");
			String nome = sc.nextLine();
			IO.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			if(ch == 'f') {
				IO.print("Despesas medicas: ");
				double despesasMedicas = sc.nextDouble();
				
				list.add(new PessoaFisica(nome, rendaAnual, despesasMedicas));
			}else {
				IO.print("Numero de funcionarios: ");
				int qtdFuncionarios = sc.nextInt();
				
				list.add(new PessoaJuridica(nome, rendaAnual, qtdFuncionarios));
			}
		}
		
		double soma = 0;
		IO.println();
		IO.println("IMPOSTOS: ");
		for(Contribuinte contribuiente : list) {
			IO.println(contribuiente.getNome() + ": $ " + String.format("%.2f", contribuiente.calculoImposto()));
			soma += contribuiente.calculoImposto();
		}
		IO.println("TOTAL ARRECADADO: " + String.format("%.2f", soma));
		
		sc.close();
	}

}
