package ro.ase.acs;

import java.io.Closeable;
import java.io.IOException;
import java.util.Scanner;

public class Reader implements Closeable{

private Scanner scanner = new Scanner(System.in);

public String read(){
    System.out.print("Message: ");
    String message=scanner.nextLine();
    return message;
}

@Override
    public void Close() throws IOException{
    scanner.close();
}
}