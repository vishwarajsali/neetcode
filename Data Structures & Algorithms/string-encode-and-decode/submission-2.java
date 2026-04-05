class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();

        for(String str : strs){
            sb.append(str.length())
            .append('#')
            .append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {

        List<String> res = new ArrayList<>();

        for(int i = 0; i<str.length(); ){
            int index = str.indexOf('#', i);
            int length = Integer.valueOf(str.substring(i, index));

            res.add(str.substring(index+1, index+length+1));
            i = index + length +1;
        }

        return res;
    }
}
