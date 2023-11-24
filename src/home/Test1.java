package home;

// logo border and loading
public class Test1 {
    public void logo(){
        String cstad =
                "   \t\t\t______  ______   _________     _       ______\t \n" +
                        "\t\t\t .' ___  |.' ____ \\ |  _   _  |   / \\     |_   _ `.  \n" +
                        "\t\t\t/ .'   \\_|| (___ \\_||_/ | | \\_|  / _ \\      | | `. \\ \n" +
                        "\t\t\t| |        _.____`.     | |     / ___ \\     | |  | | \n" +
                        "\t\t\t\\ `.___.'\\| \\____) |   _| |_  _/ /   \\ \\_  _| |_.' / \n" +
                        "\t\t\t `.____ .' \\______.'  |_____||____| |____||______.'  \n" +
                        "\t\t\t                                                     \n"+
                        " ".repeat(23)+"CENTER OF SCIENCE TECHNOLOGY \t\t\t \n"+
                        " ".repeat(25)+"AND ADVANCED DEVELOPMENT \t\t\t\t "
                ;

        System.out.print("╔" + "═".repeat(75) + "╗\n");
        System.out.print("║" + " ".repeat(75) + "║\n");

        // Split the ASCII art into lines and print each line within the border
        String[] lines = cstad.split("\n");
        for (String line : lines) {
            System.out.print("║" + line + " ".repeat(11) + "║\n");
        }
        System.out.print("║" + " ".repeat(75) + "║\n");
    }
    public static final String ANSI_GREEN = "\u001B[32m";
    public void loading(){
        int totalBlocks = 40;

        for (int i = 0; i <= 100; i+=2) {
            int blocksToShow = (i * totalBlocks) / 100;
            System.out.print("Loading: " + i + "% " + getProgressBar(blocksToShow, totalBlocks) + "\r");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("║" + " ".repeat(75) + "║\n");
        System.out.print("║" + " ".repeat(75) + "║\n");
        System.out.print("╚" + "═".repeat(75) + "╝\n");
    }
    private static String getProgressBar(int blocksToShow, int totalBlocks) {
        StringBuilder progressBar = new StringBuilder();
        for (int j = 0; j < blocksToShow; j++) {
            progressBar.append("█");
        }
        for (int k = 0; k < totalBlocks - blocksToShow; k++) {
            progressBar.append(" ");
        }
        return "[" + ANSI_GREEN + progressBar.toString() + "]";
    }
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.logo();
        test1.loading();
    }
}

