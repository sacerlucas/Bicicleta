package entity;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInformações para Bicicleta Elétrica:");
        Bicicleta bicicletaEletrica = criarBicicleta(scanner,"elétrica");

        System.out.println("\nInformações para Bicicleta Motorizada:");
        Bicicleta bicicletaMotorizada = criarBicicleta(scanner, "motorizada");

        List<Bicicleta> bicicletas = List.of(bicicletaEletrica, bicicletaMotorizada);
        mostrarBicicletas(bicicletas);
    }

    private static Bicicleta criarBicicleta(Scanner scanner, String tipo) {
        System.out.print("Tamanho do aro: ");
        double tamanhoDoAro = scanner.nextDouble();
        System.out.print("Tamanho do quadro: ");
        double tamanhoDoQuadro = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Cor: ");
        String cor = scanner.nextLine();
        System.out.print("Material do quadro: ");
        String materialQuadro = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        if (tipo.equalsIgnoreCase("elétrica")) {
            System.out.print("Tempo de carga (em horas): ");
            double tempoDeCarga = scanner.nextDouble();
            return new BicicletaEletrica(tamanhoDoAro, tamanhoDoQuadro, cor, materialQuadro, modelo, tempoDeCarga, 25.0);
        } else {
            System.out.print("Capacidade de combustível: ");
            double capacidadeDeCombustivel = scanner.nextDouble();
            System.out.print("Cilindradas do motor: ");
            int cilindradas = scanner.nextInt();
            return new BicicletaMotorizada(tamanhoDoAro, tamanhoDoQuadro, cor, materialQuadro, modelo, capacidadeDeCombustivel, cilindradas);
        }
    }

    private static void mostrarBicicletas(List<Bicicleta> bicicletas) {
        for (Bicicleta bicicleta : bicicletas) {
            System.out.println(bicicleta);
        }
    }
}