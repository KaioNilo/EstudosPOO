public class App {
    public static void main (String[] args) throws Exception {
        Medico m = new Medico("123456789", "Pedro", "pedro@gmail.com", "pedro123", "MD420");
        Paciente p = new Paciente("987654321", "João", "joao@emil.com", "joao123");
        Sala s = new Sala(m);

        s.adcPaciente(p);
        s.listarPacientes();
    }
}
