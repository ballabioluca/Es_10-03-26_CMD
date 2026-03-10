import java.io.File;

public class Utils {

    public static class TimeoutException extends Exception {}

    //AI METHOD
    public static void checkComplexity(File folder, long startTime, long limitMs) throws TimeoutException {
        if (System.currentTimeMillis() - startTime > limitMs) {
            throw new TimeoutException();
        }

        File[] content = folder.listFiles(File::isDirectory);
        if (content == null) return;

        for (File subFolder : content) {
            checkComplexity(subFolder, startTime, limitMs);
        }
    }

    //AI METHOD
    public static void printTree(File folder, String prefix) {
        File[] content = folder.listFiles(File::isDirectory);
        if (content == null) return;

        for (int i = 0; i < content.length; i++) {
            boolean isLast = (i == content.length - 1);
            String connector = isLast ? "└── " : "├── ";
            System.out.println(prefix + connector + content[i].getName());
            String newPrefix = prefix + (isLast ? "    " : "│   ");
            printTree(content[i], newPrefix);
        }
    }
}