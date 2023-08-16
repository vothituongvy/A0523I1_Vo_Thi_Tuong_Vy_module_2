package ss4_lop_va_doi_tuong_trong_java;

import java.lang.reflect.Array;
import java.time.Instant;

public class StopWatch {
    private long startTime,endTime;

    public StopWatch() {
        //Lấy thời gian hiện tại dưới dạng số mili giây
        startTime= Instant.now().toEpochMilli();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start(){
        startTime=Instant.now().toEpochMilli();
    }
    public void stop(){
        endTime=Instant.now().toEpochMilli();
    }
    public long getElapsedTime(){
        if(endTime==0){
            return 0;
        }
        return endTime-startTime;
    }

    public static void main(String[] args) {
        StopWatch result=new StopWatch();
        result.start();
        result.stop();
        System.out.println("Thời gian đã trôi qua: " + result.getElapsedTime() + " milliseconds");
    }
}
