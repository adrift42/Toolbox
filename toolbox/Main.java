public class Main {

    private String systemOS;
    private Boolean debug = true;

    public Main() {

        if (debug) {
            //checking that the correct OS is being obtained
            System.out.println(System.getProperty("os.name"));
        }

        //using this so that this app will be cross platform
        if (System.getProperty("os.name").contains("Windows")) {
            systemOS = "windows";
        } else {
            systemOS = "invalid";
        }

        if (debug) {
            //confirming os is being picked up correctly
            System.out.println("OS: " + systemOS);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

    }

}