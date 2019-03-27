/*
Implement an algorithm to determine if a string has all unique characters What if you can not use additional data structures?
*/ 


class Unique_string{
    public static void main(String args[]) {
        int bit_index = 0;
        String str = "qwertyuiopasdfghjklzxcvbnmg";
        char reference = 'a';
        boolean answer = true;
        for(char c : str.toCharArray()) {
            System.out.println(c-reference);
            int newIndex = c-reference;
            if ((bit_index & (1<<newIndex)) == 0) {
                bit_index = bit_index | (1<<newIndex) ;
            }
            else{
                answer = false;
                break;
            }
        }
        System.out.println(answer);
    }
}