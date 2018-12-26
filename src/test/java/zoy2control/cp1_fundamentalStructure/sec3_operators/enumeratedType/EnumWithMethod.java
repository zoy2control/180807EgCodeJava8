package zoy2control.cp1_fundamentalStructure.sec3_operators.enumeratedType;

/**
 * Created by zouzp on 2018/12/26.
 */
public enum EnumWithMethod {
    RED("红色",0),
    GREEN("绿色",1),
    BLUE("蓝色",2);

    private String color;
    private int index;

    EnumWithMethod(String color, int index) {
        this.color = color;
        this.index = index;
    }

    public String getColor() {
        return this.color;
    }

    public String getColorByIndex(int index) {
        for(EnumWithMethod item : EnumWithMethod.values()) {
            if(item.getIndex() == index) {

            }
        }
        return
    }

    public int getIndex() {
        return this.index;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
