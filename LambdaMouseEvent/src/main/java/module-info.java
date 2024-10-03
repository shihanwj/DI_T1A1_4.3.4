module es.ieslosmontecillos.lambdamouseevent {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.lambdamouseevent to javafx.fxml;
    exports es.ieslosmontecillos.lambdamouseevent;
}