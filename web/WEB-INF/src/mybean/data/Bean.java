package mybean.data;

/**
 * Created by lei02 on 2019/4/9.
 */
public class Bean {
    private double firstItem;   //数列首项
    private double var;         //公差或公比
    private int number;         //求和项数
    private double sum;         //求和结果
    private String name;        //数列类型

    public Bean(){
        name = "";
    }

    public double getFirstItem() {
        return firstItem;
    }

    public void setFirstItem(double firstItem) {
        this.firstItem = firstItem;
    }

    public double getVar() {
        return var;
    }

    public void setVar(double var) {
        this.var = var;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
