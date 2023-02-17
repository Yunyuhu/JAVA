public class Demo2 {
    //no2
    /*
    有一段字串(張三,I09903001)使用逗號分割取得陣列，並使用for迴圈印出
	ex:
	張三
	I09903001
	*/
        public static void main(String[] args) {
        String oriList="張三,I09903001";
            for(String s:oriList.split(",",2)){
            System.out.println(s);
            }
        }
}
