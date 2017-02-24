package utng.edu.mx.ordersrea.model;

/**
 * Created by Martha on 23/02/2017.
 */
public class Cardbox {
    private String idCardbox;
    private String name;
    private int difficulty;

    public Cardbox(String idCardbox, String name, int difficulty) {
        this.idCardbox = idCardbox;
        this.name = name;
        this.difficulty = difficulty;
    }

    public Cardbox(){
        this("","",0);
    }

    public String getIdCardbox() {
        return idCardbox;
    }

    public void setIdCardbox(String idCardbox) {
        this.idCardbox = idCardbox;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return "Cardbox{" +
                "idCardbox='" + idCardbox + '\'' +
                ", name='" + name + '\'' +
                ", difficulty=" + difficulty +
                '}';
    }
}
