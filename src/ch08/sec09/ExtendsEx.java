package ch08.sec09;

public class ExtendsEx {
    public static void main(String[] args) {
        InterfaceCImpl impl = new InterfaceCImpl();

        InterfaceA ia = impl;
        ia.methodA();;
//        ia.methodB(); // 사용불가
        System.out.println();

        InterfaceB ib = impl;
//        ib.methodA();   // 사용불가
        ib.methodB();
        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
