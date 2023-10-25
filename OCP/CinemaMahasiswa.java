public class CinemaMahasiswa extends Cinema {
    public CinemaMahasiswa (double price) {
        this.price = price;
    }
    @Override
    Double calculateAdminFee() {
        return price * 5 / 100;
    }
}
