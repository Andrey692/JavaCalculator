package main;

import View.View;

import Model.SumModel;
import Presenter.Presenter;

public class Program {

    public static void main(String[] args) {
        var m = new SumModel();
        var v = new View();
        Presenter p = new Presenter(m, v); // тоже что и: Presenter p = new Presenter(new SumModel(), new View())
        p.buttonClick();

    }
}
