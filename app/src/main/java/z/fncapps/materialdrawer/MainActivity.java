package z.fncapps.materialdrawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import it.neokree.materialnavigationdrawer.MaterialNavigationDrawer;
import it.neokree.materialnavigationdrawer.elements.MaterialAccount;


public class MainActivity extends MaterialNavigationDrawer {

    @Override
    public void init(Bundle bundle) {

        //Adding sections
        this.addSection(newSection("Section_0", R.mipmap.ic_launcher, new Fragment()));
        this.addSubheader("Subheader");
        this.addSection(newSection("Section_1", R.mipmap.ic_launcher, new Fragment()));
        this.addSection(newSection("Section_2", R.mipmap.ic_launcher, new Fragment()));

        //Adding accounts
        MaterialAccount a1 = new MaterialAccount(this.getResources(),"Name","email@domain.com",R.mipmap.ic_launcher, R.mipmap.ic_launcher);
        this.addAccount(a1);

    }
}