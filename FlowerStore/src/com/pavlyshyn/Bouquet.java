package com.pavlyshyn;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private List<Flower> flowers = new  ArrayList<Flower>();

    public List<Flower> getFlowers() {
        return flowers;
    }
    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }
    void addFlower(Flower flower){
        flowers.add(flower);
    }
    void sort(){
        flowers.sort((a,b)->{
            int compare = a.getLength().compareTo(b.getLength());
            if(compare == 0){
                return 0;
            }
            if(compare>0){
                return 1;
            }
            return -1;
        });
    }
    @Override
    public String toString() {
        return "Bouquet{" +
                "flowers=" + flowers +
                '}';
    }
}
