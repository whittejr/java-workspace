package pacote2.exe1.dollar;

public class conversor
{
    public double cota;
    public double qtd;

    
    public double reais()
    {
        return cota * qtd;
    }

    public double taxa()
    {
        return reais() + ((reais() * 6.0) / 100);
    }
}
