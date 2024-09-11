public class StringCompression {
    public static String compressor(String str)
    {
        //aaabbbcccddd
        StringBuilder str2= new StringBuilder(" ");
        for(int i=0;i<str.length();i++)
        {
            Integer count=1;

                while (i<str.length()-1&&str.charAt(i) == str.charAt(1+i)) {
                    count++;
                    i++;
                }

            str2.append(str.charAt(i));
            if(count!=1){
            str2.append( count);}

        }
        return str2.toString();
    }
    public static String compress2(String str){
        StringBuilder newstring= new StringBuilder(" ");
        for(int i=0;i<str.length();i++)
        {
            int count=1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            newstring.append(str.charAt(i));
            if(count!=1) {
                newstring.append(count);
            }
        }
        return newstring.toString();
    }
    public static void main(String[] arrgs)
    {
        String str="aabbccdde";
        System.out.println(compress2(str));
    }
}
