package ru.daisybell.androidscenefrom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.ar.sceneform.rendering.ModelRenderable;
import com.google.ar.sceneform.rendering.ViewRenderable;
import com.google.ar.sceneform.ux.ArFragment;

public class MainActivity extends AppCompatActivity {
    
    ArFragment arFragment;
    private ModelRenderable bearRenderable,
                            catRenderable,
                            cowRenderable,
                            dogRenderable;
    ImageView bear, cat, cow, dog;
    
    View arrayView[];
    ViewRenderable name_animal;
    
    int selected = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        arFragment = (ArFragment)getSupportFragmentManager().findFragmentById(R.id.sceneform_ux_fragment);
        
        //View
        bear = (ImageView)findViewById(R.id.bear);
        cat = (ImageView)findViewById(R.id.cat);
        cow = (ImageView)findViewById(R.id.cow);
        dog = (ImageView)findViewById(R.id.dog);
        
        setArrayView();
        setClickListener();
    }

    private void setClickListener() {
    }

    private void setArrayView() {
        arrayView = new View[] {
                bear, cat ,cow, dog
        };
    }
}
