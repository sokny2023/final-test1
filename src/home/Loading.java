package home;

public class Loading {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static void main(String[] args) {
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
        System.out.println("\nLoading complete!");
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
}
