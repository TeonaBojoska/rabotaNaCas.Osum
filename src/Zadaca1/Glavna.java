package Zadaca1;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Glavna {
    public static void main(String[] args) {
        Map<String, String> recnik = new HashMap<String, String>();
        recnik.put("cat", "macka");
        recnik.put("dog", "kuche");
        recnik.put("hamster", "hrcak");
        recnik.put("eagle", "orel");
        recnik.put("bird", "ptica");

        System.out.println("Pechatenje na klucevi: " + recnik.keySet());
        System.out.println("Pecatenje na vrednosti: " + recnik.values());

        for (Map.Entry<String, String> m : recnik.entrySet()) {
            System.out.println(m.getKey());
        }
            if (recnik.containsKey("hi"))
                System.out.println("Prevodot za toj zbor e: "+recnik.get("hi"));
            else
                System.out.println("Ne postoi toj zbor ");
        }
    }


