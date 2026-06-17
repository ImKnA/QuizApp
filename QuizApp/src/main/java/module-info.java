module com.kna.quizapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.kna.quizapp to javafx.fxml;
    exports com.kna.quizapp;
}
