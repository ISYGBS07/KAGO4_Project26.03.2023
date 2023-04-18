package my_project.model;


import KAGO_framework.view.DrawTool;
import my_project.Config;

import java.awt.*;

public class Apple extends Fruit {

    //Attribute


    public Apple(double x, double y) {
        super(x, y);
        radius = 30;
    }

    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(169, 0, 0, 229));
        drawTool.drawFilledCircle(x, y, radius);
        drawTool.setCurrentColor(0, 0, 0, 255);
        drawTool.drawCircle(x, y, radius);

        drawTool.setCurrentColor(new Color(0, 255, 73));
        drawTool.formatText("Arial", 1, 25);
        drawTool.drawText(50, 80, "score :");


    }

    @Override
    public void update(double dt) {
        super.update(dt);
    }

    public void jumpBack() {
        this.y = 30;
        this.x = Math.random() * (1000 - radius * 2) + radius;
    }
}
