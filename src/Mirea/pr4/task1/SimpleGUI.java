package Mirea.pr4.task1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {//kế thừa lớp JFrame(Swing)
    private JButton button_MU = new JButton("Manchester United");// tạo button;
    private JButton button_BVB = new JButton ("Borussia Dortmund");
    private JLabel result = new JLabel("Result: MU 0 - 0 BVB");
    private JLabel scorer = new JLabel("Last Scorer: N/A");
    private JLabel winner = new JLabel("Winner: DRAW");
    private int MU_Counter = 0;
    private int BVB_Counter = 0;

    public SimpleGUI(){
        super("Simple GUI");
        this.setBounds(100, 100, 300, 300);// trục x , y , width, height
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Sau khi JFrame bị đóng, chương trình cũng sẽ tắt theo.

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(5,5,2,2));//sử dụng trình quản lý bố cục
        container.add(button_MU);
        container.add(button_BVB);
        container.add(result);
        container.add(scorer);
        container.add(winner);

        button_MU.addActionListener(new ActionListener() {//java.awt.event.* click button
            @Override
            public void actionPerformed(ActionEvent e) {
                MU_Counter++;
                String txt = "Result: MU "+MU_Counter+" - "+BVB_Counter+" BVB";
                result.setText(txt);
                scorer.setText("Last Scorer: Manchester United (Ronaldo: 90+4')");
                if (MU_Counter!=BVB_Counter){
                    if(MU_Counter>BVB_Counter)
                        winner.setText("Winner: Manchester United");
                    else
                        winner.setText("Winner: Borussia Dortmund");
                }
                else
                    winner.setText("Winner: DRAW");
            }
        });

        button_BVB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BVB_Counter++;
                String txt = "Result: MU "+MU_Counter+" - "+BVB_Counter+" BVB";
                result.setText(txt);
                scorer.setText("Last Scorer: Borussia Dortmund(Haland : 90')");
                if (MU_Counter!=BVB_Counter){
                    if(MU_Counter>BVB_Counter)
                        winner.setText("Winner: Manchester United");
                    else
                        winner.setText("Winner: Borussia Dortmund");
                }
                else
                    winner.setText("Winner: DRAW");
            }
        });
    }

    public static void main(String[] args){
        new SimpleGUI().setVisible(true);
    }
}