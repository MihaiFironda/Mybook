package Lab5;

import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture {
    private String imageName;
    private Dimension dim = new Dimension(400,400);

    private ImageContent content;
    private ImageLoaderFactory imageLoaderFactory = new ImageLoaderFactory();

    public Image(String imageName) {
        this.imageName = imageName;

        try {
            TimeUnit.SECONDS.sleep(5);
        }
        catch( InterruptedException e) { e.printStackTrace(); }
    }

    public Image(Image image) {
        this.imageName = image.imageName;
    }

    public void loadContent() throws Exception {
        ImageLoader loader = ImageLoaderFactory.create(imageName);
        content = loader.load("Content");
    }

    public void print() {
        System.out.println(this.imageName);
    }

    @Override
    public void add(Element element) {
        //not needed
    }

    @Override
    public void remove(Element element) {
        //not needed
    }

    @Override
    public String url() {
        return this.imageName;
    }

    @Override
    public Dimension dim() {
        return this.dim;
    }
}