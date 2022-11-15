import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {

    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

//        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(ZoneId.of("America/New_York")); //用指定时区获取当前时间
//        System.out.println(zonedDateTime1);
    }

}
