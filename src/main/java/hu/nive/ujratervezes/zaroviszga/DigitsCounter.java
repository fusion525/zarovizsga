package hu.nive.ujratervezes.zaroviszga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DigitsCounter {

    public int getCountOfDigits(String s)
    {

        if (s == null || s.equals("")) {
            return 0;
        }

        int db = 0;

        List<Integer> numbers = new ArrayList<>();

        s.replaceAll("/^[a-zA-Z\\s]*$/", "");

        s.trim();

        char[] temp = s.toCharArray();

        for (int i = 0; i<temp.length; i++ )
        {
            Integer.parseInt(Character.toString(temp[i]));
        }

        Collections.sort(numbers);

        if (numbers.size()>1) {

            for (int i = 1; i <= numbers.size(); i++) {
                if (numbers.get(i) != numbers.get(i - 1)) {
                    db++;
                }
            }
        }else {
            return 1;
        }

        return db;
    }

}
