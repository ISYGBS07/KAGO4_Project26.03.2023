package my_project.model;


import KAGO_framework.view.DrawTool;

import java.awt.*;


public class Lemon extends Apple{

    public Lemon(double x, double y){
        super(x,y);
    }
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(255, 246, 103, 255));
        drawTool.drawFilledCircle(x, y, radius);
        drawTool.setCurrentColor(0, 0, 0, 255);
        drawTool.drawCircle(x, y, radius);
    }
}
