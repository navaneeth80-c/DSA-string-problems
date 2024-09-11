public class LargestString {
    public static String Largest(String s[])
    {
        String largest=s[0];
        for(int i=0;i<s.length;i++)             //if greater it returns +ve value if //
                                                // its smaller returns -ve value if its
                //.compareToIgnoreCase to ignore the case of the letter.                                //equal it return 0.
        {
            if(largest.compareTo(s[i])<0){
                largest=s[i];
            }
        }

    return largest;
    }


    public static void main(String arrgs[])
    {
       String Fruits[]={"banana","zzi","zzx","mango","zibra","zooba"};

        System.out.println(Largest(Fruits));

    }

}
