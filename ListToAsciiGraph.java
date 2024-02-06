import java.util.Arrays;
public class ListToAsciiGraph {
    // converts a list of integers to a graph made with ASCII characters


    public void start() {
        // example with input [1, 2, 3, 4]
        /*
        System.out.println("+-----------+\n" +
                "|| || || ||\n" +
                "++ || || ||\n" +
                "   ++ || ||\n" +
                "      ++ ||\n" +
                "         ++\n");
        System.out.println(listToGraph(new int[]{1, 2, 3, 4}));*/
        System.out.println(betterGraph(new int[]{1, 2, 3, 4}));
    }

    public String numberToColum(int number) {
        //converts a number to a colum of || characters with ++ at the top
        StringBuilder result = new StringBuilder();
        result.append("|| ".repeat(Math.max(0, number)));
        result.append("++");
        return result.toString();
    }

    public String listToGraph(int[] list){
        //converts a list of integers to a graph made with ASCII characters
        String result = "";
        for (int j : list) {
            result += numberToColum(j) + "\n";
        }
        return result;
    }

    public String betterGraph(int[] list){
        //converts a list of integers to a graph made with ASCII characters
        StringBuilder result = new StringBuilder();
        //find the longest line
        int longestLine = 0;
        for (int value : list) {
            if (value > longestLine) {
                longestLine = value;
            }
        }

        for (int k = 0; k < longestLine + 1; k++) {
            for (int j : list) {
                try {
                    if (j > k) {
                        result.append("|| ");
                    } else if (j == k) {
                        result.append("++ ");
                    } else {
                        result.append("   ");
                    }
                } catch (Exception e) {
                    result.append("++ ");
                }

            }
        result.append("\n");
}
        return result.toString();
    }
    public static void main(String[] args) {
        ListToAsciiGraph listToAsciiGraph = new ListToAsciiGraph();
        listToAsciiGraph.start();
    }
}
