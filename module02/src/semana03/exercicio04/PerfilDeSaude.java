package semana03.exercicio04;

import java.time.LocalDate;
import java.time.Period;

public class PerfilDeSaude {

        private String nome;
        private String sobrenome;
        private String sexo;
        private String dataNascimento;
        private float altura;
        private float peso;

        public PerfilDeSaude(String nome, String sobrenome, String sexo, String dataNascimento, float altura, float peso) {
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.sexo = sexo;
            this.dataNascimento = dataNascimento;
            this.altura = altura;
            this.peso = peso;
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
            return freqCardiacaAlvoMin + " a " + freqCardiacaAlvoMax;
        }

        public float getIMC() {
            return peso / (altura * altura);
        }

}
