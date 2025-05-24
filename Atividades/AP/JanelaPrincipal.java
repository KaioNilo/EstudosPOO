import javax.swing.*;
import java.awt.*;


//Conf GUI
public class JanelaPrincipal extends JFrame {

    private JTextArea areaExibicao;
    private Turma turma1, turma2, turma3;

    public JanelaPrincipal() {
        super("Sistema da Universidade");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(new BorderLayout());

        areaExibicao = new JTextArea();
        areaExibicao.setEditable(false);
        add(areaExibicao, BorderLayout.CENTER);

        //Criar painel de botoes
        JPanel painelBotoes = new JPanel();
        JButton btnTurma1 = new JButton("Turma 1");
        JButton btnTurma2 = new JButton("Turma 2");
        JButton btnTurma3 = new JButton("Turma 3");

        //Layout da GUI
        painelBotoes.setBounds(10, 10, 500, 300);

        //Adc botoes
        painelBotoes.add(btnTurma1);
        painelBotoes.add(btnTurma2);
        painelBotoes.add(btnTurma3);
        add(painelBotoes, BorderLayout.SOUTH);


        //Inicializar dados
        criarTurmas();

        // Ações dos botões
        btnTurma1.addActionListener(e -> mostrarTurma(turma1));
        btnTurma2.addActionListener(e -> mostrarTurma(turma2));
        btnTurma3.addActionListener(e -> mostrarTurma(turma3));
    }

    //Instanciar turmas
    private void criarTurmas() {

        Aluno a1 = new AlunoRegular("123456789", "Pedro", 23, 420420);
        Aluno a2 = new AlunoRegular("543219876", "Diana", 21, 120540);
        Aluno a3 = new AlunoBolsista("987612345", "Léia", 24, 864286);

        Professor p1 = new Professor("987654321", "Carlos", 35, "Centro de Ciências");
        Professor p2 = new Professor("846752510", "Stela", 38, "Centro de Tecnologia");

        Disciplina d1 = new Disciplina(420, "P.O.O.", 1, p1);
        Disciplina d2 = new Disciplina(240, "Lógica", 2, p1);
        Disciplina d3 = new Disciplina(402, "Matemática", 3, p2);

        turma1 = new Turma(001, p1, d1);
        turma2 = new Turma(002, p1, d2);
        turma3 = new Turma(003, p2, d3);

        for (Turma turma : new Turma[]{turma1, turma2, turma3}) {

            //Adc alunos na turma
            turma.adcAluno(a1);
            turma.adcAluno(a2);
            turma.adcAluno(a3);

            //Conteudo exibido
            System.out.println("Turma: " + turma.codigo);
            System.out.println("Disciplina: " + turma.disciplina.nome);
            System.out.println("Professor: " + turma.professor.getNome());
            System.out.println("Alunos: ");
            turma.getAlunos();
            System.out.println();
        }
    }

    //Mostrar turmas
    private void mostrarTurma(Turma turma) {

        //Criar strings dinamicamente
        StringBuilder sb = new StringBuilder();

        //Adc strings
        sb.append("\n");
        sb.append("Turma: ").append(turma.codigo).append("\n");
        sb.append("Disciplina: ").append(turma.disciplina.nome).append("\n");
        sb.append("Professor: ").append(turma.professor.getNome()).append("\n");
        sb.append("Alunos:\n");
        for (Aluno aluno : turma.getAlunos()) {
            sb.append("- ").append(aluno.getNome()).append(" (").append(aluno.getMatricula()).append(")\n");
        }

        //Setar dados na area de exibiçao
        areaExibicao.setText(sb.toString());

    }

    public static void main(String[] args) {

        //Metodo padrao p/ inicializar GUIs
        SwingUtilities.invokeLater(() -> {
            JanelaPrincipal janela = new JanelaPrincipal();
            janela.setVisible(true);
        });


    }
}