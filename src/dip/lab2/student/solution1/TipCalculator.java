package dip.lab2.student.solution1;

public interface TipCalculator {
    enum ServiceQuality {
        GOOD, FAIR, POOR
    }

    double getTip();
    void setServiceRating(ServiceQuality q);
    ServiceQuality getServiceQuality();
}
