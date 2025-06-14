package video18;
// da el constructor parametrized
public class F {
    int x;
    int y;
    public F(int a , int b ) {
        x=a;
        y=b;
    }
    public static void main(String[] args) {
        F obj1 = new F(2,5);

        System.out.println(obj1.x + obj1.y);
    }
}