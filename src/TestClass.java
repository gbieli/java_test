import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.LinkedList;

/**
 * Created by gbieli on 26.03.16.
 */

public class TestClass {
    public static void main(String args[]){
        System.out.println("Hello World");

        for(int i=0; i<=5; i++){
            System.out.println(i);
        }

        LinkedList<String> list = new LinkedList<>();
        list.add("bla");
        list.add("bla2");

        for(String element : list){
            System.out.println(element.toString());
        }

        JFrame frame = new JFrame("Frame");
        frame.setLayout(new FlowLayout());
        JButton button = new JButton("click");
        frame.add(button);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
