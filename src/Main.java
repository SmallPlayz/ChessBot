import javax.swing.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        new ChessGame();
    }
}

class ChessGame {
    JFrame frame;
    JLabel chessBoard;
    JLabel pawnWhite1;
    JLabel pawnWhite2;
    JLabel pawnWhite3;
    JLabel pawnWhite4;
    JLabel pawnWhite5;
    JLabel pawnWhite6;
    JLabel pawnWhite7;
    JLabel pawnWhite8;
    
    JLabel pawnBlack1;
    JLabel pawnBlack2;
    JLabel pawnBlack3;
    JLabel pawnBlack4;
    JLabel pawnBlack5;
    JLabel pawnBlack6;
    JLabel pawnBlack7;
    JLabel pawnBlack8;
    private static int[][] chessArr;

    private static HashMap<String, String> moveBoard;
    ChessGame() {
        frame = new JFrame("Chess");
        frame.setSize(694, 717);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        chessBoard = new JLabel();
        chessBoard.setBounds(0, 0, 680, 680);
        chessBoard.setIcon(new ImageIcon("src/chessBoard.png"));
        frame.add(chessBoard);

        pawnWhite1 = new JLabel();
        pawnWhite1.setBounds(10, 520, 65, 65);
        pawnWhite1.setIcon(new ImageIcon("src/pawn.png"));
        chessBoard.add(pawnWhite1);

        pawnWhite2 = new JLabel();
        pawnWhite2.setBounds(pawnWhite1.getX()+85, 520, 65, 65);
        pawnWhite2.setIcon(new ImageIcon("src/pawn.png"));
        chessBoard.add(pawnWhite2);

        pawnWhite3 = new JLabel();
        pawnWhite3.setBounds(pawnWhite2.getX()+85, 520, 65, 65);
        pawnWhite3.setIcon(new ImageIcon("src/pawn.png"));
        chessBoard.add(pawnWhite3);

        pawnWhite4 = new JLabel();
        pawnWhite4.setBounds(pawnWhite3.getX()+85, 520, 65, 65);
        pawnWhite4.setIcon(new ImageIcon("src/pawn.png"));
        chessBoard.add(pawnWhite4);

        pawnWhite5 = new JLabel();
        pawnWhite5.setBounds(pawnWhite4.getX()+85, 520, 65, 65);
        pawnWhite5.setIcon(new ImageIcon("src/pawn.png"));
        chessBoard.add(pawnWhite5);

        pawnWhite6 = new JLabel();
        pawnWhite6.setBounds(pawnWhite5.getX()+85, 520, 65, 65);
        pawnWhite6.setIcon(new ImageIcon("src/pawn.png"));
        chessBoard.add(pawnWhite6);

        pawnWhite7 = new JLabel();
        pawnWhite7.setBounds(pawnWhite6.getX()+85, 520, 65, 65);
        pawnWhite7.setIcon(new ImageIcon("src/pawn.png"));
        chessBoard.add(pawnWhite7);

        pawnWhite8 = new JLabel();
        pawnWhite8.setBounds(pawnWhite7.getX()+85, 520, 65, 65);
        pawnWhite8.setIcon(new ImageIcon("src/pawn.png"));
        chessBoard.add(pawnWhite8);

        pawnBlack1 = new JLabel();
        pawnBlack1.setBounds(10, 95, 65, 65);
        pawnBlack1.setIcon(new ImageIcon("src/pawnBlack.png"));
        chessBoard.add(pawnBlack1);

        pawnBlack2 = new JLabel();
        pawnBlack2.setBounds(pawnBlack1.getX()+85, 95, 65, 65);
        pawnBlack2.setIcon(new ImageIcon("src/pawnBlack.png"));
        chessBoard.add(pawnBlack2);

        pawnBlack3 = new JLabel();
        pawnBlack3.setBounds(pawnBlack2.getX()+85, 95, 65, 65);
        pawnBlack3.setIcon(new ImageIcon("src/pawnBlack.png"));
        chessBoard.add(pawnBlack3);

        pawnBlack4 = new JLabel();
        pawnBlack4.setBounds(pawnBlack3.getX()+85, 95, 65, 65);
        pawnBlack4.setIcon(new ImageIcon("src/pawnBlack.png"));
        chessBoard.add(pawnBlack4);

        pawnBlack5 = new JLabel();
        pawnBlack5.setBounds(pawnBlack4.getX()+85, 95, 65, 65);
        pawnBlack5.setIcon(new ImageIcon("src/pawnBlack.png"));
        chessBoard.add(pawnBlack5);

        pawnBlack6 = new JLabel();
        pawnBlack6.setBounds(pawnBlack5.getX()+85, 95, 65, 65);
        pawnBlack6.setIcon(new ImageIcon("src/pawnBlack.png"));
        chessBoard.add(pawnBlack6);

        pawnBlack7 = new JLabel();
        pawnBlack7.setBounds(pawnBlack6.getX()+85, 95, 65, 65);
        pawnBlack7.setIcon(new ImageIcon("src/pawnBlack.png"));
        chessBoard.add(pawnBlack7);

        pawnBlack8 = new JLabel();
        pawnBlack8.setBounds(pawnBlack7.getX()+85, 95, 65, 65);
        pawnBlack8.setIcon(new ImageIcon("src/pawnBlack.png"));
        chessBoard.add(pawnBlack8);



        chessArr = new int[8][8];

        moveBoard = new HashMap<>();

        fillMoveBoard();

        //printBoard();

        fillBoard();

        //printBoard();

        frame.setVisible(true);
    }

