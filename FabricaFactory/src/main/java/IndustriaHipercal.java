public class IndustriaHipercal extends IndustriaMateriaPrima {
    public IndustriaHipercal(String uf, String descricao) {
        this.uf = uf;
        this.descricao = descricao;
        System.out.println("Pedido de" + descricao +
                " cadastrado na Industria Hipercal\nRegião de entrega:" +
                uf + "\n");
    }
}
