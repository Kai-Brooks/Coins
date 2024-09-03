public class CoinCounter
{
    private int cents;
    public CoinCounter(int cents)
    {
        this.cents = cents;
    }

    public void CalculateCoins()
    {
        System.out.println(cents + " cents:");
        int q = cents / 25;
        cents -= q * 25;
        int d = cents / 10;
        cents -= d * 10;
        int n = cents / 5;
        cents -= n * 5;
        int p = cents;
        
        System.out.println("Quarter(s): " + q);

        System.out.println("Dimes(s): " + d);

        System.out.println("Nickel(s) " + n);

        System.out.println("Penny(s) " + p + "\n\n");

    }
}