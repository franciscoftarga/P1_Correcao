public class App {
    public static void main(String[] args) {
        CadastroImoveis cadastro = new CadastroImoveis();
        Geo geo = new Geo();
        Residencial residencial = new Residencial("Francisco", 1000, geo, 1000);
        Residencial residencial2 = new Residencial("João", 2000, geo, 1000);
        Residencial residencial3 = new Residencial("Francisco", 2000, geo, 3000);
        cadastro.add(residencial);
        cadastro.add(residencial2);
        cadastro.add(residencial3);
        System.out.println(cadastro.listar());
        System.out.println(cadastro.listar("Francisco"));
        System.out.println(residencial.calculaImposto());
        System.out.println(residencial2.calculaImposto());
    }
}
