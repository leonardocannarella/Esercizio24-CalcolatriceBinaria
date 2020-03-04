import static java.lang.Integer.parseInt;
import static java.lang.Integer.sum;

public class CalcolatriceBinaria
{
    private String numeroBinario1;
    private String numeroBinario2;

    public CalcolatriceBinaria(String numeroBinario1, String numeroBinario2) throws IllegalArgumentException
    {
        try
        {
            if(parseInt(numeroBinario1)<0 || parseInt(numeroBinario2)<0)
            {
                throw new IllegalArgumentException();
            }
            else if(parseInt(numeroBinario1) < parseInt(numeroBinario2))
            {
                throw new SecondBiggerThanFirstException();
            }
            setNumeroBinario1(numeroBinario1);
            setNumeroBinario2(numeroBinario2);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("I numeri non possono essere minori di 0!");
        }
        catch(SecondBiggerThanFirstException e)
        {
            System.out.println("Il secondo numero non può essere più grande del primo!");
        }
    }

    public String getNumeroBinario1() {
        return numeroBinario1;
    }

    public void setNumeroBinario1(String numeroBinario1) {
        this.numeroBinario1 = numeroBinario1;
    }

    public String getNumeroBinario2() {
        return numeroBinario2;
    }

    public void setNumeroBinario2(String numeroBinario2) {
        this.numeroBinario2 = numeroBinario2;
    }

    public String somma()
    {
        int numero0 = Integer.parseInt(numeroBinario1, 2);
        int numero1 = Integer.parseInt(numeroBinario2, 2);
        int somma = numero0+numero1;
        return "La somma è: " + Integer.toBinaryString(somma);
    }

    public String differenza()
    {
        int numero0 = Integer.parseInt(numeroBinario1, 2);
        int numero1 = Integer.parseInt(numeroBinario2, 2);
        int differenza = numero0-numero1;
        return "La differenza è: " + Integer.toBinaryString(differenza);
    }
}
