import java.util.Objects;

public class CellPhone {
    String vendor;
    String model;
    public CellPhone(String vendor, String model) {
        this.vendor = vendor;
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CellPhone cellPhone = (CellPhone) o;
        return vendor.equals(cellPhone.vendor) && model.equals(cellPhone.model);
//        return vendor == cellPhone.vendor && model == cellPhone.model;
//        return Objects.equals(vendor, cellPhone.vendor) &&
//                Objects.equals(model, cellPhone.model);
    }

    @Override
    public int hashCode() {
        return this.model.hashCode() + this.vendor.hashCode();
//        return Objects.hash(vendor + model);
    }
}
