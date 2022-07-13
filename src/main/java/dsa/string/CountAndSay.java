package dsa.string;

public class CountAndSay {

    public static void main(String args[]) {

        //1
        //11
        //21
        //1211
        //112221
        int n = 5;

        if (n <= 0)
            return;

        String result = "1";
        int i = 1;

        while (i < n) {
            StringBuilder sb = new StringBuilder();
            int count = 1;
            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == result.charAt(j - 1)) {
                    count++;
                } else {
                    sb.append(count);
                    sb.append(result.charAt(j - 1));
                    count = 1;
                }
            }

            sb.append(count);
            sb.append(result.charAt(result.length() - 1));
            result = sb.toString();
            i++;
        }
        System.out.println("Output : " + result);
    }
}