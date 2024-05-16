module semestralka.semestralka {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires com.fasterxml.jackson.databind;
    requires java.logging;

    opens semestralka.semestralka.controller to javafx.fxml;
    opens semestralka.semestralka.model to com.fasterxml.jackson.databind;
    exports semestralka.semestralka.controller;
    exports semestralka.semestralka;
    exports semestralka.semestralka.model;
    opens semestralka.semestralka to javafx.fxml;
}
