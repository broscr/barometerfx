package sample;

import java.io.Serializable;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RIDVAN AKTEPE on 19.12.2018.
 */
public class Meydanlar {

    private int istasyon_id;
    private String istasyon_name;
    private double istasyon_height;
    private double istasyon_gravity;
    private String istasyon_indic;

    public Meydanlar() {

    }

    public Meydanlar(int istasyon_id, String istasyon_name, double istasyon_height, double istasyon_gravity, String
            istasyon_indic) {
        this.istasyon_id = istasyon_id;
        this.istasyon_name = istasyon_name;
        this.istasyon_height = istasyon_height;
        this.istasyon_gravity = istasyon_gravity;
        this.istasyon_indic = istasyon_indic;
    }


    public int getIstasyon_id() {
        return istasyon_id;
    }

    public void setIstasyon_id(int istasyon_id) {
        this.istasyon_id = istasyon_id;
    }

    public String getIstasyon_name() {
        return istasyon_name;
    }

    public void setIstasyon_name(String istasyon_name) {
        this.istasyon_name = istasyon_name;
    }

    public double getIstasyon_height() {
        return istasyon_height;
    }

    public void setIstasyon_height(double istasyon_height) {
        this.istasyon_height = istasyon_height;
    }

    public double getIstasyon_gravity() {
        return istasyon_gravity;
    }

    public void setIstasyon_gravity(double istasyon_gravity) {
        this.istasyon_gravity = istasyon_gravity;
    }

    public String getIstasyon_indic() {
        return istasyon_indic;
    }

    public void setIstasyon_indic(String istasyon_indic) {
        this.istasyon_indic = istasyon_indic;
    }
}
