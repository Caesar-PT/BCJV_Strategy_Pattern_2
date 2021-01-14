public class FOO extends StrategySolution{
    private int stage = 1;

    protected void start(){
        System.out.println("Start ");
    }

    protected void stop(){
        System.out.println("Stop");
    }

    protected boolean nextTry(){
        System.out.println("NextTry-" + stage++ + "  ");
        return true;
    }

    protected boolean isSolution(){
        System.out.println("IsSolution-" + (stage == 3) + "  ");
        return (stage == 3);
    }
}
