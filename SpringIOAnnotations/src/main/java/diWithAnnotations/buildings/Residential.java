package diWithAnnotations.buildings;

import org.springframework.stereotype.Component;

@Component("res")
public class Residential implements Building{
    @Override
    public void getType() {
        System.out.println("Building Type is Residential...");
    }
}
