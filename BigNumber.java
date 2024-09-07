public class BigNumber {
    Long x;

    public BigNumber(Long x){
        this.x = x;
    }

    public void setBigNumber(Long x){
        this.x = x;
    }

    public Long getBigNumber(){
        return x;
    }

    public Long add(Long x){
        return this.x + x;
    }

}
