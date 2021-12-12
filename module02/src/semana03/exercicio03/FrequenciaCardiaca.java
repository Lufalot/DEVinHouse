package semana03.exercicio03;

import java.time.LocalDate;
import java.time.Period;

public class FrequenciaCardiaca {
    private String nome;
    private String sobrenome;
    private String dataNascimento;

    public FrequenciaCardiaca(String nome, String sobrenome, String dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
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

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public int getIdade() {
        LocalDate birthday = LocalDate.parse(dataNascimento);
        LocalDate now = LocalDate.now();
        Period diff = Period.between(birthday, now);
        return diff.getYears();
    }

    public float getFreqCardiacaMax() {
        return 220 - getIdade();
    }

    public String getFreqCardiacaAlvo() {
        float freqCardiacaMaxima = getFreqCardiacaMax();
        String freqCardiacaAlvoMin = String.valueOf(freqCardiacaMaxima * 50 / 100);
        String freqCardiacaAlvoMax = String.valueOf(freqCardiacaMaxima * 85 / 100);
        String freqCardiacaAlvo = freqCardiacaAlvoMin + " a " + freqCardiacaAlvoMax;
        return freqCardiacaAlvo ;
    }


}
