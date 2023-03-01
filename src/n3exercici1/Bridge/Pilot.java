package n3exercici1.Bridge;

import n3exercici1.Classes.Order;

import java.util.ArrayList;
import java.util.List;

public class Pilot {

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        this.orderList.add(order);
    }

    public void placeOrder(){

        for(Order order : orderList){
            order.execute();
        }

        orderList.clear();

    }

}
