import java.time.ZonedDateTime;

/**
 * @author eklin
 * @create 2020-03-07 14:15
 */
public class T2 {

    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now();  // 默认时区
        System.out.println(zbj);

        //2020-03-07T14:17:06.083+08:00[Asia/Shanghai]
    }

}
