class Solution {
    public int countSeniors(String[] details) {
       int count = 0;
        for(String detail : details) {
            if(detail.charAt(11)>='6') {
                int age = Integer.parseInt(detail.substring(11, 13));
                if (age > 60) {
                    count++;
                }
            }
        }

        return  count;
    }
}