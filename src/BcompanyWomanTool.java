public class BcompanyWomanTool implements ManToolsCompany{
    @Override
    public void salesManTools(String length) {
        System.out.println("我们为你提供身高为 " + length +  " 的男模特");
    }

    @Override
    public void salesWomanTools(String length) {
        System.out.println("我们为你提供身高为 " + length + " 的女模特");

    }
}
