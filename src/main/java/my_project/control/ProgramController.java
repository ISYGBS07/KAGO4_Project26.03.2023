package my_project.control;

import KAGO_framework.control.ViewController;
import my_project.Config;
import my_project.model.*;

import java.awt.event.KeyEvent;

/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern. Die updateProgram - Methode wird
 * mit jeder Frame im laufenden Programm aufgerufen.
 */
public class ProgramController {

    //Attribute


    // Referenzen
    private ViewController viewController;  // diese Referenz soll auf ein Objekt der Klasse viewController zeigen. Über dieses Objekt wird das Fenster gesteuert.

    private Apple apple02;
    private Apple apple03;
    private Apple apple04;
    private Apple apple05;

    private Pear pear01;
    private Pear pear02;
    private Pear pear03;
    private Pear pear04;
    private Pear pear05;

    private PowerApple Power01;

    private Player player01;
    private Player player02;

    private Lemon orange01;
    private Lemon orange02;
    private Lemon orange03;
    private Lemon orange04;
    private Lemon orange05;


    /**
     * Konstruktor
     * Dieser legt das Objekt der Klasse ProgramController an, das den Programmfluss steuert.
     * Damit der ProgramController auf das Fenster zugreifen kann, benötigt er eine Referenz auf das Objekt
     * der Klasse viewController. Diese wird als Parameter übergeben.
     * @param viewController das viewController-Objekt des Programms
     */
    public ProgramController(ViewController viewController){
        this.viewController = viewController;
    }

    /**
     * Diese Methode wird genau ein mal nach Programmstart aufgerufen.
     * Sie erstellt die leeren Datenstrukturen, zu Beginn nur eine Queue
     */
    public void startProgram() {
        Power01 = new PowerApple(100,100);
        viewController.draw(Power01);

        orange01 = new Lemon(Math.random()*(Config.WINDOW_WIDTH-50) + 50, Math.random()*(Config.WINDOW_HEIGHT-50) + 50);
        viewController.draw(orange01);
        orange02 = new Lemon(Math.random()*(Config.WINDOW_WIDTH-50) + 50, Math.random()*(Config.WINDOW_HEIGHT-50) + 50);
        viewController.draw(orange02);
        orange03 = new Lemon(Math.random()*(Config.WINDOW_WIDTH-50) + 50, Math.random()*(Config.WINDOW_HEIGHT-50) + 50);
        viewController.draw(orange03);
        orange04 = new Lemon(Math.random()*(Config.WINDOW_WIDTH-50) + 50, Math.random()*(Config.WINDOW_HEIGHT-50) + 50);
        viewController.draw(orange04);
        orange05 = new Lemon(Math.random()*(Config.WINDOW_WIDTH-50) + 50, Math.random()*(Config.WINDOW_HEIGHT-50) + 50);
        viewController.draw(orange05);


        apple02 = new Apple(Math.random()*(Config.WINDOW_WIDTH-50) + 50, Math.random()*(Config.WINDOW_HEIGHT-50) + 50);
        viewController.draw(apple02);
        apple03 = new Apple(Math.random()*(Config.WINDOW_WIDTH-50) + 50, Math.random()*(Config.WINDOW_HEIGHT-50) + 50);
        viewController.draw(apple03);
        apple04 = new Apple(Math.random()*(Config.WINDOW_WIDTH-50) + 50, Math.random()*(Config.WINDOW_HEIGHT-50) + 50);
        viewController.draw(apple04);
        apple05 = new Apple(Math.random()*(Config.WINDOW_WIDTH-50) + 50, Math.random()*(Config.WINDOW_HEIGHT-50) + 50);
        viewController.draw(apple05);


        pear01 = new Pear(Math.random()*(Config.WINDOW_WIDTH-50) + 50, Math.random()*(Config.WINDOW_HEIGHT-50) + 50);
        viewController.draw(pear01);
        pear02 = new Pear(Math.random()*(Config.WINDOW_WIDTH-50) + 50, Math.random()*(Config.WINDOW_HEIGHT-50) + 50);
        viewController.draw(pear02);
        pear03 = new Pear(Math.random()*(Config.WINDOW_WIDTH-50) + 50, Math.random()*(Config.WINDOW_HEIGHT-50) + 50);
        viewController.draw(pear03);
        pear04 = new Pear(Math.random()*(Config.WINDOW_WIDTH-50) + 50, Math.random()*(Config.WINDOW_HEIGHT-50) + 50);
        viewController.draw(pear04);
        pear05 = new Pear(Math.random()*(Config.WINDOW_WIDTH-50) + 50, Math.random()*(Config.WINDOW_HEIGHT-50) + 50);
        viewController.draw(pear05);

        player01 = new Player(50, Config.WINDOW_HEIGHT-100, KeyEvent.VK_A, KeyEvent.VK_D);
        viewController.draw(player01);
        viewController.register(player01);
        player02 = new Player(750, Config.WINDOW_HEIGHT-100, KeyEvent.VK_LEFT, KeyEvent.VK_RIGHT);
        viewController.draw(player02);
        viewController.register(player02);

    }

