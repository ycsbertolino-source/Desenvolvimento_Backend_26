package Exercicio_04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criação da lista utilizando o tipo mais genérico (Maquina)
        List<Maquina> linhaDeProducao = new ArrayList<>();

        // Adicionando instâncias das subclasses na lista
        linhaDeProducao.add(new Esteira(101, "Esteira Transportadora A", "Ativa"));
        linhaDeProducao.add(new RoboIndustrial(205, "Braço Robótico KR-16", "Em Espera"));
        linhaDeProducao.add(new Prensa(302, "Prensa Hidráulica 500T", "Em Manutenção"));

        System.out.println("--- Iniciando Linha de Produção ---\n");

        // Percorrendo a lista e executando o método operar() de cada objeto
        for (Maquina maquina : linhaDeProducao) {
            maquina.exibirInfo();
            maquina.operar(); // Comportamento polimórfico
            System.out.println("-------------------------------------------------");
        }
    }
}