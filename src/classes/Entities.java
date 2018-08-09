package classes;

import java.awt.*;


public class Entities {
    private int hp;
    private Boolean alive;
    private Boolean movable;
    private Image photo;
    private int x;
    private int y;
    private int mx=20; // multiplier for special entities
    private int my=20;

    public Entities(){
    }

    public Entities(int hp, Boolean alive, Boolean movable, Image defaultPhoto, int x, int y, int mx , int my) {
        this.hp = hp;
        this.alive = alive;
        this.movable = movable;
        this.photo = defaultPhoto;
        this.x = x;
        this.y = y;
        this.mx = mx;
        this.my = my;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Boolean getAlive() {
        return alive;
    }

    public void setAlive(Boolean alive) {
        this.alive = alive;
    }

    public Boolean getMovable() {
        return movable;
    }

    public void setMovable(Boolean movable) {
        this.movable = movable;
    }

    public Image getPhoto() {
        return photo;
    }

    public void setPhoto(Image photo) {
        this.photo = photo;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getMx() {
        return mx;
    }

    public void setMx(int mx) {
        this.mx = mx;
    }

    public int getMy() {
        return my;
    }

    public void setMy(int my) {
        this.my = my;
    }

    //movement set for possible moving childs

    public void moveUp(){
        x-=mx;
    }

    public void moveDown(){
        x+=mx;
    }

    public void moveLeft(){
        y-=my;
    }

    public void moveRight(){
        y-=my;
    }


}
