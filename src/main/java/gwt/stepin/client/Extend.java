package gwt.stepin.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.user.client.ui.Button;

import java.awt.*;

/**
 * Created by Alexander on 15.03.2017.
 */
public class Extend implements EntryPoint {

    public void onModuleLoad() {

            // add button to change font to big when clicked.
            Button ColorButton = new Button("Click my");
        ColorButton.addClickHandler(new ClickHandler() {
                public void onClick(ClickEvent event) {
                    RootPanel.getBodyElement().getStyle().setBackgroundColor(RgbToHex());
                }
            });
        RootPanel.get("gwtColorButton").add(ColorButton);
    }

    public static String RgbToHex(){
        StringBuilder HeshColor = new StringBuilder();
        HeshColor.append('#');
        for(int i=0; i<3; i++ )
        {
            Integer RGB =0 + (int) (Math.random() * 256);
            if (RGB<10)
            {
                String Color = "0" + RGB.toString();
                HeshColor.append(Color).hashCode();
            }else
            {
                HeshColor.append(Integer.toHexString(RGB));
            }
        }
        return HeshColor.toString();
    }
}
