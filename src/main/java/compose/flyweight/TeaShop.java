package compose.flyweight;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

public class TeaShop {

    private BlackTeaMaker maker = new BlackTeaMaker();

    private Queue<Pair<Integer, BlackTea>> order = new LinkedList<>();

    public String order(String params, int table){
        order.offer(new Pair<>(table, maker.maker(params)));
        return "Ordered " + params + "to table " + table;
    }

    public Pair<Integer, BlackTea> serveNext(){
        return order.poll();
    }


}
