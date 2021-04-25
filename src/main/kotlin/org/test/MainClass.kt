package org.test

import javafx.application.Application
import javafx.application.Application.launch
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

class MainClass: Application() {
    override fun start(primaryStage: Stage?) {
        val root: Parent = FXMLLoader.load(javaClass.getResource("scene.fxml"))
        val scene = Scene(root)

        primaryStage?.title = "JavaFX and Gradle"
        primaryStage?.scene = scene
        primaryStage?.show()
    }
}

fun main(args: Array<String>) {
    launch()
}