public class Residencial extends Imovel {
    private int areaTerreno;
    
    public Residencial(String pr, int ar, Geo gr, int t){
        super(pr,ar,gr);
        this.areaTerreno = t;
    }
    public double calculaImposto(){
        double imposto = 0;
        if(getAreaConstruida()<=200){
            imposto = 0;
        }
        if(getAreaConstruida()>200){
            imposto = (getAreaConstruida()-200)*(getVr());
        }
        if(areaTerreno>1000){
            imposto = imposto + (100*getVr());
        }
        return imposto;
    }
}
