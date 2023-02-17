public class Demo45 {
    //n04
    /*
    有一段字串(張三,I09903001)使用String語法取得I的相對字元位置
	ex:
	4
    */
    public static void main(String[] args) {
        //https://www.runoob.com/java/java-string-substring.html
        //.substring(起始,結束)
        String oriList="張三,I09903001";
        int num=oriList.indexOf('I');
        System.out.println(num);
        //no5(接續no4)
        /*
        繼第四題取得I的字元位置印出員工編號I09903001
        */
        System.out.print("員工編號:"+oriList.substring(num));
    }
}
