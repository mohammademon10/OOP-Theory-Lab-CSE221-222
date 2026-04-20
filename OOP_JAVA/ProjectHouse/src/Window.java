public class Window {
    private int height;
    private int width;
    public Window(int height,int width)
    {
        this.height=height;
        this.width=width;
    }
    public void display(){
        System.out.println("Window Information");
        System.out.println("---------------------");
        System.out.println("Height: "+height+",Width:"+width);
    }
}
