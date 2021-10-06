import java.util.ArrayList;

public class Book {
    private String name;
    private ArrayList<String> paragraph=new ArrayList<>();
    private ArrayList<String> image=new ArrayList<>();
    private ArrayList<String> table=new ArrayList<>();

    public Book(String name) {
        this.name = name;
    }
    public void createNewParagraph(String str)
    {
        paragraph.add(str);
    }

    public void createNewImage(String img)
    {
        image.add(img);
    }
    public void createNewTable(String tb)
    {
        table.add(tb);
    }
    public void printHelp(ArrayList<String> li)
    {
        for(String el:li)
            System.out.println(el);
    }
    public void print()
    {
        System.out.println(this.name);
        printHelp(paragraph);
        printHelp(image);
        printHelp(table);
    }

}
