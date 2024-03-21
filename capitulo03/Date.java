package capitulo03;

public class Date {
    private int dia;
    private int mes;
    private int ano;

    public Date(int dia, int mes, int ano) {
        if (dia > 0 && dia <= 31) {
            this.dia = dia;
        } else {
            this.dia = 1;
        }
        if (mes > 0 && mes <= 12) {
            this.mes = mes;
        } else {
            this.mes = 1;
        }
        if (ano > 0) {
            this.ano = ano;
        } else {
            this.ano = 2000;
        }
    }

    public String displayDate() {
        return dia + "/" + mes + "/" + ano;
    } // Parece o toString

    public void getDia(int dia) {
        if (dia > 0 && dia <= 31) {
            this.dia = dia;
        } else {
            this.dia = 0;
        }
    }

    public int setDia() {
        return dia;
    }

    public void getMes(int mes) {
        if (mes > 0 && mes <= 12) {
            this.mes = mes;
        } else {
            this.mes = 1;
        }
    }

    public int setMes() {
        return mes;
    }

    public void getAno(int ano) {
        if (ano > 0) {
            this.ano = ano;
        } else {
            this.ano = 2000;
        }
    }

    public int setAno() {
        return ano;
    }
}
