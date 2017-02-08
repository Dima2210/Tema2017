package MyRepository.Tema2016.Head;

import java.util.Date;


public class Task6SetTask {
    

    
    private long timeSetTask;


    public Task6SetTask(Date time) {
        // TODO Auto-generated constructor stub
        timeSetTask = time.getTime();
    }
    

    public Task6SetTask(){
        Date time = new Date();
        timeSetTask = time.getTime();
    }
    

    public long getTimeSetTask(){
        return timeSetTask;
    }

}
