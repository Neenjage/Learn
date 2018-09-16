public class AcompanyManTools implements ManToolsCompany {
    @Override
    public void salesManTools(String size) {
        System.out.println("为你提供尺寸为 " + size + " 的女模特");
    }

    @Override
    public void salesWomanTools(String length) {
        System.out.println("为你提供尺寸为 " + length + " 的男模特");
    }
}
