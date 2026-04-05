class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();


        for(String str : strs){
            sb.append(str.length()).append('/').append(str);
        }
        System.out.println(sb.toString());
        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();

        for(int i = 0; i< str.length();){

            int slash = str.indexOf('/', i);
            int length = Integer.valueOf(str.substring(i, slash)); 
            res.add(str.substring(slash+1, slash+length+1));

            i = slash + length +1;
        }

        return res;
    }
}
