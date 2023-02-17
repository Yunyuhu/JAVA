public class Demo8 {
    //no8
    /*
    有一個二維陣列資料[{"張三","I09903001"},{"李四","I10903001"}]，使用for迴圈印出資料
	ex:
	張三
	I09903001
	李四
	I10903001
     */
    public static void main(String[] args){
        String[][] originlist={{"張三","I09903001"},{"李四","I10903001"}};
        for(int i=0;i<originlist.length;i++){
            for(int j=0;j<originlist[i].length;j++){
                System.out.println(originlist[i][j]);
            }
        }
}
}
