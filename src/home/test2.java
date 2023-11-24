package home;

// logo and loading, no border
public class test2 {
    // ANSI escape codes for text color
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public void logo(){
        String cstad =
                "   \t\t\t ______  ______   _________     _       ______\t \n" +
                        "\t\t\t .' ___  |.' ____ \\ |  _   _  |   / \\     |_   _ `.  \n" +
                        "\t\t\t/ .'   \\_|| (___ \\_||_/ | | \\_|  / _ \\      | | `. \\ \n" +
                        "\t\t\t| |        _.____`.     | |     / ___ \\     | |  | | \n" +
                        "\t\t\t\\ `.___.'\\| \\____) |   _| |_  _/ /   \\ \\_  _| |_.' / \n" +
                        "\t\t\t `.____ .' \\______.'  |_____||____| |____||______.'  \n" +
                        "\t\t\t                                                     \n"+
                        " ".repeat(23)+"CENTER OF SCIENCE TECHNOLOGY \t\t\t \n"+
                        " ".repeat(25)+"AND ADVANCED DEVELOPMENT \t\t\t\t "
                ;
        System.out.println(cstad+ANSI_BLUE);
    }
    public void loading(){
        int totalBlocks = 25;
        System.out.println();
        for (int i = 0; i <= 100; i+=5) {
            int blocksToShow = (i * totalBlocks) / 100;
            System.out.print(" ".repeat(15)+"Loading: " + i + "% " + getProgressBar(blocksToShow, totalBlocks) + "\r");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
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

    public void printColor(){
        System.out.println(ANSI_RED + "This is red text." + ANSI_RESET);
        System.out.println(ANSI_GREEN + "This is green text." + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "This is yellow text." + ANSI_RESET);
        System.out.println(ANSI_BLUE + "This is blue text." + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "This is purple text." + ANSI_RESET);
        System.out.println(ANSI_CYAN + "This is cyan text." + ANSI_RESET);
        System.out.println(ANSI_WHITE + "This is white text." + ANSI_RESET);
    }

    public static void main(String[] args) {
        test2 test2 = new test2();
        test2.logo();
        test2.loading();
        test2.printColor();
    }
}

