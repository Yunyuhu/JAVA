public class Demo1 {
    //no1
    /*
    有一段字串(張三I09903001)使用String語法只印出員工編號
    ex:I09903001
    */
    public static void main(String[] args) {
        String oriList="張三I09903001";
        //https://www.runoob.com/java/java-string-substring.html
        //.substring(起始,結束)
        System.out.print("員工編號:"+oriList.substring(2));
    }
}
