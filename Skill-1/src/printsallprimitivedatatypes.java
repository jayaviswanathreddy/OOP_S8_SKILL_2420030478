public class printsallprimitivedatatypes {
    public static void main(String[] args) {
        byte age = 21;                       
        short currentYear = 2025;            
        int population = 1400000000;       
        long distanceToMoon = 384400000L;    
        float pi = 3.14159f;                 
        double gravity = 9.80665;            
        char grade = 'A';                    
        boolean isJavaFun = true;            

        System.out.println("Age (byte): " + age);
        System.out.println("Current Year (short): " + currentYear);
        System.out.println("Population (int): " + population);
        System.out.println("Distance to Moon in meters (long): " + distanceToMoon);
        System.out.println("Value of Pi (float): " + pi);
        System.out.println("Gravity (double): " + gravity);
        System.out.println("Student's Grade (char): " + grade);
        System.out.println("Is Java fun to learn? (boolean): " + isJavaFun);
    }
}