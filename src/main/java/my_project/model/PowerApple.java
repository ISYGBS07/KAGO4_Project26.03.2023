package my_project.model;

import KAGO_framework.view.DrawTool;

import java.awt.*;

public class PowerApple extends Apple{
        private double speedBuff;
    public PowerApple(double x,double y){
        super(x,y);

    }

    public void draw(DrawTool drawTool) {

        drawTool.setCurrentColor(new Color(255, 246, 103));
        drawTool.drawFilledCircle(x,y,radius);
        drawTool.setCurrentColor(0,0,0,255);
        drawTool.drawCircle(x,y,radius);
        drawTool.setCurrentColor(new Color(68, 31, 2));
        drawTool.drawFilledRectangle(x - 5, y - 45, 10,20);
    }

    public void update(){

    }

    public double getSpeedBuff(){
        this.speedBuff = Math.random()*100+100;
        return speedBuff;
    }
}
