module com.example.mplayer {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.mplayer to javafx.fxml;
    exports com.example.mplayer;
    //remember to check this file when you try to find an import that doesn't exist.
}