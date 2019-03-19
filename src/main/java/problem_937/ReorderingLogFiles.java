package problem_937;


import java.util.Map;
import java.util.TreeMap;

//Input: ["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
//        Output: ["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]
public class ReorderingLogFiles {
    public static void main(String[] args) {
//        ReorderingLogFiles r = new ReorderingLogFiles();
//        r.reorderLogFiles(new String[]{"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo"});
        TreeMap<String, Object> stringObjectTreeMap = new TreeMap<String, Object>();
        stringObjectTreeMap.put("a1", "a1");
        stringObjectTreeMap.put("ab1", "ab1");
        stringObjectTreeMap.put("b1", "b1");
        stringObjectTreeMap.put("z2", "z2");
        stringObjectTreeMap.put("z2e", "z2e");
        stringObjectTreeMap.put("a", "a");
        System.out.println(stringObjectTreeMap.containsKey("33"));
        for (Map.Entry<String, Object> me : stringObjectTreeMap.entrySet()) {
            System.out.println(me.getKey() + "   " + me.getValue());
        }


    }

    public String[] reorderLogFiles(String[] logs) {
        String[] a = logs[0].split(" ");
        String[] numeric = new String[logs.length];
        int l = 0;

        for (int i = 1; i < logs.length; i++) {
            String[] x = logs[i].split(" ");
            if (isNumeric(a[2]) && isNumeric(x[2])) {
                a = x;
                continue;
            } else if (isNumeric(a[2])) {
                numeric[l++] = logs[i];


            }

        }
        return logs;
    }

    public boolean isNumeric(String val) {
        try {
            long d = Integer.valueOf(val);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
