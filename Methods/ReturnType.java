package Methods;

public class ReturnType {
    public static void main(String[] args) {
        ReturnType obj = new ReturnType();
        obj.Calculate(4, 6);
    }
    public int Calculate(int x, int y){
        int z = x * y;
        System.out.println(z);
        return z;
    }
}
