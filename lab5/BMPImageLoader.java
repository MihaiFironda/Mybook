package Lab5;

public class BMPImageLoader implements ImageLoader{
    private String imageName;

    public BMPImageLoader(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public ImageContent load(String str) {
        System.out.println("Loaded BMP Image: " + imageName);
        return new ImageContent(str);
    }
}
