package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Double> list;
    public Calculator() {
        list = new ArrayList<>();
    }

    public List<Double> getList() {
        return list;
    }

    public void setList(List<Double> list) {
        this.list = list;
    }
    public void removeFirstIndex(){
        list.remove(0);
    }
    public void addList(Double value){
        list.add(value);
    }
    public void viewResults(){
        System.out.println(list);
    }
}