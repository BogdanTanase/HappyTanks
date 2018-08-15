package classes;

import java.awt.*;

public class Projectile extends Entities{
    int tx;
    int ty;
    int speed;

    public Projectile() {
    }

    public Projectile( Boolean alive, Boolean movable, Image defaultPhoto, int x, int y, int tx, int ty, int speed) {
        super(alive, movable, defaultPhoto, x, y);
        this.tx = tx;
        this.ty = ty;
        this.speed = speed;
    }

    public int getTx() {
        return tx;
    }

    public void setTx(int tx) {
        this.tx = tx;
    }

    public int getTy() {
        return ty;
    }

    public void setTy(int ty) {
        this.ty = ty;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void move(){
        x+=tx;
        y+=ty;
    }

    //draw
    void drawTank(Graphics g){
        g.drawImage(this.getPhoto(),x,y,null);
    }

}
