package Zadaca2;
import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
class Recnik {
    Map<String, String> recnik = new HashMap<String, String>();

    public void vnesi(){
        recnik.put("apple", "jabolko");
        recnik.put("pear", "krusha");
        recnik.put("watermelon", "lubenica");
        recnik.put("grape", "grozje");
        recnik.put("pineapple", "ananas");
    }

    public void prevediZbor(String zbor) {
        if (recnik.containsKey("melon")) {
            System.out.println(recnik.get("melon"));
        } else
            System.out.println("Takov zbor ne postoi");
    }
}
public class Glavna {
    public static void main(String[] args) {
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();

            Recnik r = new Recnik();
            r.vnesi();
            r.prevediZbor(s);
        }

        catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
