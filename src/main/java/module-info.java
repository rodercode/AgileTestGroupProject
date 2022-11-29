module com.example.agiletestgroupproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.agiletestgroupproject to javafx.fxml;
    exports com.example.agiletestgroupproject;
}