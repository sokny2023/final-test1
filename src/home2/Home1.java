package home2;

import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

public class Home1 {
    public static void main(String[] args) {
        String cstad =
                "   \t\t\t______  ______   _________     _       ______\n" +
                        "\t\t\t .' ___  |.' ____ \\ |  _   _  |   / \\     |_   _ `.  \n" +
                        "\t\t\t/ .'   \\_|| (___ \\_||_/ | | \\_|  / _ \\      | | `. \\ \n" +
                        "\t\t\t| |        _.____`.     | |     / ___ \\     | |  | | \n" +
                        "\t\t\t\\ `.___.'\\| \\____) |   _| |_  _/ /   \\ \\_  _| |_.' / \n" +
                        "\t\t\t `.____ .' \\______.'  |_____||____| |____||______.'  \n" +
                        "\t\t\t                                                     \n"+
                        " ".repeat(23)+"CENTER OF SCIENCE TECHNOLOGY \t\t\t"+" ".repeat(20)+"\n"+
                        " ".repeat(23)+"AND ADVANCED DEVELOPMENT \t\t\t"
                ;

        Table table = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.SURROUND);
        table.setColumnWidth(0, 50, 100);
        table.addCell(cstad);
        System.out.println(table.render());
    }
}
