package Array_exercise;

public class back844 {
    public static void main(String[] args) {
        String a = "abcd##";
        String b = build(a);
        System.out.println(b);

    }
    public static String build(String str){
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != '#'){
                buffer.append(str.charAt(i));
            }else{
                buffer.deleteCharAt(buffer.length()-1);
            }
        }
        return buffer.toString();
    }


}
