public class commandLineArgument {
    public static void main(String[] args) {
        // command Line Arguments
//        if(args.length!=0)
//        {
//            for(String str: args)
//            {
//                System.out.println(str);
//            }
//        }
//        else
//        {
//            System.out.println("No command Line argument passed");
//        }
        String [] argsh={"A","B","C"};
        args=argsh;// string array object assignment
        for(String s: args)
        {
            System.out.println(s);
        }
    }
}
