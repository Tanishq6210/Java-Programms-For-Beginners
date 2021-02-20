package typeCasting;

public class TypeCastingAndConversion {

	public static void main(String[] args) {
		float a= 20.89f;
		int b = (int)a;//manual type casting(When moving against the sequence)
		System.out.println(b);
        System.out.println(a);
        
        int c =10;
        float d= c;//automatic type casting (when moving in the sequence)
        System.out.println(c);
        System.out.println(d);
	}

}
