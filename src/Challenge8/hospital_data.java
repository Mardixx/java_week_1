public class hospital_data {
    private String date;
    private String cardiologyCount;
    private String radiologyCount;
    private String visitingCount;

    public hospital_data(String date, String cardiologyCount, String radiologyCount, String visitingCount) {
        this.date = date;
        this.cardiologyCount = cardiologyCount;
        this.radiologyCount = radiologyCount;
        this.visitingCount = visitingCount;
    }

    public String getDate() {
        return date;
    }
    public void setDate() {
        this.date = date;
    }

    public String getcCount() {
        return cardiologyCount;
    }
    public void setcCount() {
        this.cardiologyCount = cardiologyCount;
    }

    public String getrCount() {
        return radiologyCount;
    }
    public void setCount() {
        this.radiologyCount = radiologyCount;
    }

    public String getvCount() {
        return visitingCount;
    }
    public void setvCount() {
        this.visitingCount = visitingCount;
    }
}