package InterfaceExToy;

public class ToyMain {
    public static void main(String[] args){
        Toy car = new ToyCar();
        Toy train = new ToyTrain();
        Toy[] ty = new Toy[2];//데이터타입이 같으므로 배열에 넣을 수 있음
        ty[0] = car;
        ty[1] = train;

        car.run();
        car.stop();
        car.light();

        train.run();
        train.stop();
        train.light();

        for(int i = 0;i<ty.length;i++){
            ty[i].run();
            ty[i].stop();
            ty[i].light();
        }
    }
}
