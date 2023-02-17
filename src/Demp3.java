public class Demp3 {
    //no3
    /*
    有一段字串( 張三 I09903001 )印出，去空白文字
	ex:
	張三I09903001
	*/
    public static void main(String[] args) {
        String oriList=" 張三 I09903001 ";
        //ver1
        for(String s:oriList.split(" ",3)){
            System.out.print(s);
        }
        System.out.println();
        //ver2
        System.out.print(oriList.replaceAll(" ",""));
    }
}
