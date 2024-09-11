public class Substring {
    public static String sUbstring(String num,int i,int j)
    {
        String sub="";
        for(int k=i;k<j;k++ ){
          sub+=num.charAt(k);
        }
        return sub;
    }
    public static void main(String arrgs[])
    {
        String name="nav ane eth";
        System.out.println(sUbstring(name,2,name.length()));
    }
}
