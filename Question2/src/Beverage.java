abstract class Beverage implements IBeverage {
    private final String beverageType;
    private final String city;
    private final int totalSales;


  Beverage(String beverageType, String city, int totalSales) {
        this.beverageType = beverageType;
        this.city = city;
        this.totalSales = totalSales;
    }

    // Implementing methods from the IBeverage interface
    @Override
    public String getBeverageType() {
        return beverageType;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }
}



