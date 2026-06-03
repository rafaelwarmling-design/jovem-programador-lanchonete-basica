import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1 - Hambúrguer (R$ 18,00)");
        System.out.println("2 - Cheeseburguer (R$ 20,00)");
        System.out.println("3 - Batata Frita (R$ 12,00)");
        System.out.println("4 - Refrigerante (R$ 8,00)");
        System.out.println("5 - Suco Natural (R$ 10,00)");
        System.out.println("6 - Milkshake (R$ 15,00)");
        System.out.println("7 - Salada (R$ 16,00)");

        System.out.print("Digite o código do produto: ");
        int codigo = scan.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = scan.nextInt();

        System.out.println("Categorias:");
        System.out.println("1: Estudante");
        System.out.println("2: Idoso");
        System.out.println("3: Cliente comum");
        System.out.print("Informe a categoria: ");
        int categoria = scan.nextInt();

        String nomeProduto = "";
        double precoUnitario = 0;

        switch (codigo) {
            case 1:
                nomeProduto = "Hambúrguer";
                precoUnitario = 18.00;
                break;
            case 2:
                nomeProduto = "Cheeseburguer";
                precoUnitario = 20.00;
                break;
            case 3:
                nomeProduto = "Batata Frita";
                precoUnitario = 12.00;
                break;
            case 4:
                nomeProduto = "Refrigerante";
                precoUnitario = 8.00;
                break;
            case 5:
                nomeProduto = "Suco Natural";
                precoUnitario = 10.00;
                break;
            case 6:
                nomeProduto = "Milkshake";
                precoUnitario = 15.00;
                break;
            case 7:
                nomeProduto = "Salada";
                precoUnitario = 16.00;
                break;
            default:
                System.out.println("Código de produto inválido!");


        }

        if (quantidade <= 0) {
            System.out.println("Quantidade deve ser maior que zero!");

        }

        double desconto = 0;
        String descCategoria = "";
        String percDesconto = "0%";

        if (categoria == 1) {
            desconto = 0.10;
            descCategoria = "Estudante";
            percDesconto = "10%";
        } else if (categoria == 2) {
            desconto = 0.20;
            descCategoria = "Idoso";
            percDesconto = "20%";
        } else if (categoria == 3) {
            desconto = 0;
            descCategoria = "Cliente comum";
            percDesconto = "0%";
        } else {
            System.out.println("Categoria inválida!");
            return;

        }

        double valorBruto = precoUnitario * quantidade;
        double valorFinal = valorBruto * (1 - desconto);

        System.out.println("\n== Comprovante de Compra ====");
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Categoria: " + descCategoria);
        System.out.println("Desconto aplicado: " + percDesconto);
        System.out.println("Quantidade: " + quantidade);
        System.out.printf("Valor total: R$ %.2f\n", valorFinal);
        System.out.println("==== Bom apetite! ====");

        scan.close();
    }
}