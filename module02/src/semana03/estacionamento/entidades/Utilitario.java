package semana03.estacionamento.entidades;

import java.time.LocalTime;

public class Utilitario extends Veiculo {
    private final double FATOR_ESTACIONAMENTO = 1;

    public Utilitario(String placa, LocalTime horaEntrada) {
        super(placa, horaEntrada);
        this.setFatorEstacionamento(FATOR_ESTACIONAMENTO);
    }
}
