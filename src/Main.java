import java.util.*;

public class Main {
    private static Map<String, List<Integer>> randomMap;
    private static Map<String, Integer> resultMap;
    private static final int MAX_ELEMENT = 5;//максимальное количество элементов в мапе 
    public static void main(String[] args) {
        randomMap = new HashMap<>();
        resultMap = new HashMap<>();
        fillRandomMap();
        setResultMap();
        //проверяем resultMap
        System.out.println("Итоговая Мапа:");
        for (Map.Entry<String, Integer> entry :
                resultMap.entrySet()) {
            System.out.println("key - " + entry.getKey() + ", value - " + entry.getValue());
        }
    }

    private static void fillRandomMap() {
        System.out.println("check first twins");
        for (int i = 0; i < MAX_ELEMENT; i++) {
            List<Integer> list = getListForMap();
            randomMap.put("ключик" + i, list);
            System.out.println("key - ключик"+ i + ", value: " + Arrays.toString(list.toArray()));
        }
    }

    private static void setResultMap() {
        for (Map.Entry<String, List<Integer>> entry :
                randomMap.entrySet()) {
            resultMap.put(entry.getKey(), getSummaryList(entry.getValue()));
        }
    }

    private static List<Integer> getListForMap() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            list.add(random.nextInt(1000));
        }
        return list;
    }

    private static int getSummaryList(List<Integer> list) {
        int i = 0;
        for (Integer x :
                list) {
            i += x;
        }
        return i;
    }
    
    
}