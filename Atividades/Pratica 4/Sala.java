import java.util.ArrayList;

public class Sala {
    public Medico medico;
    public ArrayList<Paciente> pacientes;

    public Sala (Medico medico) {
        this.medico = medico;
        this.pacientes = new ArrayList<>();
    }

    //MÉTODOS
    public void adcPaciente (Paciente p) {
        pacientes.add(p);
    }

    public void listarPacientes () {
        for (Paciente p: pacientes) {
            p.exibir();
        }
    }

}
