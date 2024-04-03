package Presenter;

import View.View;

import Model.SumModel;

public class Presenter {
    View view;
    SumModel model;

    public Presenter(SumModel m, View v) {
        model = m;
        view = v;
    }

    public void buttonClick() {
        Double a = (double) view.getValue("a: ");
        Double b = (double) view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        Double result = model.result();
        view.print(result, "Sum: ");
    }
}
