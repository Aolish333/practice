/**
 * @author aolish333@gmail.com
 * @date 2018/1/31 20:49
 * User:Lee 
 */
public class Campsite {
    public int getCampsiteNo() {
        return campsiteNo;
    }

    public void setCampsiteNo(int campsiteNo) {
        this.campsiteNo = campsiteNo;
    }



    public void setBeLiveNumber(int beLiveNumber) {
        this.beLiveNumber = beLiveNumber;
    }

    public Boolean getLive() {
        return isLive;
    }

    public void setLive(Boolean live) {
        isLive = live;
    }

    public Campsite(int campsiteNo, int beLiveNumber, Boolean isLive) {
        this.campsiteNo = campsiteNo;
        this.beLiveNumber = beLiveNumber;
        this.isLive = isLive;
    }

    private int campsiteNo;

    public int getBeLiveNumber() {
        return beLiveNumber;
    }

    private int beLiveNumber;
    private Boolean isLive;
}
