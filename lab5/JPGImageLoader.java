package Lab5;

public class JPGImageLoader implements ImageLoader{
    private String imageName;
    public JPGImageLoader(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public ImageContent load(String str) {
        System.out.println("Loaded JPG Image: " + str);
        return new ImageContent(str);
    }
}
