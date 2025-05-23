import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;


public class Main {

    public static void main(String[] args) {

        //OBJS ALUNOS
        Aluno a1 = new AlunoRegular("123456789", "Pedro", 23, 420420);
        Aluno a2 = new AlunoRegular("543219876", "Diana", 21, 240240);
        Aluno a3 = new AlunoBolsista("987612345", "Léia", 24, 424242);

        //OBJS PROFESSORES
        Professor p1 = new Professor("987654321", "Carlos", 35, "TI");
        Professor p2 = new Professor("846752510", "Stela", 38, "TI");

        //OBJS DISCIPLINAS
        Disciplina d1 = new Disciplina(420, "POO", 1, p1);
        Disciplina d2 = new Disciplina(240, "Lógica", 2, p1);
        Disciplina d3 = new Disciplina(402, "Matemática", 3, p2);

        //OBJS TURMA
        Turma t1 = new Turma(001, p1, d1);
        Turma t2 = new Turma(002, p1, d2);
        Turma t3 = new Turma(003, p2, d3);

        //OBJS VISITANTES
        Visitante v1 = new Visitante("78904123456", "Bento", 30);
        Visitante v2 = new Visitante("50123456789", "Ana", 28);

        // ADC ALUNOS NAS TURMAS
        t1.adcAluno(a1);
        t1.adcAluno(a2);
        t1.adcAluno(a3);

        t2.adcAluno(a1);
        t2.adcAluno(a2);
        t2.adcAluno(a3);

        t3.adcAluno(a1);
        t3.adcAluno(a2);
        t3.adcAluno(a3);

        Turma[] turmas = {t1, t2, t3};
        for (Turma turma : turmas) {
            System.out.println("Turma: " + turma.codigo);
            System.out.println("Disciplina: " + turma.disciplina.nome);
            System.out.println("Professor: " + turma.professor.nome);
            System.out.println("Alunos: ");
            turma.listarAlunos();
            System.out.println();
        }

        //IMPRIMINDO METODO ANIVERSARIO
        a1.fazerAniversario();
        System.out.println("O aluno " + a1.nome + " fez aniversário. Agora ele tem: " + a1.idade + " anos.");


    }

}


/*
        //SCANNER TURMA 1:
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o CPF:");
        String cpf = sc.nextLine();

        System.out.println("Digite o seu nome:");
        String nome = sc.nextLine();

        Aluno a1 = new AlunoRegular(cpf, nome, 15, 000);

        a1.exibir();

        sc.close();


         */

/*
public BuscaTurmas implements ActionListener{

    //VARIAVEIS DA INTERFACE
    JFrame janela;
    JTextField show;
    JButton t1, t2, t3;


    BuscarTurmas(){
        //INSTANCIA DOS ELEMENTOS
        janela = new JFrame("Busca Turmas");
        show = new JTextField();
        t1 = new JButton("Turma 01");
        t2 = new JButton("Turma 02");
        t3 = new JButton("Turma 03");

        // LAYOUT (TAM + LOC)
        show.setBounds(0, 0, 500, 800);
        t1.setBounds(50, 50, 80, 30);
        t2.setBounds(110, 50, 80, 30);
        t3.setBounds(180, 50, 80, 30);

        //ADC COMPONENTES NA JANELA
        janela.add(show);
        janela.add(t1);
        janela.add(t2);
        janela.add(t3);

        //CONF JFRAME
        janela.setLayout(null);
        janela.setVisible(true);
        janela.setSize(500, 800);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setResizable(false);

        //ADC LISTENERS
        t1.addActionListener(this);
        t2.addActionListener(this);
        t3.addActionListener(this);
    };

    //AÇÕES DOS COMPONENTES
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == t1) {

            show.setText(show.getText(Turma));
            show.setText("");

        }

    };


*/