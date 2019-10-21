import java.util.HashMap;

class Problem2Dp{
    static HashMap<Integer,Integer> hash=new HashMap<>();
    public static void main(String[] args) {
        System.out.println(numOfWays("12",0));
    }
    public static int numOfWays(String data,int start){
        if(hash.containsKey(start)){
            return hash.get(start);
        }
        if(start>=data.length()){
            hash.put(start,1);
            return 1;
        }
        if(data.charAt(start)=='0'){
            hash.put(start, 0);
            return 0;
        }
        else{
            int answer=0;
            if(data.charAt(start)=='1'){
                answer= numOfWays(data, start+1)+numOfWays(data, start+2);
            }
            else if(data.charAt(start)=='2'){
                try{
                    if(data.charAt(start+1)<='6'){
                        answer= numOfWays(data, start+1)+numOfWays(data, start+2);
                    }else{
                        answer= numOfWays(data, start+1);
                    }

                }catch(Exception e){
                    answer= numOfWays(data, start+1);
                }
            }else{
                answer=numOfWays(data, start+1);
            }
            hash.put(start, answer);
            return answer;
        }
    }
}