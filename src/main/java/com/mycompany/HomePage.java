package com.mycompany;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.apache.wicket.extensions.markup.html.form.palette.Palette;
import org.apache.wicket.extensions.markup.html.form.palette.theme.DefaultTheme;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.ChoiceRenderer;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.util.CollectionModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class HomePage extends WebPage {
    private static final long serialVersionUID = 1L;
    private Set<String> selectedGroups = new HashSet<String>();

    public HomePage(final PageParameters parameters) {
        super(parameters);

        add(new Label("version", getApplication().getFrameworkSettings().getVersion()));

        // TODO Add your page's components here
        IModel<User> userModel = Model.of(new User());

        Form<User> form = new Form<User>("form", new CompoundPropertyModel<>(userModel)) {
            private static final long serialVersionUID = 7386574182464992079L;

            @Override
            protected void onSubmit() {
                super.onSubmit();
                selectedGroups.size();
            }
        };

        Set<String> groupList = new HashSet<String>(Arrays.asList(new String[] { "g1", "g2", "g3" }));

        form.add(new Palette("groups", new CollectionModel<String>(selectedGroups),
                new CollectionModel<String>(groupList), new ChoiceRenderer("", ""), 10, false, true).add(new DefaultTheme()));

        add(form);
    }
}
