package missao072;

public class Missao072 {

    public static void main(String[] args) {

        System.out.println("Missão 07");
        System.out.println("");
        Empregado emp1 = new Empregado("João", "das Couves", 7000.0f);

        System.out.println(emp1.getNome() + " " + emp1.getSobrenome());
        System.out.println("Renda anual: R$" + String.format("%.2f", emp1.getSalario()));
        System.out.println("Renda anual: R$" + String.format("%.2f", emp1.SalarioAnual()));
        System.out.println("Renda anual acrescida de bonificação: R$"
                + String.format("%.2f", emp1.AumentoSalario()));

        System.out.println(" ");

        Empregado emp2 = new Empregado("José", "Arruela", 13000.0f);

        System.out.println(emp2.getNome() + " " + emp2.getSobrenome());
        System.out.println("Renda anual: R$" + String.format("%.2f", emp2.getSalario()));
        System.out.println("Renda anual: R$" + String.format("%.2f", emp2.SalarioAnual()));
        System.out.println("Renda anual acrescida de bonificação: R$"
                + String.format("%.2f", emp2.AumentoSalario()));
        
        System.out.println("");
        System.out.println("Powered by Java - Pacer Plínio Vieira");

    }

}
