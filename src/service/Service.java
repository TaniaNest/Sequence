package service;

import model.Model;

import java.util.ArrayList;
import java.util.List;

public class Service {

    private List<Integer> list = new ArrayList<Integer>();

    public List<Integer> getNumber(Model number) {
        int i=0;
        while (i*i < number.getNumber())
        {
            list.add(i);
            i++;
        }
        return list;
    }


}
