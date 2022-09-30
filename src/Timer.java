import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Timer extends JFrame implements ActionListener {


    Button timerStart, timerStop, timerReset;
    Label timeUpDialog;
    


    public static void main(String[] args){
        new Timer();
    }

    /////////////////////
    // constructor for timer i fear.


    Timer(){

        super("Stopwatch!!!!");

        timerStart = new Button("START");
        timerStart.setBounds(50,200,200,50);

        timerReset = new Button("RESET");
        timerReset.setBounds(250,200,200,50);


        timerStart.addActionListener(this);
        timerReset.addActionListener(this);

        add(timerStart);
        add(timerReset);

        setSize(550,300);
        setLayout(null);
        setVisible(true);

        JLabel time= new JLabel("Time is here.");

    }


    Instant timeClick;



    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

 /*   @Override
    public void actionPerformed(ActionEvent e) {
        timeClick = Instant.now();

        Timer timer = new Timer(1, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                time.setText(Duration.between(start, Instant.now()).getSeconds() + "");
            }
        });
        timer.start();
        )
        
    }

    */

}