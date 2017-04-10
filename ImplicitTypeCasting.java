public class ImplicitTypeCasting
{
    public static void main(String[] args)
    {
        final boolean hello = true;

        char c = 'd';
        double d = 123.34D;
        float f = 234.12f;
        d = f;
        f = (float) d;

        byte b = 123;
        short s = 12345;
        int i = 456564;
        long l = 4567l;

        //variable <- variable assignment
        //variable <- expression containing only variables / expressions containing a mixture of variables and literals

        //double

        d = f;
        d = c;
        d = b;
        d = s;
        d = i; 
        d = l;

        //float
        f= d;
        f = c;
        f= b;
        f= s;
        f= i;
        f=l;

        //long
        l = f;
        l = d;
        l = b;
        l = s;
        l = i; 

        //int
        i = d;
        i = f;
        i = l;
        i = b;
        i = s;
        i = c;

        //char
        c = d;
        c = f;
        c = l;
        c = i;
        c = s;
        c = b;

        //short
        s = d;
        s = f;
        s = l;
        s = i;
        s = b;
        s = c;

        //byte 
        b = d;
        b = f;
        b = l;
        b = i;
        b = s;
        b = c;


        // variable <- literal assignment
        // variable <- expressions containing only literals    
        
        //int/char literals on the right hand side
        //byte: within range
        b = 123;
        b = -123;
        //byte: outside range
        b = 130;
        b = 'a';
        b = -130;

        //short: within range
        s = 12345;
        //short: outside range
        s = 80000;
        s = (char) 65000;

        //char: within range
        c = 123;
        //char: outside range
        c = -7;

    }
}