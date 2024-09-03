public class Main
{
    public static void main(String[] args)
    {
        CoinCounter countOne = new CoinCounter(94);
        countOne.CalculateCoins();

        CoinCounter countTwo = new CoinCounter(59);
        countTwo.CalculateCoins();
        
        CoinCounter countThree = new CoinCounter(19);
        countThree.CalculateCoins();
    }
}