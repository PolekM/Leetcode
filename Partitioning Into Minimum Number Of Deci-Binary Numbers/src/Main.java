public class Main {
    public static void main(String[] args) {
        minPartitions("32");
    }

    public static int minPartitions(String n) {
        char max = '0';
        char current;
        for (int i = 0;i<n.length();i++){
            current = n.charAt(i);
            if(max<current){
                max = current;
            }
        }
        return Character.getNumericValue(max);
    }

}
