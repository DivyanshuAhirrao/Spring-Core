package diWithAnnotations.buildings;

import org.springframework.stereotype.Component;

@Component("comm")
public class Commercial implements Building{
    @Override
    public void getType() {
        System.out.println("Building Type is Commercial...");
    }
}
