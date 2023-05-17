import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;

public class Main {
    public static void main(String[] args) {
        OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);
        double batteryPercentage = osBean.getSystemCpuLoad() * 100;
        System.out.println("Kalan batarya yüzdesi: " + batteryPercentage + "%");
    }
}
