import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VampireDigits {
    public int digitLength;
    private ArrayList<int[]> digitPairs;
    public VampireDigits(int digitLength) {
        if (isLengthDigitOk(digitLength)) {
            this.digitLength = digitLength;
            this.digitPairs = computeDigitPairs();
        }
    }
    private boolean isLengthDigitOk(int digit) {
        if (digit % 2 != 0) {
            print("Could not create class object cause of ...");
            print("the digitLength parameter must be integer type && an even number");
            print("You have provided " + digit);
            return false;
        }
        return true;
    }
    public ArrayList<int[]> computeDigitPairs() {
        ArrayList<int[]> array = new ArrayList<>();
        long maxValue = 1;
        for (int i = 0; i < digitLength; i++) {
            maxValue *= 10;
        }
//        print(maxValue);
        long minValue = 1;
        for (int i = 0; i < digitLength-1; i++) {
            minValue *= 10;
        }
//        print(minValue);
        int multiplierLength = (int) (digitLength / 2);
//        print(multiplierLength);
        // main logic for loop (iterator)
        for (long i = minValue; i < maxValue; i++) {
            List<String> lst = generateCombinations(String.valueOf(i), multiplierLength);

            int[] tempArray = new int[lst.size()];
            int indx = 0;
            for (String elem: lst) {
                if (elem.length() == multiplierLength) {
                    tempArray[indx] = Integer.valueOf(elem);
                    indx++;
                }
            }
            for (int j = 0; j < tempArray.length; j++) {
                for (int k = j+1; k < tempArray.length; k++) {
                    int x = tempArray[j];
                    int y = tempArray[k];
                    if ((x != y) && ((int) i == x * y) && (isSubstrings(x, y, (int) i))) {
                        array.add(new int[] {(int) i, x, y});
                    }
                }
            }
        }
        return array;
    }
    public ArrayList<int[]> getDigitPairs() {
        return this.digitPairs;
    }
    public void printDigitPairs() {
        for (int[] pair: this.digitPairs) {
            int digit = pair[0];
            int fstMultiplier = pair[1];
            int sndMultiplier = pair[2];
            print(digit + " = " + fstMultiplier + " * " + sndMultiplier);
        }
    }
    public void print(Object obj) {
        System.out.println(obj);
    }
    public List<String> generateCombinations(String number, int maxLength) {
        List<String> temp = new ArrayList<>();
        for (int i = 0; i < number.length(); i++) {
            temp.add(Character.toString(number.charAt(i)));
        }
        List<String> out = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            String tempStr = new String();
            Collections.shuffle(temp);
            for (int j = 0; j < maxLength; j++) {
                tempStr += temp.get(j);
            }
            if (out.contains(tempStr)) {
                continue;
            } else {
                out.add(tempStr);
            }
        }
        return out;
    }

    private boolean isSubstrings(int x, int y, int z) {
        String xStr = String.valueOf(x);
        String yStr = String.valueOf(y);
        String xyStr = xStr.concat(yStr);
        String zStr = String.valueOf(z);
        for (int i = 0; i < xyStr.length(); i++) {
            zStr = zStr.replaceFirst(Character.toString(xyStr.charAt(i)), " ");
        }
//        print("full digit remains = " + zStr);
        if (zStr.strip().length() > 0) {
            return false;
        }
        return true;
    }
}
