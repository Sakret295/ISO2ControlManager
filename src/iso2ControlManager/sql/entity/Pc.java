package iso2ControlManager.sql.entity;

public class Pc {
    private int id;
    private String ip;

    //---------------------------------------------------
    public Pc() {
    }

    //---------------------------------------------------
    public Pc(String ip) {
        this.ip = ip;
    }

    //---------------------------------------------------
    public Pc(int id, String ip) {
        this.id = id;
        this.ip = ip;
    }

    //-------------Getter and Setter---------------------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
