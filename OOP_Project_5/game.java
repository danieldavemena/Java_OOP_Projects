import java.nio.file.*;

public class game {
    Path wordslist = Paths
            .get("/home/daniel/Documents/03_programming_projects/Java_OOP_Projects/OOP_Project_5/words.txt");

    startGame() {
        return wordslist.toString();
    }
}
