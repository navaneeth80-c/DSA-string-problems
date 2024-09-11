public class StringShortestPath {
    public static void path(String arrgs)
    {
        int x=0,y=0,x1=0,y1=0;

        for(int i=0;i<arrgs.length();i++)
        {
            if(arrgs.charAt(i)=='N')
            {
                y1++;
            }else if(arrgs.charAt(i)=='S'){
                y1--;
            }else if(arrgs.charAt(i)=='W')
            {
                x1--;
            }else{
                x1++;
            }

        }
        int ans=(int)Math.sqrt(Math.pow((x1-x),2)+Math.pow((y1-y),2));
        System.out.println(ans);
    }
    public static void main(String[] arrgs)
    {
        String direction="WNEENESENNN";
        path(direction);
    }
}
