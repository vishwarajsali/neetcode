class Solution {

    public String encode(List<String> strs) {
          StringBuffer encodestr = new StringBuffer();
        for(String s : strs){
            encodestr.append(s.length()).append('/').append(s);
        }

        return encodestr.toString();
    }

    public List<String> decode(String str) {
        List<String> decodeList= new ArrayList<>();
        for(int i = 0; i < str.length();){
            int slash = str.indexOf('/', i);
            int size = Integer.valueOf(str.substring(i, slash));
            decodeList.add(str.substring(slash+1, slash+size+1));
            i = slash+size+1;
        }



        return decodeList;

    }
}
