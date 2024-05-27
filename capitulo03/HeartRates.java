package capitulo03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class HeartRates {
    public String nome;
    public String sobrenome;
    public String diaDeNascimento;
    public String mesDeNascimento;
    public String anoDeNascimento;

    public HeartRates(String nome, String sobrenome, String diaDeNascimento, String mesDeNascimento, String anoDeNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.diaDeNascimento = diaDeNascimento;
        this.mesDeNascimento = mesDeNascimento;
        this.anoDeNascimento = anoDeNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setDiaDeNascimento(String diaDeNascimento) {
        this.diaDeNascimento = diaDeNascimento;
    }

    public String getDiaDeNascimento() {
        return diaDeNascimento;
    }

    public void setMesDeNascimento(String mesDeNascimento) {
        this.mesDeNascimento = mesDeNascimento;
    }

    public String getMesDeNascimento() {
        return mesDeNascimento;
    }

    public void setAnoDeNascimento(String anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }

    public String getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public int calcularIdade() {
        String dataNascimentoStr = this.diaDeNascimento + "/" + this.mesDeNascimento + "/" + this.anoDeNascimento;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);
        LocalDate dataAtual = LocalDate.now();
        return (int) ChronoUnit.YEARS.between(dataNascimento, dataAtual);
    }

    public float calculoDeFrequencia() {
        float calculoDeFrequencia = 220 - this.calcularIdade();
        return calculoDeFrequencia;
    }

    public double calculoDeFrenquenciaIdeal() {
        double calculoDeFrenquenciaIdeal = this.calculoDeFrequencia()*0.75;
        return calculoDeFrenquenciaIdeal;
    }
}
