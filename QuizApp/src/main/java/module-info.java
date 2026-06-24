module com.kna.quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;

    opens com.kna.quizapp to javafx.fxml;
    exports com.kna.quizapp;
}
