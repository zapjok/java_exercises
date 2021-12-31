package shopshop;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StatOps {
    public int sumOfPaysInFile(String fileContent) {
        return fileContent.split(",F,").length;
    }
    public int firstTime(String item, String fileContent) {
        String[] purchases = fileContent.split(",F,");
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i].matches(".*\\W*" + item + ".*\\W*")) {
                return i+1;
            }
        }
        return 0;
    }
    public int lastTime(String item, String fileContent) {
        String[] purchases = fileContent.split(",F,");
        for (int i = purchases.length-1; i > 0; i--) {
            if (purchases[i].matches(".*\\W*" + item + "\\W*.*")) {
                return i+1;
            }
        }
        return 0;
    }
    public int countOfItem(String item, String fileContent) {
        int sumOfItem = 0;
        String[] purchases = fileContent.split(",F,");
        String[] contOfOnePurchase;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i].length() == 1 && purchases[i].equalsIgnoreCase(item)) {
                sumOfItem++;
            }
            else if (purchases[i].length() > 1){
                contOfOnePurchase = purchases[i].split(",");
                for (String actualItem : contOfOnePurchase) {
                    if (actualItem.equals(item)) {
                        sumOfItem++;
                    }
                }

            }
        }
        return sumOfItem;
    }
    public String getPurchase(int purchNum, String fileContent) {
        String[] purchases = fileContent.split(",F,");
        String[] contOfOnePurchase = purchases[purchNum-1].split(",");
        String returnString = new String();
        HashMap<String, Integer> itemsCount = new HashMap<>();
        for (String actualItem : contOfOnePurchase) {
            if (itemsCount.containsKey(actualItem)) {
                itemsCount.put(actualItem, itemsCount.get(actualItem) + 1);
                }
                else {
                    itemsCount.put(actualItem, 1);
                }
        }
        returnString = itemsCount.keySet().stream()
                .map(key -> key + ":" + itemsCount.get(key))
                .collect(Collectors.joining(", ", "{", "}"));
        return returnString;
    }

    public int calculate(int numberOfProducts) {
        switch(numberOfProducts) {
            case 1:
                return 500;
            case 2:
                return 950;
            case 3:
                return 1350;
        }
        return 1350 + ( 400 * (numberOfProducts-3));
    }

    public void sumAndToFile(String fileContent, String filePath) {
        String[] purchases = fileContent.split(",F,");
        HashMap<String, Integer> itemsCount = new HashMap<>();
        FileOps fileops = new FileOps();
        for (int i = 0; i < purchases.length; i++) {
            String[] itemsOfPurchase = purchases[i].split(",");
            for (int j = 0; j < itemsOfPurchase.length; j++) {
                if (itemsCount.containsKey(itemsOfPurchase[j])) {
                    itemsCount.put(itemsOfPurchase[j], itemsCount.get(itemsOfPurchase[j]) + 1);
                }
                else {
                    itemsCount.put(itemsOfPurchase[j], 1);
                }
            }
            int sum = 0;
            for (Map.Entry<String,Integer> entry : itemsCount.entrySet()) {
                sum += calculate(entry.getValue());
            }
            fileops.stringToFile((i+1) + ". purchase: " + sum,filePath);
            itemsCount.clear();
        }
    }
}
