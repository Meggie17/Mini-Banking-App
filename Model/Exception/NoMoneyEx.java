package Model.Exception;

public class NoMoneyEx extends Exception{
    private String infoMo;

    public void setInfoMo(String infoMo) {
        this.infoMo = infoMo;
    }

    public String getInfoMo(){
        return infoMo;

    }
}
