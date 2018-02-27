package app.design.textdrawable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.widget.ImageView;

import com.text.drawable.TextDrawable;
import com.text.drawable.util.ColorGenerator;

public class MainActivity extends AppCompatActivity {
    ImageView rect,roundRect,circle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rect = findViewById(R.id.iv_rect);
        roundRect = findViewById(R.id.iv_rectround);
        circle = findViewById(R.id.iv_circle);

        TextDrawable drawable = TextDrawable.builder()
                .buildRect("A", ColorGenerator.MATERIAL.getRandomColor());
        rect.setImageDrawable(drawable);

        TextDrawable drawableround = TextDrawable.builder()
                .buildRoundRect("R", ColorGenerator.MATERIAL.getRandomColor(),12);
        roundRect.setImageDrawable(drawableround);

        TextDrawable drawablecircle = TextDrawable.builder()
                .buildRound("M", ColorGenerator.MATERIAL.getRandomColor());
//        circle.setImageDrawable(drawablecircle);


// declare the builder object once.
        TextDrawable.IBuilder builder = TextDrawable.builder()
                .beginConfig()
                .withBorder(4)
                .textColor(Color.BLACK)
                .useFont(Typeface.DEFAULT)
                .fontSize(30) /* size in px */
                .bold()
                .toUpperCase()
                .endConfig()
                .round();
        TextDrawable ic1 = builder.build("A", ColorGenerator.MATERIAL.getColor("R"));
        circle.setImageDrawable(ic1);

    }
}
