import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = System.getProperty("user.home");
        File f = new File(path);
        File[] lista = f.listFiles();

        boolean exit = false;

        do {
            System.out.print(f.getAbsolutePath()+"> ");
            String cmd = sc.next();
            switch (cmd) {
                case "dir":
                    if(f.exists()) {
                        System.out.println("\n    Directory di " + f.getAbsolutePath() + "\n");
                        for (int i = 0; i < lista.length; i++) {
                            if (lista[i].isDirectory()) {
                                System.out.println(TimeConverter.converti(lista[i].lastModified()) + "  <DIR>  " + lista[i].getName());
                            } else {
                                System.out.println(TimeConverter.converti(lista[i].lastModified()) + "         " + lista[i].getName());
                            }
                        }
                    }else{
                        System.out.println("Empty path");
                    }
                    break;
                case "cd":

                    break;
                case "cd..":

                    break;
                case "exit":
                    exit = true;
                    break;
            }
        }while(!exit);


    }
}