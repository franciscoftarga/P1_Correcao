public abstract class Imovel {
    private String proprietario;
    private int areaConstruida;
    private Geo geo;
    private static double Vr = 1;

    public Imovel(){}

    public Imovel(String p, int a, Geo g){
        this.proprietario = p;
        this.areaConstruida = a;
        this.geo = g;
    }
    public String getPoprietario(){
        return proprietario;
    }
    public int getAreaConstruida(){
        return areaConstruida;
    }
    public double getVr(){
        return Vr;
    }
    public abstract double calculaImposto();
    public String toString(){
        return "Proprietário: " + proprietario + "\nÁrea construída: " + areaConstruida + "\nGeolocalização: " + geo.toString();
    }
}