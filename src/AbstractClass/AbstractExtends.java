package AbstractClass;

public class AbstractExtends extends AbstractClassEx{

    public AbstractExtends(){
        System.out.println("AbstractExtends");
    }
    public AbstractExtends(int c,int d){
        super(c,d);
    }
    @Override
    public void total() { //반드시 구현해야한다
        System.out.println("total");
    }
}
