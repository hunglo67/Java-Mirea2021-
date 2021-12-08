package Pr1516;

public class orderItem<AnyType>{
    private AnyType obj;
    public orderItem(AnyType obj) {
        this.obj = obj;
    }
    public AnyType getObj() {
        return obj;
    }
}