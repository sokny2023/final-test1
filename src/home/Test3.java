package home;

// logo border loading and color
public class Test3 {
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
                "\t\t\t    ______  ______   _________     _       ______  \t \n" +
                        "\t\t\t .' ___  |.' ____ \\ |  _   _  |   / \\     |_   _ `.  \n" +
                        "\t\t\t/ .'   \\_|| (___ \\_||_/ | | \\_|  / _ \\      | | `. \\ \n" +
                        "\t\t\t| |        _.____`.     | |     / ___ \\     | |  | | \n" +
                        "\t\t\t\\ `.___.'\\| \\____) |   _| |_  _/ /   \\ \\_  _| |_.' / \n" +
                        "\t\t\t `.____ .' \\______.'  |_____||____| |____||______.'  \n" +
                        "\t\t\t                                                     \n" +ANSI_CYAN+
                        " ".repeat(23) + "CENTER OF SCIENCE TECHNOLOGY"+ANSI_BLUE+" \t\t\t \n"+
                        " ".repeat(25)+ANSI_CYAN + "AND ADVANCED DEVELOPMENT"+" \t\t\t\t "+ANSI_BLUE;

        System.out.print(ANSI_BLUE+"╔" + "═".repeat(75) + "╗\n"+ANSI_RESET);

        // Split the ASCII art into lines and print each line within the border
        String[] lines = cstad.split("\n");
        for (String line : lines) {
            System.out.print(ANSI_BLUE+"║" + line + " ".repeat(11) + "║\n"+ANSI_RESET);
        }
        System.out.print(ANSI_BLUE+"╚" + "═".repeat(75) + "╝"+ANSI_RESET);
    }

    public void loading() throws InterruptedException {
        int totalBlocks = 30;
        System.out.println();
        for (int i = 0; i <= 100; i+=3) {
            int blocksToShow = (i * totalBlocks) / 100;
            System.out.print(" ".repeat(15)+"Loading: " + i + "% " + getProgressBar(blocksToShow, totalBlocks) + "\r");
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Thread.sleep(1000);
        System.out.println(ANSI_PURPLE+" ".repeat(20)+"Welcome to inventory management system\n".toUpperCase()+ANSI_RESET);
        Thread.sleep(2000);
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

    public static void main(String[] args) throws InterruptedException {
        Test3 test3 = new Test3();
        test3.logo();
        test3.loading();
    }
}

