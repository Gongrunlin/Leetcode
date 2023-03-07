package BinaryTree;

import java.util.*;

public class findMode501 {
    public int[] findMode(TreeNode root) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        get(root,map);
        int max = 0;
        Set<Map.Entry<Integer,Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (max < entry.getValue()){
                max = entry.getValue();
            }
        }
        List<Integer> list = new LinkedList<>();

        for (Map.Entry<Integer, Integer> entry : entries) {
            if (entry.getValue() == max){
                list.add(entry.getKey());
            }
        }

        int[] a = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a[i] = list.get(i);
        }
        return a;
    }
    public static void get(TreeNode root,TreeMap<Integer,Integer> result){
        if (root==null) return;
        if (result.containsKey(root.val)){
            result.put(root.val,result.get(root.val)+1);
        }else {
            result.put(root.val,1);
        }
        get(root.left,result);
        get(root.right,result);
    }
}
