public class Main{

    //fn to compare 2 strings
    public static boolean comparestr(String str1, String str2){
        return str1.equals(str2);
    }

    //fn to copy a string
    public static String copystr(String org){
        return new String(org);
    }

    //fn to concatenate
    public static String concstr(String str1,String str2) {
        return str1 + str2;
    }


    public static void main (String[] args){
        //examples
        String str1="Hello";
        String str2="hello";
        System.out.println("string A: "+str1+"\nstring B: "+str2);
        System.out.println("are both the strings equal?: "+comparestr(str1,str2));

        System.out.println("\n");

        String org="copy me";
        System.out.println("original string: "+org);
        System.out.println("copied string: "+copystr(org));

        System.out.println("\n");

        String a="hello ";
        String b="world";
        System.out.println("String A: "+a+"\nString B: "+b);
        System.out.println("concatenated strings: "+concstr(a,b));
    }
}

//string A: Hello
//string B: hello
//are both the strings equal?: false
//
//
//original string: copy me
//copied string: copy me
//
//
//String A: hello
//String B: world
//concatenated strings: hello world
//
//Process finished with exit code 0