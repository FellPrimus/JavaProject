
public class Calculator {

    
    public static byte galoisMult(byte a, byte b) {
        int p = 0;
        int hiBitSet = 0;
        for (int i = 0; i < 8; ++i) {
            if ((b & 1) == 1)
                p ^= a;
            hiBitSet = a & 0x80;
            a <<= 1;
            if (hiBitSet == 0x80)
                a ^= 0x1b;
            b >>= 1;
        }
        return (byte) (p % 256);
    }
    
    public static byte add(byte a, byte b) {
        return (byte) (a ^ b);
    }
    
    public static byte galoisAdd(byte a, byte b) {
    	int p = 0;
        int hiBitSet = 0;
        for (int i = 0; i < 8; ++i) {
            if ((b & 1) == 1)
                p ^= a;
            hiBitSet = a & 0x80;
            a <<= 1;
            if (hiBitSet == 0x80)
                a ^= 0x1b;
            b >>= 1;
        }
        return (byte) (p % 256);
    }
    

}
