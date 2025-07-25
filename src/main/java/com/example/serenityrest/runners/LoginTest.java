// src/test/java/com/example/serenityrest/runners/LoginTest.java

package com.example.serenityrest.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features",
        glue = "com.example.serenityrest.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class LoginTest {
}
