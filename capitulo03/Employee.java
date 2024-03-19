package capitulo03;

public class Employee {
    private String nome;
    private  String sobrenome;
    private double salario;

    public Employee(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }

    public double acrescimoSalario () {
        if (salario <= 0) {
            return 0;
        } else {
            return salario *= 1.1;
        }
    }

    public String setNome() {
        return nome;
    }

    public void getNome(String nome) {
        this.nome = nome;
    }

    public String setSobrenome() {
        return sobrenome;
    }

    public void getSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double setSalario() {
        if (salario <= 0) {
            return 0;
        } else {
            return salario;
        }
    }
}
