class BeverageSales extends Beverage {

    public BeverageSales(String beverageType, String city, int totalSales) {
        super(beverageType, city, totalSales);
    }

    public void printReport() {
        System.out.println("______________________NUMBER J COFFEE HUT REPORT___________ ");
        System.out.println("Sales Report ");
        System.out.println("Beverage Type " + getBeverageType());
        System.out.println("City " + getCity());
        System.out.println("Total Sales R " + getTotalSales()); // Added 'R' assuming South African Rand based on the IIE logo
    }
}