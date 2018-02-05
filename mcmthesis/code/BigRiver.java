import java.util.Set;

/**
 * @author aolish333@gmail.com
 * @date 2018/1/31 20:52
 * User:Lee
 */
public class BigRiver {

    public BigRiver(){

    }

    public Set <Campsite> getCampsiteSet() {
        return campsiteSet;
    }

    public void setCampsiteSet(Set <Campsite> campsiteSet) {
        this.campsiteSet = campsiteSet;
    }

    public String getCampsiteNumber() {
        return campsiteNumber;
    }

    public void setCampsiteNumber(String campsiteNumber) {
        this.campsiteNumber = campsiteNumber;
    }

    public BigRiver(Set <Campsite> campsiteSet, String campsiteNumber) {
        this.campsiteSet = campsiteSet;
        this.campsiteNumber = campsiteNumber;
    }

    private Set <Campsite> campsiteSet;
    private String campsiteNumber;
}
