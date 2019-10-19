import java.util.ArrayList;
import javax.swing.event.*;

/**
 * DataModel Class
 * Store number from the TextFrame
 */
public class DataModel
{
    ArrayList data;
    ArrayList dataList;

    /**
     * DataModel constructor
     * @param data - numbers from text fields
     */
    public DataModel(ArrayList data)
    {
        this.data = data;
        dataList = new ArrayList();
    }

    /**
     * add ChangeListener event
     * @param obj - object
     */
    public void add(ChangeListener obj)
    {
        dataList.add(obj);
    }

    /**
     * update data list of numbers
     * @param index - index of array data
     * @param value - value of index
     */
    public void update(int index, int value)
    {
        data.set(index, value);
        for (int i = 0; i < dataList.size(); i++)
        {
            ChangeListener c = (ChangeListener)dataList.get(i);
            c.stateChanged(new ChangeEvent(this));
        }
    }

    /**
     * get data list
     * @return datalist
     */
    public ArrayList getData()
    {
        ArrayList dataList = (ArrayList) data.clone();
        return dataList;
    }




}
