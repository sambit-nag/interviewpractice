package algorithms.recursions;

public class AtoiRec {

    public static void main(String[] args) {

        String abc="123";
        int length=abc.length()-1;
        char[] digits=abc.toCharArray();


        System.out.println(atoiRec(digits,length));

    }

    private static int atoiRec(char[] digits,int length) {


        if(length==0){
            return digits[0];
        }
        return atoiRec(digits,length-1) *10 +digits[digits.length-length];
    }
}
