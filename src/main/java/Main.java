import java.util.List;

public class Main {

    public static void main(String[] args){
        List<Worker> workers = List.of(new Carpenter(), new Painter(), new Plumber());
        workers.stream().forEach(Worker::doWork);
    }

}
