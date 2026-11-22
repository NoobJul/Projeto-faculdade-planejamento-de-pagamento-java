package br.com.exemplo.folha;

public class Main {
    public static void main(String[] args) {
        // Cada posição do vetor é do tipo Colaborador, mas guarda uma subclasse.
        Colaborador[] colaboradores = new Colaborador[3];

        colaboradores[0] = new ColaboradorPadrao(
                "001", "Ana Lima", 2500.00);
        colaboradores[1] = new ColaboradorComissionado(
                "002", "Bruno Souza", 1800.00, 12000.00, 5.0);
        colaboradores[2] = new ColaboradorProducao(
                "003", "Carla Reis", 1600.00, 120, 3.50);

        for (int i = 0; i < colaboradores.length; i++) {
            System.out.println("------------------------------");
            colaboradores[i].exibirDados();
        }
    }
}
