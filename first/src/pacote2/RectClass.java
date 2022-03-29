package pacote2;

public class RectClass
{
    public double width;
    public double height;

    
    
    public double area()
    {
        return width * height;
    }

    public double perimeter()
    {
        return 2 * (width + height);
    }

    public double diagonal()
    {
        return (width * width + height * height);
    }
}
