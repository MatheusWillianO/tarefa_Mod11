package br.com.matheus;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class tarefa1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite 4 nomes de sua escolha.");

        List<String> lista = new ArrayList<>();
        lista.add(s.next());
        lista.add(s.next());
        lista.add(s.next());
        lista.add(s.next());
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}
