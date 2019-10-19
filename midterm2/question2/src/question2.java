import java.util.ArrayList;

/**
 * Test class
 */
public class question2
{
    public static void main(String[] args)
    {
        //Create data list
        ArrayList list = new ArrayList();
        list.add(3);
        list.add(19);
        list.add(0);
        list.add(1);
        list.add(30);
        list.add(4);
        list.add(10);


        //Store the data to model
        DataModel dataModel = new DataModel(list);
        //Generate Text Frame
        TextFrame textframe = new TextFrame(dataModel);
        //Generate Bar Frame
        BarGraph barGraph = new BarGraph(dataModel);
        //involve BarGraph to DataModel ChangeListener
        dataModel.add(barGraph);



    }
}
