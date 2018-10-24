package org.sample;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

public class App implements EntryPoint {

    public void onModuleLoad() {
        Label personLabel = new Label();
        TextBox nameBox = new TextBox();
        nameBox.setTitle("Person name");
        nameBox.addChangeHandler(event -> {
            String name = nameBox.getValue();
            personLabel.setText(ImmutablePerson.builder().name(name).build().toString());
        });
        RootPanel.get().add(nameBox);
        RootPanel.get().add(personLabel);
    }
}
