import java.util.Date;

public class StopWatch {
    Date startTime,endTime;
    public Date getStartTime(){
        return this.startTime;
    }
    public Date getEndTime(){
        return this.endTime;
    }
    public Date start(){
       this.startTime = new Date();
       return startTime;
    }
    public Date stop(){
        this.endTime = new Date();
        return endTime;
    }
    public long getElapsedTime(){
        return this.endTime.getTime() - this.startTime.getTime();
    }
}
