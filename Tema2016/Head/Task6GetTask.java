package MyRepository.Tema2016.Head;

import java.util.Date;

public class Task6GetTask {
    

    private long timeGetTask;

    public Task6GetTask(Date time) {
        // TODO Auto-generated constructor stub
        timeGetTask = time.getTime();
    }

    public Task6GetTask() {
        // TODO Auto-generated constructor stub
        Date time = new Date();
        timeGetTask = time.getTime();
    }

    public long getTimeGetTask(){
        return timeGetTask;
        
    }
    
    
    

}
