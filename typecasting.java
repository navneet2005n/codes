// type conversion and casting:::
// type conversion of int to small datatype is valid  or any datatype which is larger in range can be converted 
// to any datatype which is samller in range...
    
class Type
{
    public static void main(String []args)
    {
        // Explicit conversion
        // float f=5.6f;
        // int x=(int)f;
        // System.out.println(f);
        // System.out.println(x);
        // System.out.println(f);
        // byte b=123;
        // int a=257;
        // b=a; // cannaot be done because byte has samller range than int...
        // a=b;
        // b=(byte)a; // here the range of byte is until 127 so this will do module opr here 257%256=1;
        // 256 is sum of range of byte (-128 to 127) sum is 256...
        // System.out.println(a);
        // System.out.println(b); 
        // but this case 
        // int v=33;
        // byte g=a; // will  give errror
        // TYPE PROMOTION ::: here in this example range of byte is not above 127 but product 
        // here has result of 300 that is way high than range... that is stored in int....
        // byte l=10;
        // byte o=30;
        // int result=l*o;
        // System.out.println(result);
    }
};
