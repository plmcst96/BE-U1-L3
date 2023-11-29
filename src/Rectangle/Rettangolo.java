package Rectangle;

public class Rettangolo {
    private int height;
    private int width;

    public Rettangolo(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getPerimeter(){
        return 2 * (this.width + this.height);
    }
    public int getArea(){
        return this.width * this.height;
    }
}
