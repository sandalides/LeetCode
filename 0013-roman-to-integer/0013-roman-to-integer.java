class Solution {
    public static int romanToInt(String s) {
        final Map<Character,Integer> roman = new HashMap<>(){{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        int sum=0;
        for (int i=0;i<s.length();i++){
            if (roman.containsKey(s.charAt(i))){
                if (i != s.length() - 1 && roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))){
                    sum += roman.get(s.charAt(i + 1)) - roman.get(s.charAt(i));
                    i++;
                }else sum += roman.get(s.charAt(i));
            }else {
                System.out.println("Invalid roman numeric!");
                sum =0;
                break;
            }
        }
        return sum;
    }
}