public class CoinData {

    public int One_Pence;
    public int Two_Pence;
    public int Five_Pence;
    public int Ten_Pence;
    public int Twenty_Pence;
    public int Fifty_Pence;
    public int One_Pound;
    public int Two_Pound;

    public CoinData(int... enteredCoins) {
        One_Pence = enteredCoins[0];
        Two_Pence = enteredCoins[1];
        Five_Pence = enteredCoins[2];
        Ten_Pence = enteredCoins[3];
        Twenty_Pence = enteredCoins[4];
        Fifty_Pence = enteredCoins[5];
        One_Pound = enteredCoins[6];
        Two_Pound = enteredCoins[7];
    }
}
