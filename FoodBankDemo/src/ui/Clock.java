/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author zhengfang
 */
public class Clock {
    public JLabel time = new JLabel();
    private final SimpleDateFormat sdf  = new SimpleDateFormat("hh:mm");
    private int   currentSecond;
    private Calendar calendar;

    public Clock() {
    }

//    public static void main( String [] args ) {
//        JFrame frame = new JFrame();
//        Clock clock = new Clock();
//        frame.add( clock.time );
//        frame.pack();
//        frame.setVisible( true );
//        clock.start();
//    }
    
    private void reset(){
        calendar = Calendar.getInstance();
        currentSecond = calendar.get(Calendar.SECOND);
    }
    public void start(){
        reset();
        Timer timer = new Timer(1000, new ActionListener(){
        public void actionPerformed( ActionEvent e ) {
                if( currentSecond == 60 ) {
                    reset();
                }
                time.setText( String.format("%s:%02d", sdf.format(calendar.getTime()), currentSecond ));
                currentSecond++;
            }
        });
        timer.start();
    }

    
}
