public class Door {
    private int height;
    private int width;
    public Door(int height,int width)
    {
        this.height=height;
        this.width=width;
    }

    public void display(){
        System.out.println("Door Information");
        System.out.println("---------------------");
        System.out.println("Height: "+height+",Width:"+width);
    }
}
