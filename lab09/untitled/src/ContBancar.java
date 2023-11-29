public class ContBancar {
    int sold;
    public void retrageNumerar(int ammount) throws SoldInsuficientException
    {
        if(this.sold < ammount)
        {
            throw new SoldInsuficientException("sarakie");
        }
        this.sold -= ammount;
    }
}
