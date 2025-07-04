package com.example.serenityrest.tasks;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.serenitybdd.screenplay.Tasks;

public class PerformLogin implements Task {

    private final String username;
    private final String password;

    public PerformLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static PerformLogin withCredentials(String username, String password) {
        return Tasks.instrumented(PerformLogin.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String endpoint = "/alfresco/api/-default-/public/authentication/versions/1/tickets";
        String body = String.format("{\"userId\": \"%s\", \"password\": \"%s\"}", username, password);

        actor.attemptsTo(
                Post.to(endpoint)
                        .with(request -> request
                                .header("Content-Type", "application/json")
                                .body(body)
                        )
        );

        SerenityRest.lastResponse().prettyPrint();
    }
}
