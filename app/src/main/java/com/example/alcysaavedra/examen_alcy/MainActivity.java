package com.example.alcysaavedra.examen_alcy;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        /**MODO TABS EN ACTIONBAR**/
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);


        /**CREAR TABS**/
        ActionBar.Tab tab = actionBar.newTab()
                .setText("INICIO")
                .setTabListener(new TabsListener(
                        this, "INICIO", FragmentoInicio.class));
        actionBar.addTab(tab);

        tab = actionBar.newTab()
                .setText("PLATOS1")
                .setTabListener(new TabsListener(
                        this, "PLATOS1", FragmentoPlatos1.class));
        actionBar.addTab(tab);

        tab = actionBar.newTab()
                .setText("PLATOS2")
                .setTabListener(new TabsListener(
                        this, "PALTOS2", FragmentoPlatos2.class));
        actionBar.addTab(tab);


    }

    public class TabsListener  implements ActionBar.TabListener {

        private Fragment fragment;
        private final String tag;

        public TabsListener(Activity activity, String tag, Class cls) {
            this.tag = tag;
            fragment = Fragment.instantiate(activity, cls.getName());
        }

        public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
            ft.replace(android.R.id.content, fragment, tag);
        }

        public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
            ft.remove(fragment);
        }

        public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {


        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id) {
            case R.id.action_settings:
                return true;
            case R.id.action_setting:
                return true;
            case R.id.inicio:
                Intent main = new Intent(this, MainActivity.class);
                startActivity(main);
                return true;
            case R.id.opcion1:
                Intent opc1 = new Intent(this, Opcion1.class);
                startActivity(opc1);
                return true;
            case R.id.opcion2:
                Intent opc2 = new Intent(this, Opcion2.class);
                startActivity(opc2);
                return true;
            case R.id.opcion3:
                Intent opc3 = new Intent(this, Opcion3.class);
                startActivity(opc3);
                return true;
            case R.id.opcion4:
                Intent opc4 = new Intent(this, Opcion4.class);
                startActivity(opc4);
                return true;
            case R.id.opcion1a:
                Intent opc1a = new Intent(this, Opcion1a.class);
                startActivity(opc1a);
                return true;
            case R.id.opcion1b:
                Intent opc1b = new Intent(this, Opcion1b.class);
                startActivity(opc1b);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
