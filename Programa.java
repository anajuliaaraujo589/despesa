
import model.Conta;
import model.Despesa;
import model.Meta;
import model.Receita;

public class Programa {
    public static void main(String[] args) {

        // Instanciação e configuração da Conta
        Conta conta_1 = new Conta();
        conta_1.setNumero(76521);
        conta_1.setCliente("Alex Silva");
        conta_1.setSaldo(100.0);
        conta_1.setLimite(100.0);

        // Instanciação da Receita
        Receita receita_1 = new Receita();

        // Instanciação da Despesa
        Despesa despesa_1 = new Despesa("aluguel", 1200.00);

        // Variável de controle para a Meta
        double valorPoupado = 500.0;

        // Impressão do Relatório
        System.out.println("\n=================================");
        System.out.println("      RELATÓRIO FINANCEIRO");
        System.out.println("=================================");

        System.out.println("Cliente: " + conta_1.getCliente());
        System.out.println("Saldo Atual: R$ " + conta_1.getSaldo());

        System.out.println("\nReceita:");
        System.out.println("- Receita Cadastrada: R$ 2000.0");

        System.out.println("\nDespesa:");
        System.out.println("- " + despesa_1.getDescricao() + ": R$ " + despesa_1.getValor());

        System.out.println("\nMeta:");
        System.out.println(
            "- Comprar Computador: R$ " +
            valorPoupado +
            " poupados de R$ 3000.0"
        );
    }
}
