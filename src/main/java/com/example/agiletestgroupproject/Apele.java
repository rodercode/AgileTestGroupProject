package com.example.agiletestgroupproject;

    import javafx.scene.paint.Color;
    import javafx.scene.shape.Rectangle;

    import java.util.ArrayList;
    import java.util.List;
    import java.util.Random;

    public class Apele {
        private List<Apele> apeles;

        Random r =new Random();
        private double posX;
        private Rectangle rectangle;
        private double posY;
        private final double apelSize = 40;
        public Apele(double posX, double posY) {
            this.posX = posX;
            this.posY = posY;
            rectangle = new Rectangle(this.posX,this.posY,apelSize,apelSize);
            rectangle.setFill(Color.RED);
           r.nextDouble(2,3);
           apeles=new ArrayList<>();
        }

        public List<Apele> getApeles() {
            return apeles;
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
