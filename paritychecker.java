
class ParityChecker {
    public static boolean hasEvenParity(String binary) {
        int count = 0;
        
        for (char bit : binary.toCharArray()) {
            if (bit == '1') {
                count++;
            }
        }
        return count % 2 == 0;
    }
    
    public static boolean hasOddParity(String binary) {
        return !hasEvenParity(binary);
    }
    
    public static char generateEvenParityBit(String binary) {
        return hasEvenParity(binary) ? '0' : '1';
    }
    
    public static char generateOddParityBit(String binary) {
        return hasEvenParity(binary) ? '1' : '0';
    }
    
    public static void main(String[] args) {
        // Example usage
        String[] testNumbers = {
            "1010",
            "1011",
            "1111",
            "1000"
        };
        
        for (String binary : testNumbers) {
            System.out.println("\nTesting binary number: " + binary);
            System.out.println("Even parity: " + hasEvenParity(binary));
            System.out.println("Odd parity: " + hasOddParity(binary));
            System.out.println("Even parity bit needed: " + generateEvenParityBit(binary));
            System.out.println("Odd parity bit needed: " + generateOddParityBit(binary));
        }
    }
}
