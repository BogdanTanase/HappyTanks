package classes;

import java.awt.*;

public class Entities {
    private int hp;
    private Boolean alive;
    private Boolean movable;
    private Image defaultPhoto;

    public Entities() {

    }

    public Entities(int hp, Boolean alive, Boolean movable, Image defaultPhoto) {
        this.hp = hp;
        this.alive = alive;
        this.movable = movable;
        this.defaultPhoto = defaultPhoto;
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

    public Image getDefaultPhoto() {
        return defaultPhoto;
    }

    public void setDefaultPhoto(Image defaultPhoto) {
        this.defaultPhoto = defaultPhoto;
    }

    
}
