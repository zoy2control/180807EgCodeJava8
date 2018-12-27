package zoy2control.cp1_fundamentalStructure.sec3_operators.enumeratedType;

import org.junit.Test;

/**
 * ·像个 普通的class一样，有CV、V
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
               return item.getColor();
            }
        }
        return null;
    }

    public int getIndex() {
        return this.index;
    }

    /* ·setter*/
    public void setColor(String color) {
        this.color = color;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * ·重写toString()方法
     * @return
     */
    @Override
    public String toString() {
        return index + "--" + color;
    }

    /* ·psvm可以执行，而 @Test不行。？？？原因：*/
    @Test
    public void testEnumWithMethod() {
        EnumWithMethod red = EnumWithMethod.RED;
        System.out.println(red.toString());
    }

    public static void main(String[] args) {
        EnumWithMethod red = EnumWithMethod.RED;
        System.out.println(red.toString());
    }
}
