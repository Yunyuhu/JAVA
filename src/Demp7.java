public class Demp7 {
    //no7
    /*
    有一段字串(張三,I09903001)判斷內容是否有I09903001
     */

    public static void main(String[] args){
        String orinlist="張三,I09903001";
        //match完全匹配,ver01
        //https://www.runoob.com/java/java-string-matches.html
        System.out.println(orinlist.matches("(.*)I09903001(.*)"));

        //contains包含,ver02
        //https://www.runoob.com/java/java-string-contains.html
        System.out.println(orinlist.contains("I09903001"));
    }
}
