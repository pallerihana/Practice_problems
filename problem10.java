public class problem10 {
    public static void main(String[] args) {
        int totalPopulation = 80000;

     
        double percentMen = 52.0;
        double percentLiterate = 48.0;
        double percentLiterateMen = 35.0;

        
        double totalMen = (percentMen / 100) * totalPopulation;
        double totalWomen = totalPopulation - totalMen;

        double totalLiteratePeople = (percentLiterate / 100) * totalPopulation;
        double totalLiterateMen = (percentLiterateMen / 100) * totalPopulation;

        double totalIlliterateMen = totalMen - totalLiterateMen;
        double totalIlliteratePeople = totalPopulation - totalLiteratePeople;
        double totalIlliterateWomen = totalIlliteratePeople - totalIlliterateMen;

        // Output
        System.out.println("Total illiterate men: " + (int)totalIlliterateMen);
        System.out.println("Total illiterate women: " + (int)totalIlliterateWomen);
    }
}
