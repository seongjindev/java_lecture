package InnerAnonymous;

public class InnerAnonymous {
    public static void main(String[] args){
        OuterClass oc = new OuterClass();
        System.out.println();
        OuterClass.InnerClass in = oc.new InnerClass();
        System.out.println();
        OuterClass.StaticInnerClass sic = new OuterClass.StaticInnerClass();
        System.out.println();

        new AnonymousClass(){
            @Override
            public void methodTest() {
                super.methodTest();
            }
        }.methodTest();

        new AnonymousClass(){
            @Override
            public void methodTest() {
                System.out.println("--Override methodTest--");
            }
        }.methodTest();

    }
}
