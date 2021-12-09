package sv.edu.usam.portal_notas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import org.imaginativeworld.whynotimagecarousel.ImageCarousel;
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {
   private List<CarouselItem> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ImageCarousel carousel = findViewById(R.id.carousel);
        list.add(new CarouselItem( "https://web-static.wrike.com/blog/content/uploads/2020/01/Five-Features-of-a-Good-Monthly-Employee-Work-Schedule-Template.jpg?av=718acbc1e2b21264368f12b5cc57c0e2"));
        list.add(new CarouselItem( "https://media-cldnry.s-nbcnews.com/image/upload/newscms/2019_36/2996516/190904-streamline-calendar-2x1-al-1332.jpg"));
list.add(new CarouselItem("https://www.incimages.com/uploaded_files/image/1920x1080/calendar-colorful-sticky-notes-1725x810_27935.jpg"));

carousel.addData(list);

    }

    public void  horarioActual(View view){
        startActivity(new Intent(getApplicationContext(),HorariosActuales.class));
        finish();
    }

    public void  alumnoInfo(View view){
        startActivity(new Intent(getApplicationContext(),AlumnoInfo.class));
        finish();
    }

    public void  horarioDisponible(View view){
        startActivity(new Intent(getApplicationContext(),HorariosDisponibles.class));
        finish();
    }
}