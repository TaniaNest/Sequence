package controller;

import model.Model;
import service.Service;
import util.Info;
import util.Input;
import util.Instruction;
import util.Validator;

public class Controller {

    private Input input = new Input();
    private Info info = new Info();
    private Service service = new Service();
    private Instruction instruction=new Instruction();
    private Validator validator=new Validator();

    public int getNumber() {
        info.getInfo();
        int number = input.getNumber();
        while (!validator.isPositiveNumber(number)) {
            instruction.getInstruction();
            number = new Input().getNumber();
        }
        return number;
    }


    public void sequenceOfNumber() {
        String sign="";
        Model number=new Model(getNumber());
        for (int num:service.getNumber(number)) {
            info.getSequence(sign,num);
            sign=",";

        }
    }

}
