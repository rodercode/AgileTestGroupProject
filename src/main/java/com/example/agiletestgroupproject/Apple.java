package com.example.agiletestgroupproject;

    import javafx.scene.paint.Color;
    import javafx.scene.shape.Rectangle;

    import java.util.ArrayList;
    import java.util.List;
    import java.util.Random;

    public class Apple {

        Random r =new Random();
        private double posX;
        private double posY;
        private Rectangle rectangle;

        private final double apelSize = 40;
        public Apple(double posX, double posY) {
            this.posX = posX;
            this.posY = posY;
            rectangle = new Rectangle(this.posX,this.posY,apelSize,apelSize);
            rectangle.setFill(Color.RED);
           r.nextDouble(2,3);
        }


        public Random getR() {
            return r;
        }

        public double getPosX() {
            return posX;
        }

        public Rectangle getRectangle() {
            return rectangle;
        }

        public double getPosY() {
            return posY;
        }

        public double getApelSize() {
            return apelSize;
        }
    }
