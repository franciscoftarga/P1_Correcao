import java.util.ArrayList;

public class CadastroImoveis {
    private ArrayList<Imovel> listaImoveis = new ArrayList<>()  ;

    public void add(Imovel i){
        listaImoveis.add(i);
    }
    public String listar(){
        String imovelEncontrado = null;
        for(Imovel i : listaImoveis){
            imovelEncontrado = i.toString();
            System.out.println(imovelEncontrado);
        }
        return "";
    }

    public String listar(String nome){
        String imovelEncontrado = null;
        for(Imovel i : listaImoveis){
            if(i.getPoprietario().equals(nome)==true){
                imovelEncontrado = i.toString();
                System.out.println(imovelEncontrado);
            }
        }
        return "";
    }
}
