import javax.swing.JOptionPane;

public class PopcornRunner {
public static void main(String[] args) {
    Microwave Micro = new Microwave();
   String answer = JOptionPane.showInputDialog(null,"What flavor of popcorn do you want?");
  Popcorn Bob = new Popcorn("caramel");
   if(answer.equals("chocolate")) {
		 Bob = new Popcorn("chocolate");
}
   Micro.putInMicrowave(Bob);
   answer = JOptionPane.showInputDialog(null,"How many minutes do you want to cook the popcorn?");
  int time = Integer.parseInt(answer);       
Micro.setTime(time);
Micro.startMicrowave();
Bob.eat();
}
}
