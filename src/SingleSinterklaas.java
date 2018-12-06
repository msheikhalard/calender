
public class SingleSinterklaas {

    private static SingleSinterklaas instance = null;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private SingleSinterklaas(){

    }

    public static SingleSinterklaas getInstance(){
        if (instance == null) {
            instance = new SingleSinterklaas();
        }
        return instance;
    }
}

