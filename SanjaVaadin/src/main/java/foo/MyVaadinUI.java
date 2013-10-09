package foo;

import javax.servlet.annotation.WebServlet;


import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.tapio.googlemaps.GoogleMap;
import com.vaadin.tapio.googlemaps.client.LatLon;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

@Theme("mytheme")
public class MyVaadinUI extends UI
{

  
    @Override
    protected void init(VaadinRequest request) {
        final VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        setContent(layout);
        
        Button button = new Button("Click Me");
       
        GoogleMap googleMap = new GoogleMap(new LatLon(-27.47101, 153.02429), 10.0, "");
        googleMap.setSizeFull();
        googleMap.setImmediate(true);
        googleMap.setMinZoom(4.0);  
        layout.addComponent(googleMap);
       layout.addComponent(button);
    }

}
