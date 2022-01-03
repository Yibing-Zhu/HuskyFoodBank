package Business.WorkQueue;

/**
 * @author ZhengFang
 */

public class FundingtoVolunteerWorkRequest extends WorkRequest{
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }
}
