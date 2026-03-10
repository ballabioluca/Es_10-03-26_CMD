import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File f = new File("X:\\Users\\BALLABIO.LUCA");
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
                                System.out.println(lista[i].lastModified() + "  <DIR>  " + lista[i].getName());
                            } else {
                                System.out.println(lista[i].lastModified() + "         " + lista[i].getName());
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