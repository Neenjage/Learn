public class Client {
    public static void main(String[] args){
        AcompanyManTools acompanyManTools = new AcompanyManTools();
        BcompanyWomanTool bcompanyWomanTool = new BcompanyWomanTool();
        Lison lison1 = new Lison(acompanyManTools);
        Lison lison2 = new Lison(bcompanyWomanTool);
        lison1.salesManTools("D");
        lison2.salesWomanTools("178");

    }
}
