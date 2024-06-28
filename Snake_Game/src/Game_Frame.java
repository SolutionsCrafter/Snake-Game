import javax.swing.*;
//test
public class Game_Frame extends JFrame {

        Game_Frame() {
            this.add(new Game_Panel());
            this.setTitle("-----Snake Game-----");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setResizable(false);
            this.pack();
            this.setVisible(true);
            this.setLocationRelativeTo(null);
        }

        public static void main(String[] args) {
            new Game_Frame();

    }

}
