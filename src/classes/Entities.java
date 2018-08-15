package classes;


import java.awt.*;


public class Entities {
     private Boolean alive;
     private Boolean movable;
     private Image photo;
     int x;
     int y;

     Entities(){
    }

    Entities(Boolean alive, Boolean movable, Image defaultPhoto, int x, int y) {
        this.alive = alive;
        this.movable = movable;
        this.photo = defaultPhoto;
        this.x = x;
        this.y = y;
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

    Image getPhoto() {
        return photo;
    }

    void setPhoto(Image photo) {
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

}
