import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String nmrS = JOptionPane.showInputDialog(null, "Digite um número inteiro: ", "Divisor de 3 ou 5", JOptionPane.QUESTION_MESSAGE);

        int nmr = Integer.parseInt(nmrS);

        int teste1 = nmr %3;
        int teste2 = nmr %5;

        if (teste1 == 0 && teste2 !=0){
            JOptionPane.showMessageDialog(null, "Número divisivel por 3", "Divisor de 3 ou 5", JOptionPane.INFORMATION_MESSAGE);
        } else if (teste1 != 0 && teste2 ==0){
            JOptionPane.showMessageDialog(null, "Número divisivel por 5", "Divisor de 3 ou 5", JOptionPane.INFORMATION_MESSAGE);
        }

    
    }
}
