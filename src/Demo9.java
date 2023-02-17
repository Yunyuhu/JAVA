import java.util.*;

public class Demo9 {
    //no9
    /*
    有一段字串(張三,I09903001)使用陣列取得資料後存入Map資料，Key值分別為name、empID，並印出map裡面empID內容
	ex:
	I09903001
     */
    public static void main(String[] args){
        String originlist="張三,I09903001";
        String[] Newlist=originlist.split(",");
        System.out.println("============Starting Hashmap============");
        for(int i=0;i<Newlist.length;i++){
            System.out.println(Newlist[i]);
        }

        HashMap<String, String> maplist = new HashMap<String, String>();
        maplist.put("name", Newlist[0]);
        maplist.put("empID",Newlist[1]);
        System.out.println("============Ending Hashmap============");
        for (Map.Entry mapElement : maplist.entrySet()) {
            String key = (String)mapElement.getKey(); // Finding the value
            String value = (String)mapElement.getValue();
            if(key=="empID") System.out.println(value);
        }
        System.out.print(maplist);

    }
}
