package missao072;

public class Empregado {

    private String nome;
    private String sobrenome;
    private float salario;

    public Empregado(String nome, String sobrenome, float salario) {
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setSalario(salario);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        if (salario < 0) {
            this.salario = 0.0f;
        } else {
            this.salario = salario;
        }
    }

     public float SalarioAnual() {
        salario = (salario * 12);
        return salario;
    }

    public float AumentoSalario() {
        salario = (salario * 1.1f);
        return salario;
    }
}
