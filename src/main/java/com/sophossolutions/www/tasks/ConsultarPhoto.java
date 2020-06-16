package com.sophossolutions.www.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class ConsultarPhoto implements Task {

    private static final String TOKEN = "?access-token=uGrpK5sxmZJxm7JlOM1D8YXiV2-wTSGbo9b2";
    private String id;

    public ConsultarPhoto(String id) {
        this.id = id;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource(id.concat(TOKEN))
        );
    }

    public static ConsultarPhoto consultPhotoById(String id){
        return Tasks.instrumented(ConsultarPhoto.class, id);
    }
}
