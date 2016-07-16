package com.example.ee208887.mymaterialmotion;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.Visibility;
import android.view.View;

import com.example.ee208887.mymaterialmotion.databinding.ActivityTransition1Binding;

/**
 * Created by EE208887 on 16-07-2016.
 */
public class TransitionActivity1 extends BaseDetailActivity {

    private Sample sample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bindData();
        setupWindowAnimations();
        setupLayout();
        setupToolbar();
    }

    private void bindData() {
        ActivityTransition1Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_transition1);
        sample = (Sample) getIntent().getExtras().getSerializable(EXTRA_SAMPLE);
        binding.setTransition1Sample(sample);
    }

    private void setupWindowAnimations() {
        Visibility enterTransition = buildEnterTransition();
        getWindow().setEnterTransition(enterTransition);
    }

    private Visibility buildEnterTransition() {
        Fade enterTransition = new Fade();
        enterTransition.setDuration(getResources().getInteger(R.integer.anim_duration_long));
        // This view will not be affected by enter transition animation
        enterTransition.excludeTarget(R.id.square_red, true);
        return enterTransition;
    }


    private void setupLayout(){
        /*findViewById(R.id.sample1_button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(TransitionActivity1.this,TransitionActivity2.class);
                i.putExtra(EXTRA_SAMPLE,sample);
                transitionTo(i);
            }
        });*/
    }
}
