import java.util.ArrayList;

public class Paragraph {
    private ArrayList<String> words;

    public Paragraph() {
        words = new ArrayList<>();
    }
    public void addWord(String word) {
        words.add(word);
    }
    public ArrayList<String> getWords() {
        return words;
    }
    public void print() {
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
}
