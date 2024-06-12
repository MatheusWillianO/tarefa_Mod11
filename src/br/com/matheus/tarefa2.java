package br.com.matheus;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class tarefa2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<String> grupoMasculino = new ArrayList<>();
        List<String> grupoFeminino = new ArrayList<>();
        System.out.println("Digite o nome e o sexo:");

        while (true) {
            String entrada = s.nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }
            
            String[] partes = entrada.split("-");
            if (partes.length != 2) {
                System.out.println("Formato inválido. Por favor, use o formato 'nome-sexo'.");
                continue;
            }

            String nome = partes[0].trim();
            String sexo = partes[1].trim().toUpperCase();

            if (sexo.equals("M")) {
                grupoMasculino.add(nome);
            } else if (sexo.equals("F")) {
                grupoFeminino.add(nome);
            } else {
                System.out.println("Sexo inválido. Use 'M' para masculino e 'F' para feminino.");
            }
        }

        System.out.println("\nGrupo Masculino:");
        for (String nome : grupoMasculino) {
            System.out.println(nome);
        }

        System.out.println("\nGrupo Feminino:");
        for (String nome : grupoFeminino) {
            System.out.println(nome);
        }

        s.close();
    }

}