    /**
     * Aufruf mit jeder Frame
     * @param dt Zeit seit letzter Frame
     */
    public void updateProgram(double dt){
        //TODO 08 Nachdem Sie die TODOs 01-07 erledigt haben: Setzen Sie um, dass im Falle einer Kollision (siehe TODO 06 bzw. 07) zwischen dem Spieler und dem Apfel bzw. dem Spieler und der Birne, die jumpBack()-Methode von dem Apfel bzw. der Birne aufgerufen wird.
        //Weitere TODOs folgen und werden im Unterricht formuliert. Spätestens nach TODO 08 sollte der Aufbau des Projekts durchdacht werden.
        if(checkAndHandleCollision(orange01)){
            orange01.jumpBack();
        }
        if(checkAndHandleCollision(orange01)){
            orange01.jumpBack();
        }
        if(checkAndHandleCollision(orange02)){
            orange02.jumpBack();
        }
        if(checkAndHandleCollision(orange03)){
            orange03.jumpBack();
        }
        if(checkAndHandleCollision(orange04)){
            orange04.jumpBack();
        }
        if(checkAndHandleCollision(orange05)){
            orange05.jumpBack();
        }
        if(checkAndHandleCollision(apple02)){
            apple02.jumpBack();
        }
        if(checkAndHandleCollision(apple03)){
            apple03.jumpBack();
        }
        if(checkAndHandleCollision(apple04)){
            apple04.jumpBack();
        }
        if(checkAndHandleCollision(apple05)){
            apple05.jumpBack();
        }

        if(checkAndHandleCollision(pear01)){
            pear01.jumpBack();
        }
        if(checkAndHandleCollision(pear02)){
            pear02.jumpBack();
        }
        if(checkAndHandleCollision(pear03)){
            pear03.jumpBack();
        }
        if(checkAndHandleCollision(pear04)){
            pear04.jumpBack();
        }
        if(checkAndHandleCollision(pear05)){
            pear05.jumpBack();
        }
        if(checkAndHandleCollision2(orange01)){
            orange01.jumpBack();
        }
        if(checkAndHandleCollision2(orange02)){
            orange02.jumpBack();
        }
        if(checkAndHandleCollision2(orange03)){
            orange03.jumpBack();
        }
        if(checkAndHandleCollision2(orange04)){
            orange04.jumpBack();
        }
        if(checkAndHandleCollision2(orange05)){
            orange05.jumpBack();
        }
        if(checkAndHandleCollision2(apple02)){
            apple02.jumpBack();
        }
        if(checkAndHandleCollision2(apple03)){
            apple03.jumpBack();
        }
        if(checkAndHandleCollision2(apple04)){
            apple04.jumpBack();
        }
        if(checkAndHandleCollision2(apple05)){
            apple05.jumpBack();
        }

        if(checkAndHandleCollision2(pear01)){
            pear01.jumpBack();
        }
        if(checkAndHandleCollision2(pear02)){
            pear02.jumpBack();
        }
        if(checkAndHandleCollision2(pear03)){
            pear03.jumpBack();
        }
        if(checkAndHandleCollision2(pear04)){
            pear04.jumpBack();
        }
        if(checkAndHandleCollision2(pear05)){
            pear05.jumpBack();
        }

        if(checkAndHandleCollision(Power01)){
            Power01.jumpBack();
            player01.speedUp(Power01.getSpeedBuff()+ player01.getSpeed());
            player01.setTrueSpeedHIHI();
        }
        if(checkAndHandleCollision2(Power01)){
            Power01.jumpBack();
            player02.speedUp(Power01.getSpeedBuff()+ player02.getSpeed());
            player02.setTrueSpeedHIHI();
        }
        if(player01.getSpeedHIHI() == true){
            player01.setSpeedTimer(dt);
        }
        if(player01.getSpeedTimer() > 5){
            player01.speedUp(150);
            player01.setFalseSpeedHIHI();
            player01.resetSpeedTimer();

        }
        if(player02.getSpeedHIHI() == true){
            player02.setSpeedTimer(dt);
        }
        if(player02.getSpeedTimer() > 5){
            player02.speedUp(150);
            player02.setFalseSpeedHIHI();
            player02.resetSpeedTimer();

        }
    }
    private boolean checkAndHandleCollision(Apple a){

        return a.collidesWith(player01);
    }
    private boolean checkAndHandleCollision(Pear p){

        return p.collidesWith(player01);
    }

    private boolean checkAndHandleCollision(Lemon l){
        return l.collidesWith(player01);
    }
    //TODO 06 Fügen Sie eine Methode checkAndHandleCollision(Apple a) hinzu. Diese gibt true zurück, falls das Apple-Objekt mit dem Player-Objekt kollidiert. Nutzen Sie hierzu die collidesWith-Methode der Klasse GraphicalObject.

    //TODO 07 Fügen Sie eine Methode checkAndHandleCollision(Pear p) hinzu. Diese gibt true zurück, falls das Pear-Objekt mit dem Player-Objekt kollidiert. Nutzen Sie hierzu die collidesWith-Methode der Klasse GraphicalObject.

    private boolean checkAndHandleCollision2(Pear p2){
        return p2.collidesWith(player02);
    }
    private boolean checkAndHandleCollision2(Apple a2){
        return a2.collidesWith(player02);
    }

    private boolean checkAndHandleCollision2(Lemon l2){
        return l2.collidesWith(player02);
    }
}
