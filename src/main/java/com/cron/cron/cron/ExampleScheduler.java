package com.cron.cron.cron;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ExampleScheduler {

//      @Scheduled(cron = "@hourly") --> Otra forma de establecer la frecuencia de ejecución
// Esta tarea se ejecuta cada cierto tiempo sin importar si la tarea anterior termino o no
    @Scheduled(cron = "*/10 * * * * *")
    public void sheduleTaskUsingCronExpression(){

        String now = "Success Execute";
        System.out.println(
                "schedule tasks using cron jobs - "+ now
        );
    }

    //Para que se ejecute debe haber terminado la tarea anterior
    @Scheduled(fixedDelay = 3000)
    public void sheduleFixedDelayTask(){

        String now = "Success Execute";
        System.out.println(
                "Fixed delay task - "+ now
        );
    }

    @Scheduled(cron = "${cron.expression}")
    public void scheduleFixedDelayTaskWithString(){

        String now = "Success Execute";
        System.out.println(
                "Fixed delay task with string - "+ now
        );
    }


}
