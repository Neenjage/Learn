public class Lison implements ManToolsCompany {
    private AcompanyManTools acompanyManTools;
    private BcompanyWomanTool bcompanyWomanTool;

    public Lison(AcompanyManTools acompanyManTools) {
        this.acompanyManTools = acompanyManTools;
    }

    public Lison(BcompanyWomanTool bcompanyWomanToola) {
        this.bcompanyWomanTool = bcompanyWomanToola;
    }

    @Override
    public void salesManTools(String size) {
        dobefore();
        acompanyManTools.salesManTools(size);
        doafter();
    }

    @Override
    public void salesWomanTools(String length) {
        dobefore();
        bcompanyWomanTool.salesWomanTools(length);
        doafter();
    }

    public void dobefore(){
        System.out.println("我们为你提供精美设计服务！");
    }

    public void doafter(){
        System.out.println("我们为你提供一条龙服务！");
    }
}
