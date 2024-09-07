public class BigNumber {
    // Create Parameters
    Long x;

    // Initialize the object
    public BigNumber(Long x){
        this.x = x;
    }

    // Create setter
    public void setBigNumber(Long x){
        this.x = x;
    }

    // create getter
    public Long getBigNumber(){
        return x;
    }

    // Add two number method
    public Long add(Long x){
        return this.x + x;
    }

}
