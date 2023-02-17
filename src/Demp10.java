
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Demp10 {
    //no10
    /*
    10.繼第八題使用list儲存map資料，並使用迴圈印出所有map資料
	ex:
	{empID=I09903001, name=張三}
	{empID=I10903001, name=李四}
     */
    public static void main(String[] args){
        String[][] originlist={{"張三","I09903001"},{"李四","I10903001"}};
        hmap(originlist);
        mapp(originlist);
    }
    public static void hmap(String[][] originlist){
        System.out.println("============Starting Hashmap============");
        //HashMap是一種資料型態,ver1
        ArrayList<HashMap> empArraylist= new ArrayList<HashMap>();
        //String是一種資料型態,ver2
        //ArrayList<String> empArraylist= new ArrayList<String>();

        HashMap<String, String> maplist= new HashMap<String, String>();
        for(int i=0;i<originlist.length;i++){
            maplist = new HashMap<String, String>();
            maplist.put("name",originlist[i][0]);
            maplist.put("empID",originlist[i][1]);
            //ver1
            empArraylist.add(maplist);
            //ver2
            //empArraylist.add(maplist.toString());
        }
        //System.out.print(empArraylist);
        //array跟string不同處！語法要看一下
        for(int j=0;j<empArraylist.size();j++){
            System.out.println(empArraylist.get(j));
        }
        System.out.println("============Ending Hashmap============");
    }
    public static void mapp(String[][] originlist){
        //ver3
        System.out.println("============Starting Map============");
        //定義list
        List<Map<String,String>> list=new ArrayList<Map<String,String>>();
        Map<String,String> map;
        for(int i=0;i<originlist.length;i++){
            map=new HashMap<String,String>();
            map.put("name",originlist[i][0]);
            map.put("empID",originlist[i][1]);
            list.add(map);
        }
        for(int j=0;j<list.size();j++){
            System.out.println(list.get(j));
        }
        System.out.println("============Ending Map============");
    }
}
