
/**
 * Write a description of class EmptyCell here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmptyCell implements Cell
{

    public EmptyCell()
    {
    }

    public String abbreviatedCellText(){
        return "          ";
    }
    
    public String fullCellText(){
        return "          ";
    }
}
