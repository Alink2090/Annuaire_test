module type_0.entrainnement {
    requires javafx.controls;
    requires javafx.fxml;


    opens type_0.entrainnement to javafx.fxml;
    exports type_0.entrainnement;
}