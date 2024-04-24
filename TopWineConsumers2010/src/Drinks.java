public class Drinks implements Comparable<Drinks> {
    private String country;
    private Integer beerServings;
    private Integer spiritServings;
    private Integer wineServings;
    private Double totalLitresOfPureAlcohol;

    public Drinks(String country, Integer beerServings, Integer spiritServings, Integer wineServings,
            Double totalLitresOfPureAlcohol) {
        this.country = country;
        this.beerServings = beerServings;
        this.spiritServings = spiritServings;
        this.wineServings = wineServings;
        this.totalLitresOfPureAlcohol = totalLitresOfPureAlcohol;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getBeerServings() {
        return beerServings;
    }

    public void setBeerServings(Integer beerServings) {
        this.beerServings = beerServings;
    }

    public Integer getSpiritServings() {
        return spiritServings;
    }

    public void setSpiritServings(Integer spiritServings) {
        this.spiritServings = spiritServings;
    }

    public Integer getWineServings() {
        return wineServings;
    }

    public void setWineServings(Integer wineServings) {
        this.wineServings = wineServings;
    }

    public Double getTotalLitresOfPureAlcohol() {
        return totalLitresOfPureAlcohol;
    }

    public void setTotalLitresOfPureAlcohol(Double totalLitresOfPureAlcohol) {
        this.totalLitresOfPureAlcohol = totalLitresOfPureAlcohol;
    }

    @Override
    public String toString() {
        return "Países que mais consome vinho: " + country + "\n" + "Quantidade: " + wineServings;
    }

    @Override
    public int compareTo(Drinks other) {
        return this.wineServings.compareTo(other.wineServings);
    }

}
