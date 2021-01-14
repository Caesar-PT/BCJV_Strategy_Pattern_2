public class BAR extends StrategySearch{
    private int stage = 1;

    @Override
    void preProcess() {
        System.out.println("PreProcess ");
    }

    @Override
    boolean search() {
        System.out.println("Search " + stage++ + "  ");
        return stage == 3 ? true : false;
    }

    @Override
    void postProcess() {
        System.out.println("PostProcess");
    }
}
