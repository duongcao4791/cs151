import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

/**
 * TextFrame Class
 * Text fields contains numbers
 * Update the DataModel and the number view when a number is updated
 */
public class TextFrame extends JFrame implements ActionListener
{
    private ArrayList arr;
    DataModel dataModel;
    JTextField[] dataList;

    /**
     * Create TextFrame
     * @param data - numbers
     */
    public TextFrame(DataModel data)
    {
        //Store data in a model
        dataModel = data;
        arr = dataModel.getData();
        dataList = new JTextField[arr.size()];

        //Create a frame
        JFrame frame = new JFrame();
        frame.setLocation(100, 200);        //set appear location
        frame.setLayout(new GridLayout(arr.size()+1,1));    //set layout

        //Create a textLabel
        JTextPane textLabel = new JTextPane();
        textLabel.setText("Change integer numbers below and press enter");
        frame.add(textLabel);

        //Add Action Listener to update new numbers from the textField
        for (int i = 0; i < arr.size(); i++)
        {
            JTextField textField = new JTextField(arr.get(i).toString());
            textField.addActionListener(this);
            frame.add(textField);
            dataList[i] = textField;
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    /**
     * actionPerformed for the ActionListener implementation
     * @param e - action event
     */
    public void actionPerformed(ActionEvent e)
    {
        JTextField text = (JTextField)e.getSource();
        int i = 0;
        while (i < dataList.length && dataList[i] != text)
            i++;
        String s = text.getText();
        try
        {
            int value = Integer.parseInt(s);
            dataModel.update(i, value);
        }
        catch (Exception exc)
        {
            text.setText("Error: Please enter an Integer");
        }

    }
}
