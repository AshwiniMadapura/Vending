public enum Coin {
    One_Pence(1),Two_Pence(2),Five_Pence(5),Ten_Pence(10),Twenty_Pence(20),
    Fifty_Cents(50),One_Pound(100),Two_Pound(200);

    private int value;

    private Coin(int value){
        this.value=value;
    }

    public int getValue() {
        return this.value;
    }
}
