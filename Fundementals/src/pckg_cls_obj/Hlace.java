package pckg_cls_obj;

public class Hlace {

    private String model;

    public boolean ciste;

    public Hlace(String model){
        this.model = model;
        this,ciste = true;
    }

    public void koristeneHlace(){
        this.ciste = false;
    }

    public Hlace nekakoOcistene (Student student){
        return student.operiMe(this);
    }

    public boolean isCiste() {
        return ciste;
    }

    public void setCiste(boolean ciste) {
        this.ciste = ciste;
    }
}
