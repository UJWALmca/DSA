import java.util.LinkedList;
import java.util.Queue;

public class Queuee {

    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();

        que.add(3);

        que.add(31);
        que.add(311);
        que.add(3111);
        que.add(31111);

        System.out.println(que.remove());

        System.out.println(que.remove());

        System.out.println(que.remove());
        System.out.println(que.remove());
        System.out.println(que.remove());        
    }
    
}