    private void fillMoveBoard() {
        moveBoard.put("a1", "X,Y");
        moveBoard.put("a2", "X,Y");
        moveBoard.put("a3", "X,Y");
        moveBoard.put("a4", "X,Y");
        moveBoard.put("a5", "X,Y");
        moveBoard.put("a6", "X,Y");
        moveBoard.put("a7", "X,Y");
        moveBoard.put("a8", "X,Y");

        moveBoard.put("b1", "X,Y");
        moveBoard.put("b2", "X,Y");
        moveBoard.put("b3", "X,Y");
        moveBoard.put("b4", "X,Y");
        moveBoard.put("b5", "X,Y");
        moveBoard.put("b6", "X,Y");
        moveBoard.put("b7", "X,Y");
        moveBoard.put("b8", "X,Y");

        moveBoard.put("c1", "X,Y");
        moveBoard.put("c2", "X,Y");
        moveBoard.put("c3", "X,Y");
        moveBoard.put("c4", "X,Y");
        moveBoard.put("c5", "X,Y");
        moveBoard.put("c6", "X,Y");
        moveBoard.put("c7", "X,Y");
        moveBoard.put("c8", "X,Y");

        moveBoard.put("d1", "X,Y");
        moveBoard.put("d2", "X,Y");
        moveBoard.put("d3", "X,Y");
        moveBoard.put("d4", "X,Y");
        moveBoard.put("d5", "X,Y");
        moveBoard.put("d6", "X,Y");
        moveBoard.put("d7", "X,Y");
        moveBoard.put("d8", "X,Y");

        moveBoard.put("e1", "X,Y");
        moveBoard.put("e2", "X,Y");
        moveBoard.put("e3", "X,Y");
        moveBoard.put("e4", "X,Y");
        moveBoard.put("e5", "X,Y");
        moveBoard.put("e6", "X,Y");
        moveBoard.put("e7", "X,Y");
        moveBoard.put("e8", "X,Y");

        moveBoard.put("f1", "X,Y");
        moveBoard.put("f2", "X,Y");
        moveBoard.put("f3", "X,Y");
        moveBoard.put("f4", "X,Y");
        moveBoard.put("f5", "X,Y");
        moveBoard.put("f6", "X,Y");
        moveBoard.put("f7", "X,Y");
        moveBoard.put("f8", "X,Y");

        moveBoard.put("g1", "X,Y");
        moveBoard.put("g2", "X,Y");
        moveBoard.put("g3", "X,Y");
        moveBoard.put("g4", "X,Y");
        moveBoard.put("g5", "X,Y");
        moveBoard.put("g6", "X,Y");
        moveBoard.put("g7", "X,Y");
        moveBoard.put("g8", "X,Y");

        moveBoard.put("h1", "X,Y");
        moveBoard.put("h2", "X,Y");
        moveBoard.put("h3", "X,Y");
        moveBoard.put("h4", "X,Y");
        moveBoard.put("h5", "X,Y");
        moveBoard.put("h6", "X,Y");
        moveBoard.put("h7", "X,Y");
        moveBoard.put("h8", "X,Y");
    }

    private void fillBoard() {
        for(int i = 0; i<8; i++) {
            chessArr[1][i] = 1;
            chessArr[6][i] = -1;
        }
        chessArr[0][2] = 4;
        chessArr[7][2] = 4;
        chessArr[0][3] = 5;
        chessArr[7][3] = 5;
        chessArr[0][4] = 6;
        chessArr[7][4] = 6;
    }

    public void printBoard(){
        for(int[] i : chessArr) {
            for (int j : i)
                System.out.print(j + "\t");
            System.out.println();
        }
        System.out.println();
    }
}