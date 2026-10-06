import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            ReadFile fileRes = new ReadFile("data/GettysburgAddress.txt");
            ArrayList<String> lines = fileRes.getLines();

            ArrayList<Paragraph> paragraphs = new ArrayList<>();
            Paragraph currentParagraph = new Paragraph();

            for (String line: lines) {
                if (line.trim().isEmpty()) {
                    if (!currentParagraph.getWords().isEmpty()) {
                        paragraphs.add(currentParagraph);
                        currentParagraph = new Paragraph();
                    }
                } else {
                    String[] words = line.trim().split("\\s+");

                    for (String word : words) {
                        currentParagraph.addWord(word);
                    }
                }
            }
            if (!currentParagraph.getWords().isEmpty()) {
                paragraphs.add(currentParagraph);
            }
            for (Paragraph paragraph : paragraphs) {
                paragraph.print();
                System.out.println();
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
