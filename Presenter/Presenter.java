package Presenter;

import View.View;
import Logging.Log;
import Logging.Logtxt;
import Model.SumModel;
import Model.Divide;
import Model.Multiply;

public class Presenter {
    View view;
    SumModel model;

    public Presenter(SumModel m, View v) {
        model = m;
        view = v;
    }

    // public void buttonClick() {
    // Double a = (double) view.getValue("a: ");
    // Double b = (double) view.getValue("b: ");
    // model.setX(a);
    // model.setY(b);
    // Double result = model.result();
    // view.print(result, "Sum: ");
    // }

    /**
     * Метод, объединяющий получений значений, выбор операции, результат и
     * логирование
     */
    public void runOperation() {
        Log log = new Logtxt();
        String txt = "";
        // Double x = view.getValue.apply("Введите первое число: ");
        // Double y = view.inputDouble.apply("Введите второе число: ");
        Double x = (double) view.getValue("Введите первое число: ");
        Double y = (double) view.getValue("Введите второе число: ");
        int choice = view.getChoice();
        switch (choice) {
            case 1: {
                SumModel model = new SumModel();
                model.setX(x);
                model.setY(y);
                Double res = model.result();
                txt = log.getExpression(x, y, res, choice);
                System.out.println(res);
                break;
            }
            case 2: {
                Multiply model = new Multiply();
                model.setX(x);
                model.setY(y);
                Double res = model.result();
                txt = log.getExpression(x, y, res, choice);
                System.out.println(res);
                break;
            }
            case 3: {
                Divide model = new Divide();
                model.setX(x);
                model.setY(y);
                Double res = model.result();
                txt = log.getExpression(x, y, res, choice);
                System.out.println(res);
                break;
            }
        }
        log.writeFile(txt, "Saving.txt");
    }

}
