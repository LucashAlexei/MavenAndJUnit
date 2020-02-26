import java.util.Collection;

public class Main {

    public int x=20, y;

    public int sum(int x, int y){
        return (x+y);
    }
    public String reverseStr(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
    public boolean checkType(){
        Integer x2 = new Integer(x);
        return (x2 instanceof Integer);
    }
    public int checkByNull(int y){
        return y;
    }
    public int checkException(int x, int y){
        return x/y;
    }
}
