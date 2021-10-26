package Lab5;

import javax.naming.Context;

public class AlignRight implements AlignStrategy{
    @Override
    public void render(Paragraph paragraph, Context context) {

        System.out.println("Align Right: " + paragraph);
    }
}
